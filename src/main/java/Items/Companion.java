package Items;


import Interfaces.IAttack;
import Interfaces.IDefend;

public class Companion extends Item implements IDefend{

    private int hitPoints;

    public Companion(String name, int hitPoints) {
        super(name);
        this.hitPoints = hitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    @Override
    public void defend(IAttack attacker){
        //do something
    }
}
