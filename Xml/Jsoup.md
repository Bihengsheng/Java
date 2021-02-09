* Jsoup：jsoup 是一款Java 的HTML解析器，可直接解析某个URL地址、HTML文本内容。它提供了一套非常省力的API，可通过DOM，CSS以及类似于jQuery的操作方法来取出和操作数据。
* 
			
		* 步骤：
			1. 导入jar包
			2. 获取Document对象
			3. 获取对应的标签Element对象
			4. 获取数据

			
		* 对象的使用：
			1. Jsoup：工具类，可以解析html或xml文档，返回Document
				* parse：解析html或xml文档，返回Document
					* parse​(File in, String charsetName)：解析xml或html文件的。
					* parse​(String html)：解析xml或html字符串
					* parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
			2. Document：文档对象。代表内存中的dom树
				* 获取Element对象
					* getElementById​(String id)：根据id属性值获取唯一的element对象
					* getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
					* getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
					* getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合
			3. Elements：元素Element对象的集合。可以当做 ArrayList<Element>来使用
			4. Element：元素对象
				1. 获取子元素对象
					* getElementById​(String id)：根据id属性值获取唯一的element对象
					* getElementsByTag​(String tagName)：根据标签名称获取元素对象集合
					* getElementsByAttribute​(String key)：根据属性名称获取元素对象集合
					* getElementsByAttributeValue​(String key, String value)：根据对应的属性名和属性值获取元素对象集合

				2. 获取属性值
					* String attr(String key)：根据属性名称获取属性值
				3. 获取文本内容
					* String text():获取文本内容
					* String html():获取标签体的所有内容(包括字标签的字符串内容)
			5. Node：节点对象
				* 是Document和Element的父类

			
		* 快捷查询方式：
			1. selector:选择器
				* 使用的方法：Elements	select​(String cssQuery)
					* 语法：参考Selector类中定义的语法
			2. XPath：XPath即为XML路径语言，它是一种用来确定XML（标准通用标记语言的子集）文档中某部分位置的语言
				* 使用Jsoup的Xpath需要额外导入jar包。
				* 查询w3cshool参考手册，使用xpath的语法完成查询