package org.example;

public class TestArray {
    public static void main(String[] args){
        double[] mylist = {1.9,2.9,3.4,3.5};

        //打印所有数组元素
        for(int i = 0;i < mylist.length;i++){
            System.out.println(mylist[i]+"");
        }

        //计算所有元素的总和
        double total = 0;
        for (int i = 0;i < mylist.length;i++){
            total += mylist[i];
        }
        System.out.println("Total is "+total);

        //查找最大元素
        double max = mylist[0];
        for ( int i = 1;i < mylist.length;i++){
            if (mylist[i]>max)max = mylist[i];
        }
        System.out.println("Max is "+max);

    }
}
