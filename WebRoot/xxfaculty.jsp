<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>信息学院界面</title>
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
			        text: '信息科技学院学生签到情况',
			        left: 'center',
			        top: 20,
			        textStyle: {
			            color: '#000'
			        }
			    },
				    xAxis: {
				        type: 'category',
				        data: ['物联网工程', '电子工程', '数字媒体工程', '计算机工程', '电子商务工程']
				    },
				    yAxis: {
				        type: 'value'
				    },
				    series: [{
				        data: [820, 932, 901, 934, 1290],
				        type: 'line'
				    }]
				};
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
		</script>
  </body>
 	
</html>
