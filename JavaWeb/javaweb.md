# HTML

## HTML中的基础标签

**html是解释性语言，不是编译性语言**
**浏览器是容错的**

~~~html
1.
Html 页面中由一对标签组成<html>  </html>
<html>  开始标签
</html> 结束标签
~~~

~~~html
2.
title 网页的标题
~~~

~~~html
3.
可以在meta标签中设置编码格式  charset 设置编码格式
~~~

~~~html
4.
表示换行 br标签是一个单标签，单标签：开始标签和结束标签是同一个，斜杠放在单词后面
~~~

~~~html
5.
p表示段落标签
~~~

~~~html
6.
img 图片标签 
src 路径 
width height设置长宽  
alt显示提示
~~~

~~~html
7.
h1~h6 标题标签
~~~

~~~html
8.
列表标签
	ol：有序列表
		start 表示从*开始
		type 显示的类型 A，I，1
	ul：无序列表
		type disc（default），circle，square
~~~

~~~
9.
<b> </b>粗体
<i> </i>斜体
<u> </u>下划线
并且可以嵌套使用
~~~

~~~html
10.
	<sub> </sub>上标
	<sup> </sup>下标
	&lt; 小于
	&gt; 大于
	&le; 小于等于
	&ge; 大于等于
	&nbsu;空格
	剩下的可以百度太多了（html实体符号）
~~~

~~~html
11.
	<a> </a> 超链接
		href 超链接路径
		target
			_self 在本窗口打开
			_blank 在一个新的窗口打开
			_parent 在父窗口打开
			_top 在顶层窗口打开
~~~

~~~html
12. 
	<span> </span> 不换行标记符
~~~

~~~html
13.
	<div> </div> 层
~~~

~~~html
14.
 <table> </table> 表格
 <tr> 行
 rowspan 行合并
 <td> 列
 colspan 列合并
 <th> 表头列 居中加粗 
 
 table的属性（但是基本都已淘汰）
 align 对齐方式
 border 边框
 width 宽度
 cellspacing 间距
 cellpadding 填充
~~~

~~~html
15.
 <hr /> 直线
~~~

~~~html
16.
 <form> </form> 表单
 action 发送目的地
 method 提交方式
	post 隐藏
	get 地址栏明文显示
~~~

~~~html
17.
 每个都需要指定name
 <input type="text" name="nickName"/> text 表示文本框 其中属性name必须要指定，否则这个文本框的数据将来是不会发送给服务器的
 <input type="password" /> 表示密码框 password
 <input type="radio" name="gender" value="woman"/> radio 单选框 传递的时候需要指定值  value 指定值 单选框是根据name来确定的，name相同既是一个单选框了 checked="checked" 或者checked 默认选中
 <input type="submit" value=" 注 册 "/> submit 提交按钮
 <input type="reset" value="重置"/> reset 重置按钮
 <input type="button" value="这是一个普通按钮"/>button 普通按钮
~~~

~~~html
18.
 <select> </select>下拉列表
 <option> </option>下拉列表选项
	selected="selected" 或者 selected 默认选择
	value 发送到服务器的值
~~~

~~~html
19.
 <textarea> </textarea>多行文本框
~~~

# CSS

## [CSS 参考手册 (w3school.com.cn)](https://www.w3school.com.cn/cssref/index.asp)

~~~html
1.基本使用
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>CSS学习</title>
		<!-- 内部样式表 -->
		<style type="text/css">
		/* 
			这里被style标签包围的范围是CSS环境，可以写CSS代码
		 */
		/* 标签样式表 */
		p{
			color: red;
		}
		/* 类样式 */
		.f20{
			font-size: 20px;
		}
		/* ID样式 ID属性尽量唯一（虽然重复也不会报错） */
/* 		#p4{
			background-color: aqua;
			font-size: 24px;
			font-weight: bolder;
			font-style: italic;	
			font-family: "宋体";
			} */
		/* 组合样式表 */
/* 		div p{
			color: pink;
		}
		div .f32{
			font-size: 32px;
			font-family: "黑体";
		} */
		</style>
		<!-- 引用外部的样式表 -->
		<link rel="stylesheet" href="CSS/Demo7.css">
	</head>
	<body>
<!-- 		<p><font color="red">这里是段落一</font></p>
		<p><font color="red">这里是段落二</font></p> -->
		<p>这里是段落一</p>
		<p>这里是段落二</p>
		<p class="f20">这里是段落三</p>
		<p id="p4">这里是段落四</p>
		<div>
			<!-- 内部样式表 -->
			<p><span style="font-size: 60px; font-weight: bolder;color: yellow;">HELLO</span></p>
			
			<span class="f32">World</span>
			<p class="f32">!!!!</p>
		</div>
	</body>
</html>
<!-- 
1. 
 为什么需要CSS？
 样式的书写和代码的利用率
2.
 CSS最基本的分类：
	1）样式标签表
	2）类样式表
	3）ID样式表
 高级的还有组合样式表
3.
 CSS从位置上的分类
	1）嵌入式样式表
	2）内部样式表
	3）外部样式表
 
 -->
~~~

~~~html
2.盒子模型
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>CSS盒子模型</title>
		<style type="text/css">
			#div1{
				width: 400px;
				height: 400px;
				background-color: aquamarine;
				
				/* border 边框样式属性*/
				
				/* 边框粗细*/
				border-width: 3px;
				
				/* 边框样式  solid（实线） dotted（点状线）……*/
				border-style: dotted;
				
				/* 边框颜色 */
				border-color: skyblue;
				
				/* 可以合并到一起 */
				/* border: 4px double skyblue; */
				
				/* 也可以分别设置 */
				/* border-top: 4px double skyblue; */
				
				
			}
			#div2{
				width: 200px;
				height: 200px;
				background-color: pink;
				
				/* margin */
				/* margin-top: 100px; */
				/* margin-left: 100px; */
				
				/* 上右下左 */
				margin: 100px;
			}
			#div3{
				width: 100px;
				height: 100px;
				background-color: azure;
				
				/* 填充 */
				padding-top: 50px;
				padding-left: 50px;
			}
			#div4{
				width: 400px;
				height: 400px;
				background-color: aquamarine;
			}
			body{
				margin: 0;
				padding: 0;
				border: 0;
			}
		</style>
	</head>
	<body>
		<div id="div1">
			<div id="div2">
				<div id="div3"></div>
			</div>
		</div>
		<div id="div2"></div>
	</body>
</html>
<!-- 
IE浏览器：我们看到的实际尺寸就是=width
 Chrome：实际尺寸width+border+padding
 
 CSS盒子模型
 1.border 边框
 2.margin 间距
 3.padding 填充
 
 
 -->
~~~

~~~html
3.
<!-- <!DOCTYPE html> -->
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style type="text/css">
			body{
				padding: 0;
				margin: 0;
			}
			div{
				position: relative;
			}
			#div_top{
				height:20%;
				background-color: aqua;
			}
			#div_left{
				background-color: beige;
				height: 80%;
				width: 15%;
				float: left;
			}
			#div_main{
				background-color: aliceblue;
				float: left;
				height: 70%;
				width: 85%
			}
			#div_bottom{
				background-color: blanchedalmond;
				float: left;
				height: 10%;
				width: 85%;
			}
			#div_container{
				width: 80%;
				height: 100%;
				border: 0px solid blue;
				margin-left: 10%;
				float: left;
			}
		</style>
	</head>
	<body>
		<div id="div_container">
			<div id="div_top">div_top</div>
			<div id="div_left">div_left</div>
			<div id="div_main">div_main</div>
			<div id="div_bottom">div_bottom</div>
		</div>
	</body>
</html>
<!-- 
	
 -->
~~~

## Demo

~~~html
<!-- <!DOCTYPE html> -->
<html>
	<head>
		<meta charset="utf-8">
		<title>水果库存界面</title>
		<link rel="stylesheet" href="CSS/Demo11.css"/>
	</head>
	<body>
		<div id="div1">
			<div id="div_fruit_list">
				<table id="tbl_fruit">
					<tr>
						<th>名称</th>
						<th>单价</th>
						<th>数量</th>
						<th>小计</th>
						<th>操作</th>
					</tr>
					<tr>
						<td>苹果</td>
						<td>5</td>
						<td>20</td>
						<td>100</td>
						<td><img class="deleteimg" src="../img/delete.png"></td>
					</tr>
					<tr>
						<td>西瓜</td>
						<td>3</td>
						<td>20</td>
						<td>60</td>
						<td><img class="deleteimg" src="../img/delete.png"></td>
					</tr>
					<tr>
						<td>菠萝</td>
						<td>4</td>
						<td>25</td>
						<td>100</td>
						<td><img class="deleteimg" src="../img/delete.png"></td>
					</tr>
					<tr>
						<td>榴莲</td>
						<td>15</td>
						<td>10</td>
						<td>150</td>
						<td><img class="deleteimg" src="../img/delete.png"></td>
					</tr>
					<tr>
						<td>总计</td>
						<td colspan="4">999</td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>
~~~

~~~css
body{
	margin: 0;
	padding: 0;
}
div{
	position: relative;
	float: left;
	text-align: center;
}
table{
}
#div1{
	width: 80%;
	height: 100%;
	border: 0px solid blue;
	margin-left: 10%;
	float: left;
	background-color: lightgreen;
}
#tbl_fruit , #tbl_fruit th,#tbl_fruit tr,#tbl_fruit td{
	margin-top: 120px;
	border: 1px solid gray;
	width: 100%;
	table-layout:fixed;
	/* 文字居中 */
	text-align: center;
	/* 单元格的边界合并 */
	border-collapse: collapse;
	line-height: 28px;
	font-size: 16px;
	font-family: "宋体";
	font-weight: lighter;
	color: midnightblue;
}
.deleteimg{
	width: 24px;
	height: 24px;
}
~~~

