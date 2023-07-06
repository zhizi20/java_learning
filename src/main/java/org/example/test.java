package org.example;

public class test {
    public static void main(String[] args){
        //1.定义变量保存父亲的身高
        double fatherHeight = 170;
        //2.定义变量保存母亲的身高
        double motherHeight = 153;
        //3.计算儿子身高
        double sonHeight = (fatherHeight+motherHeight)*1.08/2;
        //4.计算女儿身高
        double daughterHeight = (fatherHeight*0.93+motherHeight)/2;
        //5.打印输出最终计算结果
        System.out.println("儿子预计身高"+sonHeight+"厘米");
        System.out.println("女儿预计身高"+daughterHeight+"厘米");

    }
}
