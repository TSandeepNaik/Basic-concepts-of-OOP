package inheritance;
// we can not have multiple inheritance because child class get confuse to inherit the parent class
// child can not identify the parent class
//Method overriding - overriding the implementation from parent class to child class
// if we create 2 overriding method it will be both overriding and also overloading at also it can be done once only
// final keyword with inheritance - if we make parent class final can not to child inherited class
// if we use final in method that particular method can not be overriding
public class MainClass {
    public static void main(String[] args) {
        System.out.println("----animal parent class----");
        ParentClassAnimal animal = new ParentClassAnimal();
        animal.see();
        animal.breath();
        animal.smell();

        System.out.println("----human child class");
        Human human = new Human();
        human.talk();
        human.see();
        human.breath();
        human.smell();

        System.out.println("------Dog child class-----");
        Dog dog = new Dog();
        dog.bark();
        dog.see();
        dog.breath();
        dog.smell();

        System.out.println("bird==== child class ---");
        Bird bird = new Bird();
        bird.fly();
        bird.see();
        bird.breath();
        bird.smell();
    }
}
