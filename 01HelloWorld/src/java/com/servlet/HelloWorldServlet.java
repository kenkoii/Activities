/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class HelloWorldServlet extends HttpServlet{
    public void init() throws ServletException{
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException{
        String type = request.getParameter("type");
        
        String serv = (type.equals("admin"))?"/ProcessAdminServlet":"/ProcessUserServlet";
        RequestDispatcher rd = request.getRequestDispatcher(serv);
        rd.forward(request, response);
        
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
                    throws ServletException, IOException{
        doGet(request, response);
    }
    
    public void destroy(){
    
    }
}
