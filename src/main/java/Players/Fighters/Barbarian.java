package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Item;
import Players.Player;

import java.util.ArrayList;

public class Barbarian extends Player implements IAttack, IDefend {
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
