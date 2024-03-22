<%-- 
    Document   : index
    Created on : 2024. 3. 15., 오후 4:29:37
    Author     : Admin
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<!DOCTYPE html public "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Include Test 프로젝트</title>
</head>
<body>
<%@ include file="header.jspf" %>
본문이 들어갑니다.
<jsp:directive.include file="footer.jsp" />
    </body>
</html>
