package org.scoula.dynamicweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<html><body>");
        out.print("");
        out.print("ResponseServlet 요청 성공");
        out.print("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
