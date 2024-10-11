package encaptulation;
/*1. Encapsulation - hiding the data variable and accessing them using getter and setter
(binding the data variable and code together)
*/
public class Student {
  private   int studentId;
   private String name;
    private String dob;
   private String gender;
   private String email;
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
    //getter - used to get the values
    //setter - to assign the value

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
