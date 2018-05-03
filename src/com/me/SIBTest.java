package com.me;

//step 1 create this class
public class SIBTest {

    //step 2 field or variable
    public static final String owner;

    //call an initialization block
    static {

        owner = "Patrick";
        System.out.println("SIBTest static initialization block called");

    }

    //step 3 constructor
    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    //step 4 call another initialization block
    static {

        System.out.println("2nd initialization block called");

    }

    //step 5 method
    public void someMethod(){

        System.out.println("someMethod called");
        //back to main for step 6
    }

}
