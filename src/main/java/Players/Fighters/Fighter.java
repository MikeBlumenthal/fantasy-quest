package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Weapon;

import Players.Player;

public abstract class Fighter extends Player implements IAttack, IDefend {
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

}