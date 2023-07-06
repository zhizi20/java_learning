package org.example;

import java.util.Scanner;
//接收用户输入的3个整数,并将它们的最大值作为结果输出
public class GetMaxNumber {
    public static void main(String[] args){
        //1.a,b,c保存输入的三个变量
        System.out.println("请输入第一个整数：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入第二个整数：");
        int b = new Scanner(System.in).nextInt();
        System.out.println("请输入第三个整数：");
        int c = new Scanner(System.in).nextInt();

        //2.对接收的三个值进行比较
        int max = a>b?a:b;
        max = max>c?max:c;

        //3.输出结果
        System.out.println("三个数的最大值为："+max);

    }

}
