<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'third.jsp' starting page</title>
    
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
   <form action="main" >
  
   <table border=1 style="width:600;height:30;top:30" align="center">
   <tr> <td><input type="checkbox"name="box" value="41">41.我总留有充裕的时间去赴约会</td></tr>
   <tr> <td><input type="checkbox" name="box" value="42">42.我喜欢阅读自然科学方面的书籍和杂志</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="43">43.如果掌握一门手艺并能以此为生，我会感到非常满意</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="44">44.我曾渴望当一名汽车司机</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="45">45.听别人谈“家中被盗”一类的事，很难引起我的同情</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="46">46.如果待遇相同，我宁愿当商品推销员，而不愿当图书管理员</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="47">47.我讨厌跟各类机械打交道</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="48">48.我小时候经常把玩具拆开，把里面看个究竟</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="49">49.当接受新任务后，我喜欢以自己的独特方法去完成它</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="50">50.我有文艺方面的天赋</td> </tr>
    <tr> <td><input type="checkbox"name="box" value="51">51.我喜欢把一切安排得整整齐齐、井井有条</td></tr>
   <tr> <td><input type="checkbox" name="box" value="52">52.我喜欢作一名教师</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="53">53.和一群人在一起的时候，我总想不出恰当的话来说</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="54">54.看情感影片时，我常禁不住眼圈红润</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="55">55.我讨厌学数学 </td> </tr>
   <tr> <td><input type="checkbox" name="box" value="56">56.在实验室里独自做实验会令我寂寞难耐</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="57">57.对于急躁、爱发脾气的人，我仍能以礼相待</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="58">58.遇到难解答的问题时，我常常放弃</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="59">59.大家公认我是一名勤劳踏实的、愿为大家服务的人</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="60">60.我喜欢在人事部门工作</td> </tr>
 	<tr> <td><input type="submit"  name="box" value="确定" align="middle"></td> </tr>
	</table>
	 </form>
  </body>
</html>
