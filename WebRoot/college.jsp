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
    
    <title>专业</title>
    
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
   	<div id="all">
   			<s:form  action="proAdmin"  method="post" >
		    <s:select   
		     		name="listName1"       
		            label="选择查询方式"
		            list="list2"             
		            />		           
				<s:textfield name="proName"></s:textfield>
		  		<s:submit value="确定"/>
		   </s:form> 
		   <div id="form">
			<table border="1" cellpadding="8" cellspacing="1" width="700">
				<tr align="center" bgcolor="silver">
					<th>账号</th><th>所属学院</th><th>密码</th><th>操作</th><th>操作</th>
				</tr>
				<s:iterator value="#request.list" id="gly">
					<tr>
						<td><s:property value="#gly.username"/></td>
						<td><s:property value="#gly.facultyName"/></td>
						<td><s:property value="#gly.password"/></td>
						<td><a href="deleteGly.action?gly.username=<s:property value ="#gly.username"/>" 
							onClick="if(!confirm('确定删除该生信息吗？'))return false;else return true;">删除</a></td>
						<td><a href="updateGlyView.action?gly.username=<s:property value="#gly.username"/>">修改</a></td>
					</tr>
				</s:iterator>
				<tr>
					<s:set name="page" value="#request.page"></s:set>
					<s:if test="#page.hasFirst">
						<s:a href="glyInfo.action?pageNow=1">首页</s:a>
					</s:if>
					<s:if test="#page.hasPre">
						<a href="glyInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
					</s:if>
					<s:if test="#page.hasNext">
						<a href="glyInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
					</s:if>
					<s:if test="#page.hasLast">
						<a href="glyInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
					</s:if>
				</tr>
			</table>
		</div>
   	</div>
  </body>
</html>
