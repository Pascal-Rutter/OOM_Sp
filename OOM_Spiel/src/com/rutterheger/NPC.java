package com.rutterheger;

class NPC extends Creature {
    //Aenderung aus dem Browser
    //noch ne Aenderung von IntelliJ PC

    private final int availableXP;

    NPC(int lives, int attack, int xp) {
        super(lives, attack);
        availableXP = xp;
    }

    int getAvailableXP() {
        return availableXP;
    }
}
