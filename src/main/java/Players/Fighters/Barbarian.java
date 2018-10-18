package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;

public class Barbarian extends Fighter {
    public Barbarian(String name, int hitPoints){
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
