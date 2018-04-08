<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@	taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>浙江树人大学</title>
	 <script src="js/adapter.js"></script> <!--rem适配js -->
    <link rel="stylesheet" href="css/base.css"> <!--初始化文件 -->
    <link rel="stylesheet" href="css/menu.css"> <!--主样式-->
     <!-- <link rel="stylesheet" href="css/school.css"> -->
    <script src="js/menu.js"></script> <!--控制js-->
    
	<style type="text/css">
		body{
	margin:0;
	padding:0;
	background-color: #f0f2f5;
	font-family: "Microsoft YaHei";
	}

	#top{
	position:fixed;
	top:0;
	left:2.6rem;
	height: 0.6rem;
	right:0;
	background-color: #ffffff;
	}
	#right{
		position: fixed;
		right:1.5rem;
		top:0.15rem;
}
	#context{
		position: absolute;
		top: 0.7rem;
		left: 2.7rem;
		bottom: 0.1rem; 
		right: 0.1rem;
		background: #fff;
		}
		#main{
		width: 100%;
		height: 400px;
		}
	</style>
  </head>
  
  <body>
    <div id="menu">
    <!--隐藏菜单-->
    <div id="ensconce">
        <h2>
            <img src="images/show.png" alt="">
            国内各地景点
        </h2>
    </div>

    <!--显示菜单-->
    <div id="open">
        <div class="navH">
            	浙江树人大学
           <%--  <span><img class="obscure" src="images/obscure.png" alt=""></span> --%>
        </div>
        <div class="navBox">
            <ul>
                <li>
                    <h2 class="obtain">信息科技学院<i></i></h2>
                    <div class="secondary">
                        <h3 onclick="allqk()">总体情况</h3>
                        <h3>专业</h3>
                        <h3>年级</h3>
                        <h3>教师和课程</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">南京景点<i></i></h2>
                    <div class="secondary">
                        <h3>栖霞寺</h3>
                        <h3>夫子庙</h3>
                        <h3>海底世界</h3>
                        <h3>中山陵</h3>
                        <h3>乌衣巷</h3>
                        <h3>音乐台</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">上海景点<i></i></h2>
                    <div class="secondary">
                        <h3>东方明珠</h3>
                        <h3>外滩</h3>
                        <h3>豫园</h3>
                        <h3>文庙</h3>
                        <h3>世博园</h3>
                        <h3>田子坊</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">深圳景点<i></i></h2>
                    <div class="secondary">
                        <h3>华侨城</h3>
                        <h3>观澜湖</h3>
                        <h3>世界之窗</h3>
                        <h3>东门老街</h3>
                        <h3>七娘山</h3>
                        <h3>光明农场</h3>
                    </div>
                </li>
                <li>
                    <h2 class="obtain">广州景点<i></i></h2>
                    <div class="secondary">
                        <h3>白云山</h3>
                        <h3>长隆</h3>
                        <h3>黄花岗公园</h3>
                        <h3>中山纪念堂</h3>
                        <h3>华南植物园</h3>
                        <h3>南沙湿地公园</h3>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</div>
       
        <div id="context" >
        	
        	<div id="main">
        	</div>
        
        </div>
    	
    		<div id="top"> 
    			<a href="school.jsp">首页</a>
    			<div id="right">
            		<a href="glyInfo"><img src="image/admin.png" ></a>
 					<s:property value="#session.user.username" />	
            	<!-- <p onclick="admin()">admin</p> -->
            	</div>
            </div>
            <script type="text/javascript" src="js/echarts.js"></script>
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
