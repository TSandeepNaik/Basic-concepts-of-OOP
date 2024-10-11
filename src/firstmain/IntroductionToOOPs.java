package firstmain;

public class IntroductionToOOPs {
    public static void main(String[] args) {
        System.out.println("Hello world");
// when ever any object creates default constructor will be created
        Student s1 = new Student();// creating the object
        // if we print the obj directly it will print memory location
        //after adding the toString method in class student it will print constant values
        System.out.println("s1 is "+s1);

        s1.studentId = 123;
        s1.dob = "10/11/2000";
        s1.email= "sandeepnaikat100@gmail.com";
        s1.gender="male";

        System.out.println("s1 after asigning the values : "+s1);
        //after creating the constructor
Student s2 = new Student(1234, "shreya", "00/00/00", "male", "sandeep@gmail.com");
        System.out.println("s2 After parameterised constructor : "+ s2);
        // for this we created the object
        Student s3 = new Student();
        s3. simple();
// for static variable / method we simply called using class name
        Student.simple2();
    }
}
