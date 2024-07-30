package org.scoula.ex04;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/response_redirect")
public class ResponseRedirectServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = (String) request.getAttribute("username");
            String useraddress = (String) request.getAttribute("useraddress");

            request.setAttribute("username", username);
            request.setAttribute("useraddress", useraddress);

            RequestDispatcher dis = request.getRequestDispatcher("response_redirect.jsp");
            dis.forward(request, response);

    }
}
