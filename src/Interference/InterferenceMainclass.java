package Interference;
/*
 .-way to achieve abstraction - it performs the concepts of abstraction
 -1. abstract method / interface method do the same work
 - it contains the abstract method and constants()its like a blueprint it contains all method which can be
 implemented later in another class
 --> simply it is list of functionality
--> we can not inherit the multiple class as we know but
we can inherit many interference classes
 */

public class InterferenceMainclass {
    public static void main(String[] args) {
       SampleClass s1 = new SampleClass();
       s1.demo1();
       s1.demo2();   //
       s1.demo3();
       s1.demo4();
    }
}
