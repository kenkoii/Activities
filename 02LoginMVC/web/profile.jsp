<%-- 
    Document   : profile
    Created on : May 6, 2015, 4:04:31 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="home.jsp">Home</a> | Profile<br/>        
        <h1>Logged in as <%=session.getAttribute("username")%>!</h1>
    </body>
</html>
