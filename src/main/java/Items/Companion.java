package Items;

import Interfaces.IAttack;
import Interfaces.IDefend;

public class Companion extends Item implements IDefend{
    public Companion(String name) {
        super(name);
    }

    @Override
    public void defend(IAttack attacker){
        //do something
    }
}
