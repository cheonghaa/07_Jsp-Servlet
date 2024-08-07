package org.scoula.frontcontroller.controller;

import org.scoula.frontcontroller.command.Command;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;



public class DispatcherServlet extends HttpServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";


    public void init(){
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        createMap(getMap, postMap);

    }

    protected void createMap(Map<String, Command> map, Map<String, Command> postMap){


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);

        Command command;
        if(request.getMethod().equalsIgnoreCase("GET")) {
            command = getMap.get(commandName);
        } else {
            command = postMap.get(commandName);
        }
        return command;
    }

    public void execute(Command command, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewName = command.execute(request, response);

        if(viewName.startsWith("redirect: ")) { //redirect 처리
            response.sendRedirect(viewName.substring("redirect: ".length()));
        } else { //forward 처리
            String view = prefix + viewName + suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Command command = getCommand(request);
        if (command != null) {
            execute(command, request, response);
        } else { // 404 에러 처리
            String view = prefix + "404" +suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }
    }

}

