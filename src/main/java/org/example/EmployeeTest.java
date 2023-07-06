package org.example;
import java.io.*;
public class EmployeeTest {
    public static void main(String[] args)
    {
        //使用构造器创建两个对象
        Employee emone = new Employee("RINOOB1");
        Employee emtwo = new Employee("RINOOB2");

        //调用这两个对象的成员方法
        emone.emAge(26);
        emone.emDesignation("高级程序员");
        emone.emSalary(1000);
        emone.printEmployee();

        emtwo.emAge(21);
        emtwo.emDesignation("菜鸟程序员");
        emtwo.emSalary(500);
        emtwo.printEmployee();
    }
}
