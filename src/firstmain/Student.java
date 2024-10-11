package firstmain;
/*
1.this key word - this variable refers to the current class object
-refer the constructor for info
2. final - value can not be changed, if u assign the final to any variable can not be reassign
3. static - static variable/method can be called without crating the object

Access specifier
1. public - can be seen by the all
2. private - work only with in the class
3. protected - it can use by the child class only
4 no specific/default - same as public with some limitation

 Principles of OOP;  important for interview
1. Encapsulation - hiding the data variable and accessing them using getter and setter
(binding the data variable and code together)
2. Polymorphism - many + forms = one method taking many forms
ex-
3. Inheritance
4. Abstraction
 */
public class Student {

    int studentId;
    String name;
    String dob;
    String gender;
    String email;
    public void simple(){
        System.out.println("print simle method");
    }
    public static void simple2(){
        System.out.println("print simle 2 method");
    }
// right click -> generate -> toString -> select all -> ok
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    // right click -> generate -constructor-> select all -> ok
    public Student(int studentId, String name, String dob, String gender, String email) {
        this.studentId = studentId;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
    }
// empty constructor
    public Student() {
    }
}
