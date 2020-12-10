package xyz.fusheng.基础.类对象;

/**
 * @FileName: Student
 * @Author: code-fusheng
 * @Date: 2020/10/28 18:11
 * @version: 1.0
 * Description: 学生类对象
 */

public class Student {

    private int id;
    private String name;
    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("zwh");
        student1.setAge(20);
        System.out.println(student1);


        Student student2 = new Student(1, "xxxx", 21);
        System.out.println(student2.getAge());
        System.out.println(student2);
    }


}
