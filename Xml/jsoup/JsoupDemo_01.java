package Xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo_01 {
    public static void main(String[] args) throws IOException {
        // 获取Document对象，根据XML文档获取
        //  1、获取Student.xml的路径
        String path = JsoupDemo_01.class.getClassLoader().getResource("student.xml").getPath();
        //  2、解析xml文档
        Document document = Jsoup.parse(new File(path),"utf-8");
        //  3、获取元素对象
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        // 获取第一个Element对象
        Element element = elements.get(0);
        //  获取数据
        String name = element.text();
        System.out.println(name);
    }
}
