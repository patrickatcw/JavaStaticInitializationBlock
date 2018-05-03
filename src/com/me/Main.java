package com.me;

public class Main {

    public static void main(String[] args) {

        //step 6 instance
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);
        //then run
        //results; note order of how everything is called
        /*
        Main method called
        SIBTest static initialization block called
        2nd initialization block called
        SIB constructor called
        someMethod called
        Owner is Patrick
         */
    }

}
