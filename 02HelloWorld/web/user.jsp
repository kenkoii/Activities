<%-- 
    Document   : user
    Created on : May 6, 2015, 3:02:06 PM
    Author     : USER
--%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <%
                String type = request.getParameter("type");    
            %>
        <h1>
            Type: <%=type%>
        </h1>
    </body>
</html>

