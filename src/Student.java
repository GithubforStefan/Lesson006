import java.util.*;

public class Student {
    String name;
    int age;
    String city;
    boolean single;
    ArrayList<String> friends;

    //constructor:
    //todo: add arguments
    public Student(String name, int age, ){
        this.name = name;
        this.age = age;
        //...
    }
    public void introduce(){
        // introduce yourself (Student 1)
        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old and I am from " + city);
        if (single) {
            System.out.println("I'm single");
        } else {
            System.out.println("I'm in a relationship ^_^ ");
        }
        System.out.println("My friends are:");
        friends.forEach(System.out::println);

    }
}
