package ExceptionHandling;

public class TryCatchclass {
    public static void main(String[] args) {
        int a = 10;
        int res =10; // if exception not happens then it will not go to try and catch block//  ////g
        try{
            //monitoring the exception
            System.out.println("inside the try block before exception");
            res = a/0;
            System.out.println("after exception inside try block");
        } catch (ArithmeticException e1){  // it is a calculation kind a thing so arithematic exception
            //handle the exception
            System.out.println("exception occured ;"+e1.getMessage());
        }
        System.out.println("a is :"+a);
        System.out.println("b is :"+res);
    }
    }

