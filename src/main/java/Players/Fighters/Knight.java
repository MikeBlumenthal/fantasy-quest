package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Item;
import Players.Player;

import java.util.ArrayList;

public class Knight extends Player implements IAttack, IDefend {
    public Knight(String name, int hitPoints, ArrayList<Item> bag) {
        super(name, hitPoints, bag);
    }

    @Override
    public int attack(IDefend target) {
        return 0;
    }


    @Override
    public void defend(IAttack attacker) {

    }
}