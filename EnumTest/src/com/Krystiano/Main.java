package com.Krystiano;

public class Main {

    public static void main(String[] args) {
        Enum a = RamPamPam.stan2;
        System.out.println(a.hashCode());

        Parent p=new Child();
        Child q=new Child();


        p.parentMethod();
        p.test();
        q.childMethod();
        q.test();
    }
}
