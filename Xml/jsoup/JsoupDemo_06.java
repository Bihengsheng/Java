package Xml.jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.util.List;

/*
*   selector选择器
* */
public class JsoupDemo_06 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        // 获取Document对象，根据XML文档获取
        //  1、获取Student.xml的路径
        String path = JsoupDemo_06.class.getClassLoader().getResource("student.xml").getPath();
        //  2、解析xml文档
        Document document = Jsoup.parse(new File(path),"utf-8");
        //  根据Document对象创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        //  结合XPath语法查询
        //  查询所有student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes){
            System.out.println(jxNode);
        }
    }
}
