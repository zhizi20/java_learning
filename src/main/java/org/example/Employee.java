package org.example;
import java.io.*;
public class Employee {
    String name;
    int age;
    String designation;
    double salary;
    //Employee类的构造器
    public Employee(String name){
        this.name = name;
    }
    //设置age的值
    public void emAge(int emAge){
        age = emAge;
    }
    public void emDesignation(String emDesig){

        designation = emDesig;
    }
    public void emSalary(double emSalary){
        salary = emSalary;
    }
    //打印信息
    public void printEmployee(){
        System.out.println("名字:"+name);
        System.out.println("年龄:"+age);
        System.out.println("职业:"+designation);
        System.out.println("薪水:"+salary);

    }
}
