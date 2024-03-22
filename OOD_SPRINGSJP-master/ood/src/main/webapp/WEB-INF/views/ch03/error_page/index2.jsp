<%-- 
    Document   : index2
    Created on : 2024. 3. 15., 오후 4:05:24
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="show_error.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=devide-width, initial-scale=1.0">
        <title>page 지시어의 오류 관련 속성 미사용 예제</title>
    </head>
    <body>
        <%= 5 / 0 %>
    </body>
</html>
