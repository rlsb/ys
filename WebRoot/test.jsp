<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
      <div id="frame">
    		<img src="image/yunshi.png"/>
  			<center> <s:form  action="LoginAction"   method="post" > 		
			      <caption><h3>用户登陆</h3></caption>
	    			<s:textfield label="账号" size="20" name="login.username" cssStyle="width:220px;height:30px;"/>
	    			<s:password label="密码" name="login.password" type="text" cssStyle="width:220px;height:30px;"/>	
				 <tr>
				 	<td>
		         		<s:submit value="登录" align="center" cssStyle="height:30px;margin-top:20px;"/>
		       		</td>
		        </tr>
    	</s:form></center> 
     </div> 
  </body>
  <style type="text/css">
  	body{
	background-color:#adadad;
	font-family:"微软雅黑", arial;
	margin:0; padding:0;
	width: 100%;
	height:100%;
	}
	#frame{
		width:400px;
		height:350px;
		background-color:#fff;
		margin: 140px auto ;  
		box-shadow: 10px 10px 5px #777; 
	}
	#frame img{
		width:60px;
		height:60px;
		margin-top: 20px;
		margin-left:170px;		
	}	

  </style>
</html>
