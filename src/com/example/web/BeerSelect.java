package com.example.web;

import com.example.model.BeerExpert;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Iterator;
import java.util.List;

public class BeerSelect extends HttpServlet{
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
                        throws IOException,ServletException{

        String c = request.getParameter("color");
        BeerExpert beerExpert= new BeerExpert();
        List result = beerExpert.getBrands(c);

//        response.setContentType("text/html");
//        PrintWriter out = response.getWriter();
//        out.println("Beer Selection Advide <br>");

//        Iterator it=res.iterator();
//        while (it.hasNext()){
//            out.println("<br>try: "+it.next());

        request.setAttribute("styles",result);

        RequestDispatcher view = request.getRequestDispatcher("result.jsp");

        view.forward(request,response);





    }
}
