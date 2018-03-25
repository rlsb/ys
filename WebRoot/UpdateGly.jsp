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
    
    <title>修改页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body >
  <div id="text">
  		<s:set name="gly" value="#request.glyInfo"></s:set>
    	<s:form action="updateGly1" method="post" enctype="multipart/form-data">
    	<table border="0" cellspacing="1" cellpadding="8" width="500">
    		<tr>
    			<td width="80">用户名：</td>
    			<td>
    				<input type="text" name="gly.username" value="<s:property value="#gly.username"/>"readonly/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80">密码：</td>
    			<td>
    				<input type="password" name="gly.password" value="<s:property value="#gly.password"/>"/>
    			</td>
    		</tr>
    		<tr>
    			<td width="80">所属学院：</td>
    			<td>
    				<input type="text" name="gly.facultyName" value="<s:property value="#gly.facultyName"/>"/>
    			</td>
    		</tr>
    	</table>
    	<input type="submit" value="修改" />
    	<!-- 返回上一页 -->
    	<input type="button" value="返回" onclick="javascript:history.back();"/>
    </s:form>
  </div>
    
  </body>
  
  <style type="text/css">
  body{
	background-color:#adadad;
	font-family:"微软雅黑", arial;
	font-size:20px;
	margin:0; 
	padding:0;
	width: 100%;
	height:100%;
	}
 	#text{
		width:320px;
		height:200px;
		background-color:#fff;
		margin: 140px auto ;  
		box-shadow: 10px 10px 5px #777; 
		text-align:center;
	}
	
  </style>
</html>
