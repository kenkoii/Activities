<%-- 
    Document   : home.jsp
    Created on : May 6, 2015, 3:39:07 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    response.setHeader("Cache-Control","no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires",-1);
    
    if(session.getAttribute("username")!=null){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Home | <a href="profile.jsp">Profile</a> | <a href="LogoutServlet">Logout</a><br/>       
        <h1>Logged in as <%=session.getAttribute("username")%>!</h1>
    </body>
</html>
      <% } else response.sendRedirect("index.html"); %>