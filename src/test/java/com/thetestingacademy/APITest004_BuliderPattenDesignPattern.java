package com.thetestingacademy;

public class APITest004_BuliderPattenDesignPattern {

    //Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to
    // have same reference

    public APITest004_BuliderPattenDesignPattern step1() {
        System.out.println("Step 1 is started");;
        System.out.println("Step 1 is done");
        return this;
    }

    public APITest004_BuliderPattenDesignPattern step2() {
        System.out.println("Step 2 is started");
        System.out.println("Step 2 is done");
        return this;
    }

    public APITest004_BuliderPattenDesignPattern step3(String name) {
        System.out.println("Step 3 is started");
        System.out.println("Step 3 is done" + name);
        return this;
    }

    public static void main(String[] args) {
        APITest004_BuliderPattenDesignPattern bp = new APITest004_BuliderPattenDesignPattern();
        bp.step1().step2().step3("Pramod");
    }
}