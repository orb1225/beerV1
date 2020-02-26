package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckCookie extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
                                                   throws IOException, ServletException{
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();

        Cookie[]cookies=request.getCookies();

        if(cookies != null){
            for(int i=0;i<cookies.length;i++){
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("name")){
                    String  name = cookie.getValue();
                    out.println("Hello"+name);
                    break;
                }
            }
        }



    }
}
