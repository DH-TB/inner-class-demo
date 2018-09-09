package com.example;

class Outter {
    private int age = 1;

    void getAge() {
        this.new Inner().getAge();
        new Inner().getAge();
    }

    //成员内部类
    class Inner {
        void getAge() {
            System.out.println(++Outter.this.age);
        }
    }

    //局部内部类
    Outter getLocalInnerClass() {
        class LocalInner extends Outter {

        }
        return new LocalInner();
    }

    //静态内部类
    static class StaticInner {
        StaticInner() {

        }
    }


    //举例
    class TestInner {
        private int age = 2;
        void print() {
            int age = 3;
            System.out.println("局部变量：" + age);
            System.out.println("内部类变量：" + this.age);
            System.out.println("外部类变量：" + Outter.this.age);
        }
    }
}
