package Xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/*
*   selector选择器
* */
public class JsoupDemo_05 {
    public static void main(String[] args) throws IOException {
        // 获取Document对象，根据XML文档获取
        //  1、获取Student.xml的路径
        String path = JsoupDemo_05.class.getClassLoader().getResource("student.xml").getPath();
        //  2、解析xml文档
        Document document = Jsoup.parse(new File(path),"utf-8");
        //  查询name标签
        Elements elements = document.select("name");
        System.out.println(elements);
        // 获取ID值为1的元素
        Elements elements1 = document.select("#1");
        System.out.println(elements1);
        //  获取student标签下ID值为1的age
        Elements elements2 = document.select("student[id = 1] >age");
        System.out.println(elements2);

    }
}
