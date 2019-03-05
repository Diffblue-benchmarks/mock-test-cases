package com.diffblue.mocktestcases;

public class A {
    private int privateInt;
    private B privateB;

    public A(){
        this.privateInt = 1;
        this.privateB = new B();
    }

    public int getPrivateInt(){
        return privateInt;
    }

    public void setPrivateInt(int privateInt){
        this.privateInt = privateInt
    }

    public B getPrivateB(){
        return this.privateB;
    }

    public void setPrivateB(B privateB){
        this.privateB = privateB;
    }
}