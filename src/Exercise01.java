public class Exercise01 {import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            String studentName1 = "Bob";
            String studentName2 = "Alice";
            String studentName3 = "John";
            String studentName4 = "Jane";

            int age1 = 36;
            int age2 = 25;
            int age3 = 19;
            int age4 = 46;

            boolean student1Single = false;
            boolean student2Single = true;
            boolean student3Single = true;
            boolean student4Single = false;

            String student1City = "Berlin";
            String student2City = "Moscow";
            String student3City = "San Fransisco";
            String student4City = "Rio";

            ArrayList<String> student1Friends = new ArrayList<>();
            ArrayList<String> student2Friends = new ArrayList<>();
            ArrayList<String> student3Friends = new ArrayList<>();
            ArrayList<String> student4Friends = new ArrayList<>();

            student1Friends.add("Alice");
            student1Friends.add("Jane");

            student2Friends.add("Bob");
            student2Friends.add("Jane");

            student3Friends.add("Jane");

            student4Friends.add("John");
            student4Friends.add("Alice");
            student4Friends.add("Bob");

            // introduce yourself (Student 1)
            System.out.println("My name is " + studentName1);
            System.out.println("I'm " + age1 + " years old");
            if (student1Single) {
                System.out.println("I'm single");
            } else {
                System.out.println("I'm in a relationship ^_^ ");
            }
            System.out.println("My friends are:");
            student1Friends.forEach(System.out::println);


            // introduce yourself (Student 2)
            System.out.println("My name is " + studentName2);
            System.out.println("I'm " + age2 + " years old");
            if (student2Single) {
                System.out.println("I'm single");
            } else {
                System.out.println("I'm in a relationship ^_^ ");
            }
            System.out.println("My friends are:");
            student2Friends.forEach(System.out::println);


            // introduce yourself (Student 3)
            System.out.println("My name is " + studentName3);
            System.out.println("I'm " + age3 + " years old");
            if (student3Single) {
                System.out.println("I'm single");
            } else {
                System.out.println("I'm in a relationship ^_^ ");
            }
            System.out.println("My friends are:");
            student3Friends.forEach(System.out::println);


            // introduce yourself (Student 4)
            System.out.println("My name is " + studentName4);
            System.out.println("I'm " + age4 + " years old");
            if (student4Single) {
                System.out.println("I'm single");
            } else {
                System.out.println("I'm in a relationship ^_^ ");
            }
            System.out.println("My friends are:");
            student4Friends.forEach(System.out::println);
        }
    }

}
