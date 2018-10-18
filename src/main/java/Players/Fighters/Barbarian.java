package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;

public class Barbarian extends Fighter {
    public Barbarian(String name, int hitPoints){
        super(name, hitPoints);
    }

    public int doubleDamageHit() {
        return getInHand().getDamage() * 2;
    }
}
