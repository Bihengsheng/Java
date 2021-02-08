package StudentManager;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class StuMethod {

    public static void AddStudent(List<Student> Stu){

        Scanner sc = new Scanner(System.in);
        String Sid;

        while (true){
            System.out.println("请输入学号：");
            Sid = sc.nextLine();

            boolean flag = isUsed(Stu, Sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生性别：");
        String Sex = sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s = new Student();
        s.setId(Sid);
        s.setSex(Sex);
        s.setName(name);
        s.setAge(age);

        //将学生对象添加到集合中
        Stu.add(s);

        //给出添加成功提示
        System.out.println("添加学生成功");
    }

    public static void DelStudent(List<Student> Stu){
        //键盘录入要删除的学生学号,显示提示信息
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();

        //在删除/修改学生操作前，对学号是否存在进行判断
        //如果不存在，显示提示信息
        //如果存在，执行删除/修改操作
        int index = -1;

        for (int i = 0; i < Stu.size(); i++) {
            Student s = Stu.get(i);
            if (s.getId().equals(sid)) {
//                int index = i;
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("该信息不存在，请重新输入");
        } else {
            Stu.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功");
        }
    }

    public static void ShowStudent(List<Student> Stu){

        if (Stu.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            return;
        }

        System.out.println("学号\t\t性别\t\t性别\t\t年龄");

        //将集合中数据取出按照对应格式显示学生信息，年龄显示补充“岁”
        for (int i = 0; i < Stu.size(); i++) {
            Student s = Stu.get(i);
            System.out.println(s.getId() + "\t\t" + s.getSex() + "\t\t" + s.getName() + "\t\t" + s.getAge());
        }
    }

    public static void UpdataStudent(List<Student> Stu){
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        String sid;


        while (true){
            System.out.println("请输入你要修改的学生的学号：");
            sid = sc.nextLine();

            boolean flag = isUsed(Stu, sid);
            if (flag) {
                break;

            } else {
                System.out.println("你输入的学号不存在，请重新输入");
            }
        }

        //键盘录入要修改的学生信息
        System.out.println("请输入学生新性别：");
        String sex = sc.nextLine();
        System.out.println("请输入学生新姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生新年龄：");
        String age = sc.nextLine();


        //创建学生对象
        Student s = new Student();
        s.setId(sid);
        s.setSex(sex);
        s.setName(name);
        s.setAge(age);

        //遍历集合修改对应的学生信息
        for (int i = 0; i < Stu.size(); i++) {
            Student student = Stu.get(i);
            if (student.getId().equals(sid)) {
                Stu.set(i, s);
                break;
            }
        }

        //给出修改成功提示
        System.out.println("修改学生成功");
    }

    public static boolean isUsed(List<Student> Stu, String sid) {
        //如果与集合中的某一个学生学号相同，返回true;如果都不相同，返回false
        boolean flag = false;

        for(int i=0; i<Stu.size(); i++) {
            Student s = Stu.get(i);
            if(s.getId().equals(sid)) {
                flag = true;
                break;
            }
        }

        return flag;
    }


}
