package Players;

import Interfaces.IAttack;
import Interfaces.IDefend;

public class Enemy extends Player implements IAttack, IDefend {


    public Enemy(String name, int hitPoints) {
        super(name, hitPoints);
    }

    @Override
    public int attack(IDefend target) {
        return 0;
    }

    @Override
    public void defend(IAttack attacker) {

    }
}
