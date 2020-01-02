public class Volt {
    private int value;
    
    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Volt : " + this.value + "v";
    }
}