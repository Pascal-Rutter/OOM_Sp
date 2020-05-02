package com.rutterheger;

class Player extends Creature {

    private int ownXP = 0;

    Player() {
        super(25, 6);
    }

    void attack(Creature creature) {
        super.attack(creature);
        NPC npc = (NPC) creature;
        ownXP += npc.getAvailableXP();
    }

    public int getXP() {
        return ownXP;
    }
}
