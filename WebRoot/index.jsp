<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>基础信息管理</title>
    <script type="text/javascript"> 
	 function college() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 

	    document.getElementById("content").innerHTML="<iframe src='xyInfo.action'   height=100% width=100% frameborder=0></iframe>";

		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
	function profession() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 
	    document.getElementById("content").innerHTML="<iframe src='zyInfo.action'   height=100% width=100% frameborder=0></iframe>";

		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
	function classes() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 
	    document.getElementById("content").innerHTML="<iframe src='bjInfo.action'   height=100% width=100% frameborder=0></iframe>";
		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
	function course() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 

	    document.getElementById("content").innerHTML="<iframe src='kcInfo.action'   height=100% width=100% frameborder=0></iframe>";
		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
	    function guanli() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 
	    document.getElementById("chance").innerHTML="<iframe src='getList.action'   height=100% width=100%></iframe>";
		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
	</script>
  </head>
  
  <body>
  <div id="all">
  	
    <div id="FourButton" >
        <input type="button" value=学院  onclick="college()" style="background-color:#fff;
		color:#000; box-shadow:0px 1px 2px rgba(0,0,0,0.2);width: 250px;height: 30px; ">&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;
        <input type="button" value=专业  onclick="profession()" style="background-color:#fff;
		color:#000; box-shadow:0px 1px 2px rgba(0,0,0,0.2);width: 250px;height: 30px; margin-left: -58px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;&nbsp; &nbsp;
        <input type="button" value=班级  onclick="classes()"style="background-color:#fff;
		color:#000; box-shadow:0px 1px 2px rgba(0,0,0,0.2);width: 250px;height: 30px; margin-left: -58px">&nbsp;  &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="button" value=课程  onclick="course()"style="background-color:#fff;
		color:#000; box-shadow:0px 1px 2px rgba(0,0,0,0.2);width: 250px;height: 30px;margin-left: -58px ">
    </div>
    <div id="content">
    	
    </div>
  </div>
  </body>
 	<style type="text/css">
 	
  	#content{
		margin-top: 10px;
	}
	#FourButton{
		
	}
  </style>
</html>
