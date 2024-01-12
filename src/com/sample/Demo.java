package com.sample;

public class Demo {
    public static void main(String[] args) {

        SAM obj=()-> {System.out.println("Overriding add method of SAM"); //Lambda Expression
                        System.out.println("another Stat");};
        obj.iAmTheOnlyMethod();

    }
}
