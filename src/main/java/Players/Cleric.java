package Players;

import Interfaces.IAttack;
import Interfaces.IDefend;
import Items.HealingTool;

public class Cleric extends Player implements IDefend {
    private HealingTool inHand;

    public Cleric(String name, int hitPoints){
        super(name, hitPoints);
        this.inHand = null;
    }

    public HealingTool getInHand() {
        return inHand;
    }

    public void changeHealingTool(HealingTool newHealingTool){
        inHand = newHealingTool;
    }

    public void useHealingTool(Player target){
        //do something
    }

    @Override
    public void defend(IAttack attacker){
        //do something
    }

}
