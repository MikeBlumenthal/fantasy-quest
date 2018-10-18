package Items;

public class Armor extends Item {

    private int hitpoints;

    public Armor(String name, int hitpoints) {
        super(name);
        this.hitpoints = hitpoints;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void takeHit(int damage) {
        hitpoints -= damage;
    }
}
