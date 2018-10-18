package Players.Mages;

import Interfaces.IAttack;
import Interfaces.IDefend;

import java.util.Random;

public class Wizard extends Mage{
    public Wizard(String name, int hitPoints){
        super(name, hitPoints);
    }

    @Override
    public int attack(IDefend target) {
        return 0;
    }

    @Override
    public void defend(IAttack attacker) {
    }

    public int castChaoticMagic(){
        Random rand = new Random();
        int modifier = rand.nextInt(3) + 0;
        return modifier * getCurrentSpell().getDamage();

    }

}
