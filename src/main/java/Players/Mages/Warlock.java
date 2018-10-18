package Players.Mages;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Companion;

public class Warlock extends Mage{
    public Warlock(String name, int hitPoints){
        super(name, hitPoints);
    }
    @Override
    public int attack(IDefend target) {
        return 0;
    }

    @Override
    public void defend(IAttack attacker) {

    }

    public void buffCompanion(Companion companion){
        //do something
    }
}
