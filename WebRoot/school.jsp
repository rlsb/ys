<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>浙江树人大学</title>
	<link href="http://cdn.bootcss.com/bootstrap/3.3.4/css/bootstrap.css" rel="stylesheet">
    <script src="http://cdn.bootcss.com/jquery/1.10.2/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/school.css">
	<script type="text/javascript"> 
	    function admin() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 
	    document.getElementById("context").innerHTML="<iframe src='getList.action'   height=100% width=100%></iframe>";
		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
	</script>
  </head>
  
  <body>
    <div id="all">
    	<div id="left">
    		<img src="image/school.png" >
    		<p>浙江树人大学</p>
    		<nav class="navbar navbar-default" role="navigation" >
            <div class="navbar-header" >
                <a class="navbar-brand" href="#" data-toggle="dropdown">信息科技学院</a>
                <ul class="dropdown-menu">
                    <li><a href="#">专业</a>
                    </li>
                    <li class="grade"></li>
                    <li><a href="#">年级</a>
                    </li>
                    <li class="teacher"></li>
                    <li><a href="#">教师和课程</a>
                    </li>
                </ul>
            </div>
        </nav> 
       
        <div id="context" ></div>
    	</div>
    	
    		<div id="top"> 
    		<s:property value="#gly.username"/>
            	<a href="glyInfo"><img src="image/admin.png" ></a>
            	
 					
            	<!-- <p onclick="admin()">admin</p> -->
            </div>
    </div>
  </body>
</html>
