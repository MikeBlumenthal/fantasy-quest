package Items;

public class Armor extends Item {


    private int hitPoints;

    public Armor(String name, int hitPoints) {
        super(name);
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeHit(int damage) {
        hitPoints -= damage;
    }
}
