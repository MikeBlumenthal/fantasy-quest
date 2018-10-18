package Players.Mages;

import Interfaces.IAttack;
import Interfaces.IDefend;

import Items.Companion;
import Items.Spell;
import Players.Player;

public abstract class Mage extends Player implements IAttack, IDefend{
    private Spell currentSpell;
    private Companion companion;

    public Mage(String name, int hitPoints){
        super(name, hitPoints);
        this.currentSpell = null;
        this.companion = null;
    }

    public Companion getCompanion() {
        return companion;
    }

    public Spell getCurrentSpell() {
        return currentSpell;
    }

    public void changeSpell(Spell newSpell){
        currentSpell = newSpell;
    }

    public void changeCompanion(Companion newCompanion){
        companion = newCompanion;
    }
}
