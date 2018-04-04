<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>物联网工程界面</title>
    <script src="https://cdn.bootcss.com/echarts/4.0.4/echarts.js"></script>
    
  </head> 
  <body >
        
    	<div id="main" style="width: 700px;height:400px; margin-left:150px;margin-top:50px;"></div>
       <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        	var myChart = echarts.init(document.getElementById('main'));
    		// 指定图表的配置项和数据
            var  option = {
		    title : {
		        text: '物联网工程学生应到和实到情况',
		    },
		    tooltip : {
		        trigger: 'axis'
		    },
		    legend: {
		        data:['应到','实到']
		    },
		    toolbox: {
		        show : true,
		        feature : {
		            dataView : {show: true, readOnly: false},
		            magicType : {show: true, type: ['line', 'bar']},
		            restore : {show: true},
		            saveAsImage : {show: true}
		        }
		    },
		    calculable : true,
		    xAxis : [
		        {
		            type : 'category',
		            data : ['物联网工程141','物联网工程142','物联网工程151','物联网工程152']
		        }
		    ],
		    yAxis : [
		        {
		            type : 'value'
		        }
		    ],
		    series : [
		        {
		            name:'应到',
		            type:'bar',
		            data:[300, 280, 580, 570],
		           
		        },
		        {
		            name:'实到',
		            type:'bar',
		            data:[260, 266, 500, 520],
		           
		        }
		    ]
		};
            // 使用刚指定的配置项和数据显示图表。
            myChart.setOption(option);
		</script>
  </body>
 	
</html>
