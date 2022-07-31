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



