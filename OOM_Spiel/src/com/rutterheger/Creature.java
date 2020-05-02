package com.rutterheger;

class Creature {
    private int lives;
    private final int attackValue;

    Creature(int lives, int attackValue) {
        this.lives = lives;
        this.attackValue = attackValue;
    }

    void reduceLives(int subtrahend) {
        lives -= subtrahend;
    }

    int getLives() {
        return lives;
    }

    boolean isAlive() {
        return lives > 0;
    }

    void attack(Creature creature) {
        creature.reduceLives(attackValue);
    }
}
