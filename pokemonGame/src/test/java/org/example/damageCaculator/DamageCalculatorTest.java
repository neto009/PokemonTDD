package org.example.damageCaculator;

import org.example.attackPowerLevel.AttackPower;
import org.junit.Test;

import static org.junit.Assert.*;

public class DamageCalculatorTest {

    @Test
    public void testSaidaDanoWeekInterfaceAttackPower() {

        DamageCalculator instance = new DamageCalculator();

        int life = 200;
        int damage = 50;
        int expResult = 150;

        assertEquals(expResult, instance.reciveDamage(life, damage));
    }

}