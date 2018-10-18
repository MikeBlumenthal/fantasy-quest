package Enums;

import Items.HealingTool;

public enum HealingToolType {
    HERBS(1),
    LITTLE_HERBS(2),
    MEDIUM_HERBS(3),
    BIG_HERBS(4);

    private final int power;

    HealingToolType(int power){
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
