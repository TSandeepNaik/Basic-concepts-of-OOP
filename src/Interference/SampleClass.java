package Interference;

public class SampleClass implements InterfaceClsdd, Sample2{
    @Override
    public void demo1() {
        System.out.println("demo1 sample class");
    }

    @Override
    public void demo2() {
        System.out.println("demo 2 in sample class");
    }

    @Override
    public void demo3() {
        System.out.println("demo 3 in sample class");
    }

    @Override
    public void demo4() {
        System.out.println("it is demo 4");
    }
}
