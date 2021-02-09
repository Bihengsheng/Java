
## XML：
	1. XML概念：Extensible Markup Language 可扩展标记语言

		1.XML 指可扩展标记语言（EXtensible Markup Language）。
		2.XML 是一种很像HTML的标记语言。	
		3.XML 的设计宗旨是传输数据，而不是显示数据。
		4.XML 标签没有被预定义。您需要自行定义标签。
		5.XML 被设计为具有自我描述性。
		6.XML 是 W3C 的推荐标准
		
		* xml与html的区别
			XML 不是 HTML 的替代。
			XML 和 HTML 为不同的目的而设计：
			XML 被设计用来传输和存储数据，其焦点是数据的内容。
			HTML 被设计用来显示数据，其焦点是数据的外观。
			HTML 旨在显示信息，而 XML 旨在传输信息。
			

		

	2. 语法：
		* 基本语法：
			1. XML 文档必须有根元素
			2. 所有的 XML 元素都必须有一个关闭标签
			3. XML 标签对大小写敏感
			4. XML 必须正确嵌套
			5. XML 属性值必须加引号
	
		
			* 实例：
				<?xml version='1.0' ?>
				<Students>
					<studen id='1'>
						<name>张三</name>
						<age>23</age>
						<sex>male</sex>
					</studen>
					
					<studen id='2'>
						<name>lisi</name>
						<age>24</age>
						<sex>female</sex>
					</studen>
				</Students>
				
		* 组成部分：
			1. 文档声明
				1. 格式：<?xml 属性列表 ?>
				2. 属性列表：
					* version：版本号
					* encoding：编码方式
					* standalone：是否独立
						* yes：不依赖其他文件
						* no：依赖其他文件
			2. XML 元素
				 * XML 元素指的是从（且包括）开始标签直到（且包括）结束标签的部分。
				 * 一个元素可以包含：
					1. 其他元素
					2. 文本
					3. 属性
					4. 或混合以上所有
				
				
		
			3. XML 命名规则
				1. 名称可以包含字母、数字以及其他的字符
				2. 名称不能以数字或者标点符号开始
				3. 名称不能以字母 xml（或者 XML、Xml 等等）开始
				4. 名称不能包含空格
				

			4. 属性：
				1. XML元素具有属性，类似 HTML。属性提供有关元素的额外信息。
				2. XML 属性必须加引号
				
				* 实例：
				<?xml version='1.0' ?>
				<Students>
					<studen id='1'>
						<name>张三</name>
						<age>23</age>
						<sex>male</sex>
					</studen>
					
					<studen id='2'>
						<name>lisi</name>
						<age>24</age>
						<sex>female</sex>
					</studen>
				</Students>

	

	
		* 约束：规定xml文档的书写规则
		
			* 分类：
				1. DTD:一种简单的约束技术
				2. Schema:一种复杂的约束技术


			* DTD：
				* 引入dtd文档到xml文档中
					* 内部dtd：将约束规则定义在xml文档中
					* 外部dtd：将约束的规则定义在外部的dtd文件中
						* 本地：<!DOCTYPE 根标签名 SYSTEM "dtd文件的位置">
						* 网络：<!DOCTYPE 根标签名 PUBLIC "dtd文件名字" "dtd文件的位置URL">


			* Schema:
				* 引入：
					1.填写xml文档的根元素
					2.引入xsi前缀.  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
					3.引入xsd文件命名空间.  xsi:schemaLocation="http://www.Bihengsheng.com/xml  student.xsd"
					4.为每一个xsd约束声明一个前缀,作为标识  xmlns="http://www.Bihengsheng.com/xml" 

				
	
	

	3. 解析：操作xml文档，将文档中的数据读取到内存中
		* 操作xml文档
			1. 解析(读取)：将文档中的数据读取到内存中
			2. 写入：将内存中的数据保存到xml文档中。持久化的存储

		* 解析xml的方式：
			1. DOM：将标记语言文档一次性加载进内存，在内存中形成一颗dom树
				* 优点：操作方便，可以对文档进行CRUD的所有操作
				* 缺点：占内存
			2. SAX：逐行读取，基于事件驱动
				* 优点：不占内存。
				* 缺点：只能读取，不能增删改


		
		* xml常见的解析器：
			1. JAXP：sun公司提供的解析器，支持dom和sax两种思想
			2. DOM4J：一款非常优秀的解析器
			3. Jsoup：jsoup 是一款Java 的HTML解析器，可直接解析某个URL地址、HTML文本内容。它提供了一套非常省力的API，可通过DOM，CSS以及类似于jQuery的操作方法来取出和操作数据。
			4. PULL：Android操作系统内置的解析器，sax方式的。

