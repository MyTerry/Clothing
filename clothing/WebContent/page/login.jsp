<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
商品名称${goods.g_name}<br/>
商品价格${goods.g_price}<br/>
图片地址${goods.getGoods_imgs().get(0).getGi_url()}

<form action="../text" method="POST">
   <input type="submit"/>
</form>
</body>
</html>