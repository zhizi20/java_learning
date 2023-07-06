package org.example;

public class Puppy {
    int puppyAge;
    public Puppy(String name)
    {
        //这个构造器仅有一个参数
        System.out.println("小狗的名字是:"+name);
    }
    public void setAge(int age){
        puppyAge = age;
    }
    public int getAge(){
        System.out.println("小狗的年龄为:"+puppyAge);
        return puppyAge;
    }
    public static void main(String[] args){
        //创建对象
        Puppy myPuppy = new Puppy("tommy");
        //通过方法来设定age
        myPuppy.setAge(2);
        //调用一个方法获取age
        myPuppy.getAge();
        //访问成员变量
        System.out.println("变量值："+myPuppy.puppyAge);
    }
}