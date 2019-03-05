package com.diffblue.mocktestcases;

public class Target {

    // No dependencies at all. If this is mocking, something is very wrong.
    public int testCase1(){
        return 1;
    }

    // Depends on a class in the same package.
    // Its return type is a primitive.
    public int testCase2(){
        A a = new A();
        return a.getPrivateInt();
    }

    // Depends on a two classes in the same package.
    // Uses a return type from the same package.
    public B testCase3(){
        A a = new A();
        return a.getPrivateB();
    }

    // Depends on two classes in the same package.
    // Methods are used from the return type B of a.getPrivateB
    public int testCase4(){
        A a = new A();
        return a.getPrivateB().getPrivateInt();
    }
}
