<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>信息学院专业页面</title>
	<script type="text/javascript">
		function wlwgc() 
		{ 	
	    	document.getElementById("profession").innerHTML="<iframe src='wlwgc.jsp'   height=100% width=100% frameborder=0></iframe>";
		}
		function w141() 
		{ 	
	    	document.getElementById("profession").innerHTML="<iframe src='getAllStuList'   height=100% width=100% frameborder=0></iframe>";
		}
		function w142() 
		{ 	
	    	document.getElementById("profession").innerHTML="<iframe src='wlwgc142.jsp'   height=100% width=100% frameborder=0></iframe>";
		}   
	</script>
  </head>
  
  <body >
    	<div id="nav">
    		<ul>
				<li><a href="javascript:void(0);"  onclick ="wlwgc()">物联网工程</a>
					<ul>
	                    <li><a href="javascript:void(0);"  onclick ="w141()">物联网工程141班</a></li>
	                    <li><a href="javascript:void(0);"  onclick ="w142()">物联网工程142班</a></li>
	                    <li><a href="javascript:void(0);"  onclick ="w141()">物联网工程151班</a></li>
	                    <li><a href="javascript:void(0);"  onclick ="w142()">物联网工程152班</a></li>
                    </ul>
				</li>
				<li><a href="javascript:void(0);"  onclick ="wlwgc()">电子信息工程</a></li>
				<li><a href="javascript:void(0);"  onclick ="wlwgc()">通信工程</a></li>
				<li><a href="javascript:void(0);"  onclick ="wlwgc()">数字媒体工程</a></li>
			</ul>
    	</div>
    	<div id="profession">
    	
    	</div>
  </body>
  <style type="text/css">
 		#nav{
 			width:90%;
 			height:35px;
 			border-radius:5px;
 			color:#ededed;
 		}
 		#nav ul
		{
			width:90%;
			height:35spx;
			list-style-type:none;
			margin:0 auto;
			padding:0;
			overflow:hidden;			
		}
		#nav ul li
		{
			display:inline;
			float:left;
		}
		#nav ul li a:link,a:visited
		{
			display:block;
			height:30px;
			width:150px;
			font-weight:bold;
			color:#FFFFFF;
			background-color:#bebebe;
			text-align:center;
			padding:4px;
			text-decoration:none;
			text-transform:uppercase;
		}
		#nav ul li a:hover,a:active
		{
			background-color:#337ab7;
		}
		#nav ul li ul {
			position:absolute;
			display:none;
		}
		#nav ul li ul li{
			float:none;
			width:154px;
			margin:0px;
		}
		#nav ul li ul li a{
		    border-right:none;
			background:none;
			border-top:1px dotted #ccc;
			width:154px;
		}
		#nav ul li:hover ul{ 
			display:block; 
		}
		#nav ul li ul li a:hover{
			background:#337ab7;
			width:154px;
			color:#fff;
		}
		
   </style>
</html>
