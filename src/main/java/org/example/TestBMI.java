package org.example;
//接收用户输入的身高和体重,将判断结果输出
//过轻：低于18.5
//正常：18.5 ~ 22.9
//偏胖：23 ~ 24.9
//肥胖：25 ~ 29.9
//重度肥胖：高于30
//极度肥胖：高于40
import java.util.Scanner;
public class TestBMI {
    public static void main(String[] args){
        //1.提示并接收用户输入的身高和体重信息
        System.out.println("请输入您的身高（单位为m）：");
        double height = new Scanner(System.in).nextDouble();
        System.out.println("请输入您的体重（单位kg）：");
        double weight = new Scanner(System.in).nextDouble();

        //2.调用getBMI方法，根据身高和体重信息，输出结果
        getBMI(height,weight);
    }

    public static void getBMI(double h,double w){
        //求出BMI指数
        double bmi = w/(h*h);
        //定义一个变量r来保存最终结果
        String r = "";

        //根据bmi指数范围，来给r重新赋值
        if(bmi<18.5){
            r = "过轻";
        } else if (bmi<=22.9) {
            r = "正常";
        } else if (bmi<=24.9) {
            r = "偏胖";
        } else if (bmi<=29.9) {
            r = "肥胖";
        } else if (bmi<=40) {
            r = "极度肥胖";
        }
        //打印最终结果
        System.out.println("您的BMI指数："+bmi);

        System.out.println("您的体重属于："+r);
    }


}
