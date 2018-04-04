<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>浙江树人大学</title>
    <script src="https://cdn.bootcss.com/echarts/4.0.4/echarts.js"></script>
    
  </head> 
  <body >
        
    	<div id="main" style="width: 600px;height:400px;margin-left:150px;margin-top:50px;"></div>
       <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        	var myChart = echarts.init(document.getElementById('main'));
    		// 指定图表的配置项和数据
            var  option = {
            		title: {
			        text: '浙江树人大学学生签到情况',
			        left: 'center',
			        top: 20,
			        textStyle: {
			            color: '#000'
			        }
			    },
				    xAxis: {
				        type: 'category',
				        data: ['信息科技学院', '城建学院', '艺术学院', '生环学院', '家阳书院']
				    },
				    yAxis: {
				        type: 'value'
				    },
				    series: [{
				        data: [2320,1932, 1001, 1934, 900],
				        type: 'line'
				    }]
				};
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
		</script>
  </body>
 	<style type="text/css">
 		
  		
  		
   </style>
</html>
