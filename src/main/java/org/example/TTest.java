package org.example;

public class TTest {
    public static void main(String[] args){
        int a,b;
        a = 10;
        //如果a=1成立，则b=20，否则等于30
        b = (a == 1) ? 20 : 30;
        System.out.println("Value of b is"+b);

        //如果a=10成立，则b=20，否则等于30
        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is"+b);
    }
}
