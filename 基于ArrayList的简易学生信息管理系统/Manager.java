package StudentManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static StudentManager.StuMethod.*;


public class Manager {
    public static void main(String[] args) throws IOException {
        List<Student> Stu = new ArrayList<Student>();

        while (true) {
            System.out.println("--------欢迎来到学生信息管理系统--------");
            System.out.println("1 添加学生信息");
            System.out.println("2 删除文件信息");
            System.out.println("3 查看学生信息");
            System.out.println("4 修改学生信息");
            System.out.println("5 退出学生信息管理系统");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1":
                    AddStudent(Stu);
                    break;
                case "2":
                    DelStudent(Stu);
                    break;
                case "3":
                    ShowStudent(Stu);
                    break;
                case "4":
                    UpdataStudent(Stu);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0); //JVM退出
            }

        }
    }
}
