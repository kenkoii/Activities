<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:04:31 PM
    Author     : USER
--%>

<%
    response.setHeader("Cache-Control","no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires",-1);
    if(!(session.getAttribute("username").equals(null))){
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="home.jsp">Home</a> | Profile | <a href="LogoutServlet">Logout</a><br/>       
        <h1>Logged in as <%=session.getAttribute("username")%>!</h1>
    </body>
</html>
<% } else response.sendRedirect("index.html"); %>
