package com.example;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class TestInitParams extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
                                                throws IOException,ServletException{
//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("test init parameters<br>");
//
//        java.util.Enumeration e =getServletConfig().getInitParameterNames();
//        while (e.hasMoreElements()){
//            out.println("<br>param name = " +e.nextElement()+"<br>");
//        }
//
//        HttpSession session = request.getSession();
//
//        out.println("<html><body>");
//        out.println("<a href=\"" + response.encodeURL("/Tester.do") + "\">click me</a>");
//        out.println("</body></html>");
//
//
//       
//        out.println("main email is "+ getServletConfig().getInitParameter("mailEmail"));
//        out.println("<br>");
//        out.println("admin email is" + getServletConfig().getInitParameter("adminEmail"));

        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        out.println("<html><body>");
        out.println("<a href=\"" + response.encodeURL("/Beer-v1/Tester.do") + "\">click me</a>");


        out.println("</body></html>");
    }
}
