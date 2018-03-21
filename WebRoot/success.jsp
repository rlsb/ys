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
     
    <title>管理员信息管理</title>
    <link rel="stylesheet" type="text/css" href="css/admin.css">
	<script type="text/javascript"> 

		function show(){
			var obj = document.getElementById("pic");
   			obj.style.cssText = "width:200px;height:250px;background-color:#fff;color:#000;box-shadow: 10px 10px 5px #888888;padding-top:20px;padding-left:20px;position:absolute;top:100px;";
            var x=event.clientX;
            var y=event.clientY;
            document.getElementById("pic").style.top=y+50;
            document.getElementById("pic").style.left=x+250;
            document.getElementById("pic").style.visibility="visible";
           
            var formDiv="<form action='glyaction' method='post'>";
            formDiv+="用户名: <input type='text' name='gly.username' /><br>";
            formDiv+="密码:    <input type='password' name='gly.password' /><br>";
           	formDiv+="所属学院:   <input type='text' name='gly.facultyName' /><br><br>";     
               formDiv+="<input type='submit' value='提交' /></form>";
            	   formDiv+="<input type='submit' value='取消' onclick='hide()' />";     
            document.getElementById("pic").innerHTML=formDiv;
        }
         function refreshTime() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 
	    document.getElementById("all").innerHTML="<iframe src='index.jsp' ></iframe>";
		//time.innerHTML = hello; //刷新div里面的内容 	
	} 
        function hide(){
            document.getElementById("pic").style.visibility="hidden";
        }
        function jichu() 
	{ 	//window.location.reload();
	    //var dateObj = new Date(); 
	    document.getElementById("chance").innerHTML="<iframe src='index.jsp'   height=100% width=100%></iframe>";
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
  
  <body bgcolor="ededed">
   	
    <div id="all">
    <div id="allcontent">
    <div id="left">
    		<img src="image/admin.png" >
    		<p>maomao</p>
       	<input type="text" name="gly.username" value="<s:property value="#gly.username"/>"/>
       	<input type="text" name="gly.password" value="<s:property value="#gly.password"/>"/>	
        <div id="top"> 
        	<div id="right">
        		<a href="school.jsp">返回首页</a>
            	<!-- <p onclick="admin()">admin</p> -->
            </div>
        </div>
      </div>
    <div id="content">
    <div id="ThreeButton" >
        <input type="button" value=基础信息管理   onclick="jichu()">&nbsp  &nbsp
        <input type="button" value=管理员管理     onclick="guanli()">&nbsp  &nbsp
        <input type="button" value=考勤时间段设置  onclick="">
    </div>
  	<div id="chance">
  		
  	 <!-- <input type="button" value="切换界面" onclick="refreshTime() "> -->
  		<input type="button" value="添加用户" onclick="show()"> 
		<div id="pic" style="border: 1;position: absolute;width: 200;height: 250; background:#00FF99;visibility: hidden">
		</div>
		<button><a href="glyInfo" id="aa">查询</a></button>
  	
         <s:form  action="selectAdmin"  method="post" >
		    <s:select   
		     		name="listName"       
		            label="选择查询方式"
		            list="list1"             
		            />		           
				<s:textfield name="adminName"></s:textfield>
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
	</div>
</div>
</div>
  </body>
  
  
</html>
