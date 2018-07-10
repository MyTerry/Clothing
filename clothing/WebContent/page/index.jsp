<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
hello word !

<form action="test" method="POST">
    <input type="submit"/>
</form>

<%-- ${value} --%>
<br/>--------------------
<c:forEach items="${value}" var="val">
	<c:forEach items="${val.goods_info}" var="item">
		<div>${item.g_name }</div>
		<div>${item.g_price }</div>
	</c:forEach>
   <%--  ${val.Goods_Info.g_name} --%>
</c:forEach>
</body>
</html>