package com.driver;

public class Main {
    public static void main(String[] args) {
        System.out.println(B.meth());
    }
}
class A {
    public static String meth(){
        return "Invoking method from class A";
    }
}

class B extends A {
    public static String meth() {
        return "Method is overridden in Extended class B";
    }
}
