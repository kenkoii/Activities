/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class ProcessUserServlet extends HttpServlet{
    public void init() throws ServletException{
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException{
       
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String choice= request.getParameter("choice");
        String[] language= request.getParameterValues("language");
        PrintWriter out = response.getWriter();
        
        out.println("Type: user");
        out.println("<h1>" + "Hello " + name + "!</h1>");
        out.println("<h2>Are you sure you will graduate " + course + "course?</h2>");
        out.println("<h3>You need to learn the following languages:</h3>");
        out.println("<ul>");
        for(String lang: language)
            out.println("<li>"+lang);
        out.println("</ul>");
        if(choice.equals("Mayweather")){
            out.println("Money Mayweather!");
        }else{
            out.println("Pacman Pacquiao!");
        }
        
        
     
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException{
        doGet(request, response);
    }
    
    public void destroy(){
    
    }
}
