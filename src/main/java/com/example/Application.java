package com.example;

public class Application {
    public static void main(String[] args){
        Outter.Inner inner = new Outter().new Inner(); //成员内部类：必须通过Outter对象来创建
        Outter.StaticInner staticInner = new Outter.StaticInner(); //访问静态内部类

        Outter.TestInner testInner = new Outter().new TestInner();
        testInner.print();
    }
}
