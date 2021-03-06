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
    
    <title>班级</title>
    
	<script type="text/javascript"> 

		function show(){
			var obj = document.getElementById("pic");
   			obj.style.cssText = "width:200px;height:250px;background-color:#fff;color:#000;box-shadow: 10px 10px 5px #888888;padding-top:20px;padding-left:20px;position:absolute;top:100px;";
            var x=event.clientX;
            var y=event.clientY;
            document.getElementById("pic").style.top=y+50;
            document.getElementById("pic").style.left=x+250;
            document.getElementById("pic").style.visibility="visible";
           
            var formDiv="<form action='bjaction' method='post'>";
            formDiv+="班级编号: <input type='text' name='bj.classid' /><br>";
            formDiv+="班级名称:    <input type='text' name='bj.classname' /><br>";
           	formDiv+="所属专业编号:   <input type='text' name='bj.professionid' /><br>";   
           	formDiv+="所属年级:   <input type='text' name='bj.gradename' /><br><br>";   
               formDiv+="<input type='submit' value='提交' /></form>";
            	   formDiv+="<input type='submit' value='取消' onclick='hide()' />";     
            document.getElementById("pic").innerHTML=formDiv;
        }
		function hide(){
            document.getElementById("pic").style.visibility="hidden";
        }
	</script>

  </head>
  
  <body>
   	<div id="all">
   	<input type="button" value="添加用户" onclick="show()" style="background-color:#2cc2fa;
		color:#fff; box-shadow:0px 1px 2px rgba(0,0,0,0.2);width: 100px;height: 25px"> 
		<div id="pic" style="border: 1;position: absolute;width: 200px;height: 280px; background:#00FF99;visibility: hidden">
		</div>
   			<s:form  action="classAdmin"  method="post" >
		    <s:select   
		     		name="listName1"       
		            label="选择查询方式"
		            list="list2"             
		            />		           
				<s:textfield name="markclassName"></s:textfield>
		  		<s:submit value="确定"/>
		   </s:form>
		   
		   <div id="form">
			<table border="1" cellpadding="8" cellspacing="1" width="1000">
				<tr align="center" bgcolor="#F9F9F9">
					<th>班级编号<th>班级名称</th><th>所属专业编号</th><th>所属年级名称</th><th>操作</th><th>操作</th>
				</tr>
				<s:iterator value="#request.list" id="bj">
					<tr>
						<td><s:property value="#bj.classid"/></td>
						<td><s:property value="#bj.classname"/></td>
						<td><s:property value="#bj.professionid"/></td>
						<td><s:property value="#bj.gradename"/></td>
						<td><a href="deleteBj.action?bj.classid=<s:property value ="#bj.classid"/>" 
							onClick="if(!confirm('确定删除该条信息吗？'))return false;else return true;">删除</a></td>
						<td><a href="updateBjView.action?bj.classid=<s:property value="#bj.classid"/>">修改</a></td>
					</tr>
				</s:iterator>
				<tr>
					<s:set name="page" value="#request.page"></s:set>
					<s:if test="#page.hasFirst">
						<s:a href="bjInfo.action?pageNow=1">首页</s:a>
					</s:if>
					<s:if test="#page.hasPre">
						<a href="bjInfo.action?pageNow=<s:property value="#page.pageNow-1"/>">上一页</a>
					</s:if>
					<s:if test="#page.hasNext">
						<a href="bjInfo.action?pageNow=<s:property value="#page.pageNow+1"/>">下一页</a>
					</s:if>
					<s:if test="#page.hasLast">
						<a href="bjInfo.action?pageNow=<s:property value="#page.totalPage"/>">尾页</a>
					</s:if>
				</tr>
			</table>
		</div>
   	</div>
  </body>
    <style type="text/css">
 
  	#form{
  		
  		width:1000px;
  		height:auto;
  		box-shadow: 10px 10px 5px #888888;
  	}
  	#form table,th,tr{
		border: 1px solid #DDDDDD;	
		text-align: center;
	}
	#classAdmin{
		text-decoration: none;
    	margin-left: 120px;
    	margin-top: -25px;
	}
	#classAdmin_listName1{
		margin-left: -180px;
	}
	#classAdmin_markclassName{
		float: right;
    	margin-left: 135px;
    	margin-top: -25px;
	}
	#classAdmin_0{
		height:21px;
		float: right;
    	margin-left: 180px;
    	margin-top: -29px;
    	background-color: #2cc2fa;
    	color: #fff;
	}
	
  </style>
</html>
