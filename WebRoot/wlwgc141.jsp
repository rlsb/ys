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
     
    <title>物联网工程141</title>

  </head>
  
  <body>
   	 
    		<div id="form">
			<table border="1" cellpadding="8" cellspacing="1" width="700" >
				<tr align="center" bgcolor="#bebebe" style="color:#fff">
					<th>学号</th><th>姓名</th><th>性别</th><th>班级编号</th>
				</tr>
				<s:iterator value="#request.list" id="xs">
					<tr>
						<td><s:property value="#xs.studentid"/></td>
						<td><s:property value="#xs.studentname"/></td>
						<td><s:property value="#xs.sex"/></td>
						<td><s:property value="#xs.classid"/></td>
					</tr>
				</s:iterator>
				<tr>
					<s:set name="page" value="#request.page"></s:set>
					<s:if test="#page.hasFirst">
						<s:a href="xsInfo.action?pageNow=1">首页</s:a>
					</s:if>
					<s:if test="#page.hasPre">
						<a href="xsInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
					</s:if>
					<s:if test="#page.hasNext">
						<a href="xsInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
					</s:if>
					<s:if test="#page.hasLast">
						<a href="xsInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
					</s:if>
				</tr>
			</table>
		</div>
  </body>
 <style type="text/css">
 	table{
 		margin-top:40px;
 		margin-left:50px;
 		border-collapse: collapse;
 		table-layout:fixed;
        empty-cells:show; 
 	}
 </style>
  
</html>
