<%@page contentType="text/html; charset=UTF-8" %>
<html>
	<META content="text/html; charset=UTF-8" http-equiv="Content-Type">
	<head>
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/index.css">
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.1.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/main.js"></script>
		<script type="text/javascript">
		var i=1;
		var t;
		function change()  //åæ¢å¾çæ¹æ³
		{
			if(i==3)  //å¨è¿å¤å¯ä»¥æ¹å¨å¾çå¾ªç¯å å¼ 
			{
				i=1;
			}
			i++;
			document.getElementById("divimg").src="images/"+i+".jpg";
			t=setTimeout("change()",2000);
		}
		function stopimg() //åæ­¢æ¹æ³
		{
			clearTimeout(t);
		}
		function goon()  //åæ¬¡è¿è¡
		{
			change();
		}
		</script>
	</head>
	<body onload="change()">
	<!--å¤´é¨-->
		<div class="head">
			<div class="head_count">
			<div class="head_count_logo">
			    <img src="images/logo.png" width="624px" height="88px">
			</div>
			<div class="head_count_right">
				<div class="head_count_right_top">
					<table>
						<tr>
							<td>
								<a href="${pageContext.request.contextPath }/servlet/ComIntroServlet?operation=showAll">设为首页</a>
								<span> |</span>
								<a href="${pageContext.request.contextPath }/servlet/ComIntroServlet?operation=showOne">加入收藏</a>
								<span> | </span>
								<a href="">网站地图</a>
								<span> | </span>
								<a href="${pageContext.request.contextPath }/manager/login.jsp">管理员登录</a>
							</td>
						</tr>
					</table>
				</div>
				<div class="head_count_right_bottom">
					<table>
						<tr>
							<td style="width:336px;">
								<form style="float:right;">
									<input  type="text" name="txt" value="" style="width:127px;height:22px;" />
									<input  type="submit" name="search" value="搜索"  style="width:58px; height:22px;" />
								</form>
							</td>
						</tr>
					</table>
				</div>
			</div>
			</div>
		</div>
	<!--ç®å½-->
		<div class="menu"> 
			<div class="menu_count">
			  <ul class="menu_count_ul">
			  	<li><b><a href="#">首页</a></b></li>
			  	<li><img src="images/dh_fgx.gif" style="margin-left:20px;" /></li>
			  	<li><b><a href="next.jsp">公司介绍 </a></b>
			  		<ul class="menu_count_secondul1">
			  			<li><b><a href="next.php">公司简介</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">组织架构</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">企业文化</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">团队建设</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li style="margin-top:-5px;"><b><a href="next.php">大事记</a></b></li>
			  		</ul>
			  	</li>
			  	<li><img src="images/dh_fgx.gif" style="margin-left:20px;" /></li>
			  	<li><b><a href="next.php">新闻中心</a></b>
			  	    <ul class="menu_count_secondul2">
			  			<li><b><a href="next.php">公司新闻</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">地方动态</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">媒体新闻</a></b></li>
			  		</ul>
			  	</li>
			  	<li><img src="images/dh_fgx.gif" style="margin-left:20px;" /></li>
			  	<li><b><a href="next.php">产品服务</a></b>
			  		<ul class="menu_count_secondul3">
			  			<li><b><a href="next.php">家政服务</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">汽车维修</a></b></li>
			  			<hr width="89px" noshade="noshade" size="1" color="#eee" style="margin-left:-39px;" />
			  			<li><b><a href="next.php">便民维修</a></b></li>
			  		</ul>
			  	</li>
			  	<li><img src="images/dh_fgx.gif" style="margin-left:20px;" /></li>
			  	<li><b><a href="next.php">社区生活</a></b>
			  		<ul class="menu_count_secondul4">
			  			<li><b><a href="next.php">业主之家</a></b></li>
			  		</ul>
			  	</li>
			  	<li><img src="images/dh_fgx.gif" style="margin-left:20px;" /></li>
			  	<li><b><a href="next.php">加入庄勇</a></b>
			  		<ul class="menu_count_secondul5">
			  			<li><b><a href="next.php">招聘信息</a></b></li>
			  		</ul>
			  	</li>
			  	<li><img src="images/dh_fgx.gif" style="margin-left:20px;" /></li>
			  	<li><b><a href="next.php">议投诉建</a></b>
			  		<ul class="menu_count_secondul6">
			  			<li><b><a href="next.php">投诉电话</a></b></li>
			  		</ul>
			  	</li>
			  </ul>
			</div>
		</div>
		<div style="width:100%;height:15px;background:#eee;"></div>
	<!--ä¸­é´å¾çé¨åä»¥åéé¡¹å¡åæ¢é¨å-->
		<div class="main" style="background:#eee;">
			<div class="main_count">
				<div class="main_count_img">
					<img src="images/1.jpg" width="520px" height="244px" 
					  id="divimg" onmouseover="stopimg()" onmouseout="goon()">
				</div>
				<div class="main_count_news">
					<div class="main_count_news_menu" id="qiehuan_menu">
    					<ul>
      						<li><a href="#">公司新闻</a></li>
      						<li><a href="#">地方动态</a></li>
      						<li><a href="#">媒体新闻</a></li>
    					</ul>
  					</div>
  					<div id="qiehuan">
      					<div class="main_count_news_count">
        					
      					</div>
					    <div class="main_count_news_count" style="display:none;">
					      
					    </div>
				        <div class="main_count_news_count" style="display:none;">
					       
				        </div>
				    </div>
				    <span style="margin-left:320px; position:relative; top:-15px;">
				        	<a href="#" style="font-size:9pt;">æ´å¤+</a>
				    </span>
				</div>
			</div>
		</div>
		<div style="width:100%;height:15px;background:#eee;"></div>
	<!--ä¸é¨ä¸åéç¥å¬åé¨å-->
		<div class="notice">
			<div class="notice_count">
				<div class="notice_count_inform">
				   <div class="notice_count_menu">
				   		<b style="margin-left:20px; font-size:12pt; line-height:30px;">éç¥å¬å</b>
				   	</div>
					<ul style="border:1px solid black;">
						
					</ul>
				</div>
				<div class="notice_count_serverce">
					<div class="notice_count_menu">
						<b style="margin-left:20px; font-size:12pt; line-height:30px;">ä¾¿æ°æå¡</b>
					</div>
					<ul style="border:1px solid black;">
						<li style="margin-top:20px;">
							<input type="button" name="probut1" value="äº§åæå¡" style="width:100px;" />
							<input type="button" name="probut2" value="äº§åæå¡" style="width:100px;" />
						</li>
						<li style="margin-top:5px; margin-bottom:6px;">
							<input type="button" name="probut3" value="äº§åæå¡" style="width:100px;" />
							<input type="button" name="neibut" value="ç¤¾åºçæ´»" style="width:100px;" />
						</li>
						
					</ul>
				</div>
				<div class="notice_count_other">
					<div class="notice_count_menu">
						<b style="margin-left:20px; font-size:12pt; line-height:30px;">å¶ä»</b>
					</div>
					<ul style="border:1px solid black;">
						
					</ul>
				</div>
			</div>
		</div>
		<div class="bottom">
			<div class="bottom_count">
				<table>
					<tr>
						<td width="689px" height="52px">
							<span>çæææï¼è¥¿å®åºåç©ä¸ç®¡çæéå¬å¸</span>
							<span>çµè¯ï¼18591987101</span>
							<span>è¥¿å®å¸éå¡åºå´åä¸è¡8å·èæºªé½å¸è±å­</span>
						</td>
						<td width="145px" height="52px">
							<input  type="button" name="code" value="æ«æäºç»´ç " />
						</td>
						<td width="126px" height="52px">
							<select>
								<option>--åæé¾æ¥--</option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
								<option></option>
							</select>
						</td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>