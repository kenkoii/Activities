/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.login;

import com.example.model.UserBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class LoginServlet extends HttpServlet{
    public void init() throws ServletException{
        
    }
       
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
            throws ServletException, IOException{
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        UserBean userBean = new UserBean();
        boolean isUserValid = userBean.isUserValid(username,password);
        String link = (isUserValid)?"home.jsp":"index.html";
        RequestDispatcher view = request.getRequestDispatcher(link);
        view.forward(request,response);
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
