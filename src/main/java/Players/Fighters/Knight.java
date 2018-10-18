package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Item;
import Players.Player;


public class Knight extends Player implements IAttack, IDefend {
    public Knight(String name, int hitPoints) {
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