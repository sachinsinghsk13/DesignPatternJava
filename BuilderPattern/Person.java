public class Person {
    private String name;
    private int age;
    private String address;
    private boolean isEmployed;
    private boolean hasLaptop;
    private boolean isMarried;

    private Person(PersonBuilder pb) {
        this.name = pb.getName();
        this.age = pb.getAge();
        this.address = pb.getAddress();
        this.isEmployed = pb.isEmployed();
        this.isMarried = pb.isMarried();
        this.hasLaptop = pb.hasLaptop();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public boolean isHasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    
    @Override
    public String toString() {
        return "Person [address=" + address + ", age=" + age + ", hasLaptop=" + hasLaptop + ", isEmployed=" + isEmployed
                + ", isMarried=" + isMarried + ", name=" + name + "]";
    }
    
}