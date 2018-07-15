var i=0;
$(function(){
	$("#btnleibie3>span").first().css("border","1px solid red").css("color","red")
	$("#btnleibie2>span").first().css("border","1px solid red").css("color","red")
	$("#kuang4-head>div").first().css("border","1px solid red").css("color","red")
	$("#kuang4-body>div").click(function(){
		i++;
		if(i%2!=0){
			$(this).eq(0).css("background-position","-24px 0");
		}
		if(i%2==0){
			$(this).eq(0).css("background-position","-48px 0");
		}
	})
})
