<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'second.jsp' starting page</title>
    
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
  
    <form action="second">
    <table border=1 style="width:600;height:30;top:30" align="center">
   <tr> <td><input type="checkbox"name="box" value="21">21.我很难做那种需要持续集中注意力的工作</td></tr>
   <tr> <td><input type="checkbox" name="box" value="22">22.我喜欢亲自动手制作一些东西，从中得到乐趣</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="23">23.我的动手能力很差</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="24">24.和不熟悉的人交谈对我来说毫不困难</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="25">25.和别人谈判时，我总是很容易放弃自己的观点 </td> </tr>
   <tr> <td><input type="checkbox" name="box" value="26">26.我很容易结识同性朋友</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="27">27.对于社会问题，我通常持中庸的态度</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="28">28.当我开始做一件事情后，即使碰到再多的困难，我也要执著地干下去</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="29">29.我是一个沉静而不易动感情的人</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="30">30.当我工作时，我喜欢避免干扰</td> </tr>
    <tr> <td><input type="checkbox"name="box" value="31">31.我的理想是当一名科学家</td></tr>
   <tr> <td><input type="checkbox" name="box" value="32">32.与言情小说相比，我更喜欢推理小说</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="33">33.有些人太霸道，有时明明知道他们是对的，也要和他们对着干</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="34">34.我爱幻想</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="35">35.我总是主动地向别人提出自己的建议 </td> </tr>
   <tr> <td><input type="checkbox" name="box" value="36">36.我喜欢使用榔头一类的工具</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="37">37.我乐于解除别人的痛苦</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="38">38.我更喜欢自己下了赌注的比赛或游戏</td> </tr>
   <tr> <td><input type="checkbox" name="box" value="39">39.我喜欢按部就班地完成要做的工作</td> </tr>
   <tr> <td><input type="checkbox" name="box"value="40">40.我希望能经常换不同的工作来做</td> </tr>
	  <tr> <td><input type="submit" value="下一页" ></td> </tr>
	</table>
    </form>
  </body>
</html>
