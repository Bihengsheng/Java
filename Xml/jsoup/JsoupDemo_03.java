package Xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupDemo_03 {
    public static void main(String[] args) throws IOException {
        // 获取Document对象，根据XML文档获取
        //  1、获取Student.xml的路径
        String path = JsoupDemo_03.class.getClassLoader().getResource("student.xml").getPath();
        //  2、解析xml文档
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取元素对象了。
        //3.1获取所有student对象
        Elements elements = document.getElementsByTag("student");
        System.out.println(elements);

        System.out.println("-----------");


        //3.2 获取属性名为id的元素对象们
        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("-----------");
        //3.2获取 id属性值为1的元素对象
        Elements elements2 = document.getElementsByAttributeValue("id", "1");
        System.out.println(elements2);

        System.out.println("-----------");
        //3.3获取id属性值的元素对象
        Element element = document.getElementById("1");
        System.out.println(element);
    }
}
