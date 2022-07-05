package org.example.attackPowerLevel;

import java.util.Random;

public class Neutral implements AttackPower {


    @Override
    public int attackEstime(int dano) {
        Random randint = new Random();
        int roundDamage = (dano - 10);
        //int roundDamage = randint.nextInt(dano);
        return roundDamage;
    }
}
