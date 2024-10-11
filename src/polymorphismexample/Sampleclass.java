package polymorphismexample;
// same function can be used to many forms like here we created the same sum fuction and
// we are performing two methods one after another not at a time.
// one more name is method overloading;
// constructor overloading also possible
public class Sampleclass {
    public void sum(int a, int b){
        System.out.println("sum of two numbers "+ (a+b));
    }
    // here we can also change the data type like double , float,
    public void sum(int a, int b, int c){
        System.out.println("sum of three numbers "+ (a+b+c));
    }
}
