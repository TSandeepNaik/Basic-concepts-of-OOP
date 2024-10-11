package Abstraction;
//Abstraction - hiding the internal implementation and providing the essential information

public class MainClass {
    public static void main(String[] args) {
        // we can not call the abstract class because it don't have body itself so it will give error
        //  we can call child class where we override the abstract class
        Concreteclass child = new Concreteclass();
        child.demo1();
    }
}
