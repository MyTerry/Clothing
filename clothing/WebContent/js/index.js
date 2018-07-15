/* $(window).scroll(function(){
	  var s=$(window).scrollTop();
	  if(s<1120&&s>1115){
		  alert(0);
		  window.location.href="female";
	  }
});
 */
 
$(document).ready(function(){
			$(document).endlessScroll({
				bottomPixels: 2000,
				fireDelay: 10,
				callback: function(p){
					if(p==1){
						$.ajax({
							Type:"POST",
							url:"female",
							contentType:'application/json;charset=UTF-8',
							data:{name:encodeURI("女装")},
							dataType:"json",  
							async:false,
							success:function(data){
								for(var i in data){
									var str="<div class='col-md-6 imgspict'><input type='hidden' value='"+data[i].g_id+"'>" +   
											"<div class='thumbnail'>" +
											"<img src='/clothing/img/"+data[i].g_img+"' class='imgspict1' />" +
											"<div class='nav-head8-ps1'>"+data[i].g_describe+"</div>" +
											"<div class='shows-text1'>" +
											"<div class='caption shenglue-end1 col-md-9'>" +
											"<b style='color: #f10582; font-size: 28px;'>"+data[i].g_discount+"</b><m>&nbsp;</m>"+data[i].g_name+"" +
											"</div>" +
											"<div class='caption text-center kuang-he-top1'><div class='time-icon'></div><div>剩3天</div></div>" +
											"</div></div></div>";
									$("#nvzhuang").append(str);
									
								}
							}
						});
					}
					if(p==2){
						$.ajax({
							Type:"POST",
							url:"female",
							contentType:'application/json;charset=UTF-8',
							data:{name:encodeURI("母婴")},
							dataType:"json",  
							async:false,
							success:function(data){
								for(var i in data){
									var str="<div class='col-md-6 imgspict'><input type='hidden' value='"+data[i].g_id+"'>" +   
											"<div class='thumbnail'>" +
											"<img src='/clothing/img/"+data[i].g_img+"' class='imgspict1' />" +
											"<div class='nav-head8-ps1'>"+data[i].g_describe+"</div>" +
											"<div class='shows-text1'>" +
											"<div class='caption shenglue-end1 col-md-9'>" +
											"<b style='color: #f10582; font-size: 28px;'>"+data[i].g_discount+"</b><m>&nbsp;</m>"+data[i].g_name+"" +
											"</div>" +
											"<div class='caption text-center kuang-he-top1'><div class='time-icon'></div><div>剩3天</div></div>" +
											"</div></div></div>";
									$("#nvzhuang").append(str);
									
								}
							}
						});
					}
				}
		});

	});
 
$(function(){
    $(".qiehuan").mouseover(function(){
    var This=$(this);
    This.find(".shows-text1").hide();
    This.find(".shows-text2").show();
    })
    
    $(".qiehuan").mouseout(function(){
    var This=$(this);
    This.find(".shows-text1").show();
    This.find(".shows-text2").hide();
    })
    
    $(".imgspict").mouseenter(function(){
    var This=$(this);
    This.find(".imgspict1").css("opacity","0.4")
    This.find(".imgspict1").css("transition","opacity .5s");
    setTimeout(function(){
    	This.find(".imgspict1").css("opacity","1");
    	This.find(".imgspict1").css("transition","opacity .5s");
    },400);
    })
    $(".kpl-qie").mouseover(function(){
    	$(this).find(".kpl-qie1").hide();
    	$(this).find(".kpl-qie2").show();
    	setTimeout(".ims").css("background","red");
    })
    $(".kpl-qie").mouseout(function(){
    	$(this).find(".kpl-qie1").show();
    	$(this).find(".kpl-qie2").hide();
    })    
})



