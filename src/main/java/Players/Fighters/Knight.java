package Players.Fighters;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.Armour;

public class Knight extends Fighter implements IDefend{
    private Armour currentArmour;

    public Knight(String name, int hitPoints) {
        super(name, hitPoints);
        this.currentArmour = null;
    }

    public void changeArmour(Armour armour){
        currentArmour = armour;
    }

    @Override
    public void defend(int damage){
        int mitigatedDamage = 0;
        if (currentArmour != null){
            mitigatedDamage = damage - currentArmour.getArmourPoints();
        }
        int newHP = getHitPoints() - mitigatedDamage;
        setHitPoints(newHP);
    }


}