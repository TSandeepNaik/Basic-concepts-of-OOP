package inheritance;

public class Bird extends ParentClassAnimal{
    public void fly(){
        System.out.println("bird can fly");
    }

    @Override
    //it is not mandatory to write override annotation it is inbuilt
    public void see() {
        System.out.println("Bird can see");
    }
}
