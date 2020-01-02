public abstract class Player {
    private String name;
    private Weapon weapon;
    private Outfit outfit;

    public Player(String name) {
        this.name = name;
    }

    void setWeapon(Weapon w) {
        this.weapon = w;
    }

    void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }
    
    Weapon getWeapon() {
        return this.weapon;
    }

    Outfit getOutfit() {
        return this.outfit;
    }

    void applyWeapon() {
        if (this.weapon != null) {
            this.weapon.fire();
        }
        else
            System.out.println("I have No Weapons.");
    }

    void applyOutfit() {
        if (this.outfit != null) {
            this.outfit.show();
        }
        else {
            System.out.println("I have no outfit.");
        }
    }

    @Override
    public String toString() {
        return "Player : " + this.name;
    }
}