import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonBuilder {
    private String name;
    private int age;
    private String address;
    private boolean isEmployed;
    private boolean hasLaptop;
    private boolean isMarried;

    public PersonBuilder(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public PersonBuilder setEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
        return this;
    }

    public boolean hasLaptop() {
        return hasLaptop;
    }

    public PersonBuilder setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
        return this;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public PersonBuilder setMarried(boolean isMarried) {
        this.isMarried = isMarried;
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person build() {
        Person person = null;
        Class<Person> p = Person.class;
        try {
            Constructor<?>[] constructor = p.getDeclaredConstructors();
            try {
                constructor[0].setAccessible(true);
                person = (Person) constructor[0].newInstance(this);
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        return person;
    }
}
