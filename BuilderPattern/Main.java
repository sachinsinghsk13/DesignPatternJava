import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder("Sachin", 21).setAddress("Sanjay Colony").build();
        System.out.println(person);
           

    }
}