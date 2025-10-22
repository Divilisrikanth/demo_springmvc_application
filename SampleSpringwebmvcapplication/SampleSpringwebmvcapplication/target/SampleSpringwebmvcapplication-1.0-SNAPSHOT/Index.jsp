<%-- 
    Document   : Index
    Created on : Sep 13, 2025, 6:56:41 PM
    Author     : saibhagawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="get" action="${pageContext.request.contextPath}/deposit">
            <button>Submit</button>
        </form>
            <form method="get" action="${pageContext.request.contextPath}/withdrawl">
                <button>Submit</button>
            </form>  
             
    </body>
</html>
