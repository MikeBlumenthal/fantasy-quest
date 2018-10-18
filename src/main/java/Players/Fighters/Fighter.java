package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Weapon;

import Players.Player;

public class Fighter extends Player implements IAttack, IDefend {
    private Weapon inHand;

    public Fighter(String name, int hitPoints) {
        super(name, hitPoints);
        this.inHand = null;
    }

    public Weapon getInHand() {
        return inHand;
    }

    public void changeWeapon(Weapon weapon){
        inHand = weapon;
    }

    public int attack(IDefend target) {
        return 0;
    }

    public void defend(IAttack attacker) {
    }
}