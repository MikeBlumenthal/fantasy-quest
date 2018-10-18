package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;

public class Knight extends Fighter  {

    private int armourHitPoints;

    public Knight(String name, int hitPoints) {
        super(name, hitPoints);
        this.armourHitPoints = 100;
    }

    @Override
    public int attack(IDefend target) {
        return 0;
    }

    @Override
    public void defend(IAttack attacker) {
        // check if armour is fully damaged before hitting hitpoints
    }

    public int getArmourHitPoints() {
        return armourHitPoints;
    }
}