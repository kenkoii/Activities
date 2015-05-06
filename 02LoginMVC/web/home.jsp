<%-- 
    Document   : home.jsp
    Created on : May 6, 2015, 3:39:07 PM
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
        Home | <a href="profile.jsp">Profile</a><br/>        
        <h1>Logged in as <%=session.getAttribute("username")%>!</h1>
    </body>
</html>
