/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.model.UserBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USER
 */
public class LogoutServlet extends HttpServlet{
    public void init() throws ServletException{
        
    }
       
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        
        request.getSession().invalidate();
        response.sendRedirect("index.html");
    }
    
    protected void doGet(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        processRequest(request,response);
    }
    
    protected void doPost(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        doGet(request, response);
    }
}
