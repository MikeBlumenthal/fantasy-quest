package Items;

public class Armour extends Item {


    private int armourPoints;

    public Armour(String name, int AP) {
        super(name);
        this.armourPoints = AP;
    }

    public int getArmourPoints() {
        return armourPoints;
    }

}
