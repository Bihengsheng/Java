package Xml.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupDemo_02 {
    public static void main(String[] args) throws IOException {
        // 获取Document对象，根据XML文档获取
        //  1、获取Student.xml的路径
        String path = JsoupDemo_02.class.getClassLoader().getResource("student.xml").getPath();
        //  2、解析xml文档
        Document document = Jsoup.parse(new File(path), "utf-8");
        //  parse（String html）：解析xml或html字符串
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "\n" +
                " <students >\n" +
                "\n" +
                "\t<student id=\"1\">\n" +
                "\t\t<name>张三</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>男</sex>\n" +
                "\t</student>\n" +
                "\n" +
                "\t<student id=\"2\">\n" +
                "\t\t<name>李四</name>\n" +
                "\t\t<age>18</age>\n" +
                "\t\t<sex>男</sex>\n" +
                "\t</student>\n" +
                "\t\t \n" +
                " </students>";
        Document document1 = Jsoup.parse(str);
        System.out.println(document1);
        //3.parse​(URL url, int timeoutMillis)：通过网络路径获取指定的html或xml的文档对象
        URL url = new URL("https://baike.baidu.com/item/jsoup/9012509?fr=aladdin");//代表网络中的一个资源路径
        Document document2 = Jsoup.parse(url, 10000);
        System.out.println(document2);
    }
}