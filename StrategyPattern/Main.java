public class Main {
    public static void main(String[] args) {
        Player player = new SachinSingh("Sachin");
        player.applyWeapon();
        player.applyOutfit();
        player.setWeapon(new AKM());
        player.setOutfit(new Bikini());
        player.applyWeapon();
        player.applyOutfit();
        player.setWeapon(new M416());
        player.setOutfit(new Jeans());
        player.applyWeapon();
        player.applyOutfit();
    }
}