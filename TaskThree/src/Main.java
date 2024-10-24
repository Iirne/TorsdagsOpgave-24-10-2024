import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> knower = new ArrayList<>();
        knower.add("Java 1.0");



        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student("pete",knower));
        people.add(new Teacher("peter",knower));

        people.add(new Student("pete",new ArrayList<>()));
        people.add(new Teacher("peter",new ArrayList<>()));

        //repetetive, but just for testing
        for (Person p : people) {
            if (p instanceof Teacher) {
                if(p.addCourse("Java 1.0")){
                    System.out.println("underviser nu i Java 1.0");
                }
                else{
                    System.out.println("kan ikke undervise i Java 1.0");
                }

            }
            if (p instanceof Student) {
                if(p.addCourse("Java 1.0")){
                    System.out.println("bliver nu undervist i Java 1.0");
                }
                else{
                    System.out.println("har allerede bestået java 1.0");
                }

            }
        }
    }
}