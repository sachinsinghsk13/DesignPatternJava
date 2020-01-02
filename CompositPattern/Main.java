import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Washable w1 = new Car();
        Washable w2 = new Cloth();
        Washable w3 = new Utensil();

        WashComposit wc = new WashComposit();
        wc.add(w1);
        wc.add(w2);
        wc.add(w3);
        wc.wash();
    }
}