<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>青鸟购物网</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/qnhomepage.css" />
        <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js" ></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/vue.js" ></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/index.js" charset="UTF-8"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.endless-scroll-1.3.js" ></script>
    </head>
    <body>
    	<!--左边导航条-->
    	
    	<div id="nav-left">
    		<span>223132</span>
    	</div>
    	<header id="header">
		    <div id="header_in">
		        <nav class="nav">
		            <a class="sep" href="">长沙市</a>
		            <a class="sep" href=""><img class="image" src="${pageContext.request.contextPath}/img/1.gif">签到有礼</a>
		            <a class="sep" href="">我的订单</a>
		            <a class="sep" href="">我的特卖</a>
		            <a class="sep" href="">会员俱乐部</a>
		            <a class="sep" href="">客户服务</a>
		            <a class="sep" href="">手机版</a>
		            <a class="sep" href="">更多</a>
		        </nav>
		        <nav id="h_nav">
		            <a class="sep" href="">登录</a>
		            <a class="sep" href="">注册</a>
		            <a class="sep" href="">消息通知</a>
		        </nav>
		        <div id="h_shop"><div id="h_shopCar">购物车(0)</div>
		            <div id="h_shop_in">购物车中还没有商品，赶紧选购吧！</div>
		        </div>
		
		    </div>
		</header>


    	<div id="nav-top1">
    		<div id="nav-head1">
    			<img src="${pageContext.request.contextPath}/img/logo.jpg"/>
    		</div>
    	</div>
    	<div id="nav-top2">
    		<div id="nav-head2">
    			<ul class="nav nav-pills nav-end2">
    				<li class="active1">首页</li>
    				<li>女装</li>
    				<li>母婴</li>
    				<li>美妆</li>
    				<li>国际</li>
    				<li>男装</li>
    				<li>居家</li>
    				<li>鞋包</li>
    				<li>运动</li>
    				<li>生活</li>
    				<li>更多</li>
    				<li>分类</li>
    				<li>预告</li>
    			</ul>
    		</div>
    	</div>
    	<div id="nav-top3">
    		<div id="nav-head3"> 
    			<img src="${pageContext.request.contextPath}/img/15312777380392.jpg" style="margin-top:35px; margin-left:-30px; width: 93%; height:263px" />

    			<div style="margin-top: 20px;">
    				<img src="${pageContext.request.contextPath}/img/15302663469275.jpg" width="100%" />
    		    </div>
    			<div id="imgshop">
    				<img src="${pageContext.request.contextPath}/img/15302663579972.png" width="25%" />
    				<img src="${pageContext.request.contextPath}/img/15302663686347.png" width="25%" />
    				<img src="${pageContext.request.contextPath}/img/15302663818086.png" width="25%" />
    			</div>
    			<div id="newsshop">
    				<img src="${pageContext.request.contextPath}/img/15302671583347.png" width="100%" />
    			</div>
    			<div>
    			    <div id="kuangtop"> 
    			         <img src="${pageContext.request.contextPath}/img/remenxiezi/15302664738781.png" width="15%" /> 
    			         <img src="${pageContext.request.contextPath}/img/remenxiezi/15302664864388.png" width="15%" /> 
    			         <img src="${pageContext.request.contextPath}/img/remenxiezi/15302664965731.png" width="15%" /> 
    			         <img src="${pageContext.request.contextPath}/img/remenxiezi/15302665068872.png" width="15%" /> 
    			         <img src="${pageContext.request.contextPath}/img/remenxiezi/15302665203207.png" width="15%" /> 
    			         <img src="${pageContext.request.contextPath}/img/remenxiezi/15302665310704.png" width="15%" />
    			         <div id="pinxing"></div>
    			         <div id="kuang"></div>

    			    </div>    			    
    			</div>
    		</div>
    	</div>
    	
    	<div id="nav-top7" style="margin-top: 40px;">
    		<div id="nav-head7">
    			<div class="row">

                  <c:forEach items="${value}" var="val">
                       <div class="col-md-6 kpl-qie">
                        <div class="thumbnail">
                          <c:forEach items="${val.goods_info}" var="text">
                              <img src="${pageContext.request.contextPath}/img/${text.g_img}" style="height:220px;"/>
                               <div class="jianjie-end kpl-qie1">
                                   <div>Marisfrolg</div>
                                   <b>${text.g_name}</b>
                             </div>
                          </c:forEach>
                             <div class="kpl-qie2" style="display: none;">
	                             <div class="jianjie-body">
	                                  <div><img src="${pageContext.request.contextPath}/img/newtemai/3fjfxjl9.bmp" /><b>¥123</b></div>
	                                  <div><img src="${pageContext.request.contextPath}/img/newtemai/3fjfxjl9.bmp" /><b>¥123</b></div>
	                                  <div><img src="${pageContext.request.contextPath}/img/newtemai/3fjfxjl9.bmp" /><b>¥123</b></div>
	                                  <hr /> 
	                                  <div id="jianjie-py">
	                                      <img src="${pageContext.request.contextPath}/img/newtemai/primary.png" />
	                                  </div>
	                             </div>
                             </div>
                        </div>
                     </div>
                  </c:forEach>
                  
              </div>
    		</div>
    	</div>
    	
    	<div id="nav-top8">
    		<div id="nav-head8">
    			<div id="nav-body8">
    				<img src="${pageContext.request.contextPath}/img/nvzhuangimg/woman_2ad.png"/>
    				<a>
    					全部女装品牌
    				</a>
    			</div>
               <div class="row" id="nvzhuang">
                    
               </div>
               
               <div style="border-top: 1px solid #e8e8e8;">
               	    <span id="nav-end">
                 	              逛更多女装品牌
                    </span>
               </div>
               
            </div>
       </div>
       
       
    	<div id="nav-top9">
    		<div id="nav-head9">
    			<div id="nav-body-9">
    				<img src="${pageContext.request.contextPath}/img/mingri/tomorrow.png" width="100%"/>
    			</div>
    			
    			
    			<div class="row">
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
	                                  </div>
	                             </div>
                             </div>
                        </div>
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
	                                  </div>
	                             </div>
                             </div>
                        </div>
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物	，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                   
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption  kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>

                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption kuang-he-top">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                  
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
                    <div class="col-md-3 qiehuan">
                        <div class="thumbnail">
                             <img src="${pageContext.request.contextPath}/img/mingri/4xatmuy6.bmp" />
                             <div class="shows-text1">
                                <div class="caption shenglue-end col-md-9">
	                                      0.9折起 发现好物，盛夏狂欢-德玛纳sadjkml;,d'mkasbhdksaml
	                             </div>
	                             <div class="caption text-center kuang-he-top">
	                                      <b>9</b> 折
	                             </div>
	                         </div>
	                         <div class="shows-text2" style="display: none;">
	                             <div class="caption">
	                                  <div class="displaytext">
		                                   <input type="text" placeholder="请输入你的手机号码" maxlength="11" />
		                                   
	                                  </div>
	                                 
	                             </div>
                             </div>
                        </div>
                        
                    </div>
        
                </div>
                <div id="btn-ends">
                     <span>查看更多预告档期</span>
                </div>
    		</div>
    	</div>
    	<div id="shop-nav-end">
    	     <div id="shop-nav-end-head">
    	     		<ul class="list-unstyled list-inline text-center">
    	     		   	<img src="${pageContext.request.contextPath}/img/img-end/footer_vip_iconsv_0705-hash-728f749a.png" id="img-end"/>
    	     		</ul>
    	     		<div id="baozhang-end">
	    	     		<div>
	    	     		     <ul>
	    	     		         <b>服务保障</b>
	    	     		         <li>正品保证</li>
	    	     		         <li>7天无理由放心退</li>
	    	     		         <li>退货返运费</li>
	    	     		         <li>7x15小时客户服务</li>
	    	     		         <li>7天无理由随心换</li>
	    	     		         <li class="list-unstyled"	>&nbsp;</li>
	    	     		     </ul>
	    	     		</div>
	    	     		<div>
	    	     		     <ul>
	    	     		         <b>购物指南</b>
	    	     		         <li>导购演示</li>
	    	     		         <li>订单操作</li>
	    	     		         <li>会员注册</li>
	    	     		         <li>账户管理</li>
	    	     		         <li>收货样品</li>
	    	     		         <li>会员等级</li>
	    	     		     </ul>
	    	     		</div>
	    	     		<div>
	    	     		     <ul>
	    	     		         <b>支付方式</b>
	    	     		         <li>快捷支付</li>
	    	     		         <li>23家主流网银支付</li>
	    	     		         <li>货到付款</li>
	    	     		         <li>支付宝、银联等支付</li>
	    	     		         <li>信用卡支付</li>
	    	     		         <li>零钱支付</li>
	    	     		     </ul>
	    	     		</div>
	    	     		<div>
	    	     		     <ul>
	    	     		         <b>配送方式</b>
	    	     		         <li>全场满288元免运费</li>
	    	     		         <li>配送范围及运费</li>
	    	     		         <li>验货与签收</li>
	    	     		         <li class="list-unstyled">&nbsp;</li>
	    	     		         <li class="list-unstyled">&nbsp;</li>
	    	     		         <li class="list-unstyled">&nbsp;</li>
	    	     		     </ul>
	    	     		</div>
	    	     		<div>
	    	     		     <ul>
	    	     		         <b>售后服务</b>
	    	     		         <li>退货政策</li>
	    	     		         <li>退货流程</li>
	    	     		         <li>退款方式和时效</li>
	    	     		         <li>换货服务</li>
	    	     		         <li class="list-unstyled">&nbsp;</li>
	    	     		         <li class="list-unstyled">&nbsp;</li>
	    	     		     </ul>
	    	     		</div>
	    	     		<div id="erweima-end">
	    	     		     <span class="col-lg-offset-3">唯品会APP二维码</span>
	    	     		     <img src="${pageContext.request.contextPath}/img/erweima/page_bottom_dl_n.png" class="col-lg-offset-3"/>
	    	     		     <br/>
	    	     		     <span class="col-lg-offset-3">下载唯品会移动APP</span>
	    	     		</div>
	        		</div>
	        		<div id="guanyu">
	        		     <div> <span>关于我们</span> | <span>About us</span>| <span>Investor Relations</span>| <span>媒体报道</span>| <span>品牌招商</span>| <span>隐私条款</span>| <span>唯品诚聘</span>| <span>365爱心基金</span>| <span>唯品卡</span>| <span>联系我们</span> </div>
	        		</div>
	        		<div id="guanyu1">
	        		     <div>Copyright © 2008-2018 vip.com，All Rights Reserved  使用本网站即表示接受<span>唯品会用户协议</span>。版权所有 <span>广州唯品会电子商务有限公司</span><br />
<span>粤公网安备 44010302111111号</span> <span>粤ICP备08114786号</span> <span>增值业务经营许可证：粤B2-20170777</span> <span>网络文化经营许可证：粤网文〔2015〕1528-229</span><br />
<span>自营主体经营证照</span> <span>风险监测信息</span>  <span>互联网药品交易服务资格证（粤C20140002）</span></div>
	        		</div>
	        		 <img src="${pageContext.request.contextPath}/img/poi756.png" title="银联特约商户" width="100%" />
	        		
	        		
    	     </div>
    	</div>
  
 	</body>
</html>