package org.example;


import org.junit.Test;

import static org.junit.Assert.*;

public class BattleCampTest {

    @Test
    public void testSaidaDanoBattleCampFogo() {

        BattleCamp battleCamp = new BattleCamp();

        int dano = 100;

        int expResult = 90;
        int expResult2 = 45;
        int expResult3 = 180;

        assertEquals(expResult, battleCamp.turnoAttack("Fogo", "Fogo", dano));
        assertEquals(expResult2, battleCamp.turnoAttack("Fogo", "Agua", dano));
        assertEquals(expResult3, battleCamp.turnoAttack("Fogo", "Planta", dano));
    }

    @Test
    public void testSaidaDanoBattleCampAgua() {

        BattleCamp battleCamp = new BattleCamp();

        int dano = 100;
        int expResult4 = 90;
        int expResult5 = 45;
        int expResult6 = 180;

        assertEquals(expResult4, battleCamp.turnoAttack("Agua", "Agua", dano));
        assertEquals(expResult5, battleCamp.turnoAttack("Agua", "Planta", dano));
        assertEquals(expResult6, battleCamp.turnoAttack("Agua", "Fogo", dano));
    }

    @Test
    public void testSaidaDanoBattleCampPlanta() {

        BattleCamp battleCamp = new BattleCamp();

        int dano = 100;

        int expResult7 = 90;
        int expResult8 = 45;
        int expResult9 = 180;

        assertEquals(expResult7, battleCamp.turnoAttack("Planta", "Planta", dano));
        assertEquals(expResult8, battleCamp.turnoAttack("Planta", "Fogo", dano));
        assertEquals(expResult9, battleCamp.turnoAttack("Planta", "Agua", dano));
    }

    @Test
    public void testSaidaDanoBattleCampRaio() {

        BattleCamp battleCamp = new BattleCamp();

        int dano = 100;

        int expResult7 = 90;
        int expResult8 = 90;
        int expResult9 = 90;
        int expResult10 = 90;

        assertEquals(expResult7, battleCamp.turnoAttack("Raio", "Planta", dano));
        assertEquals(expResult8, battleCamp.turnoAttack("Raio", "Fogo", dano));
        assertEquals(expResult9, battleCamp.turnoAttack("Raio", "Agua", dano));
        assertEquals(expResult10, battleCamp.turnoAttack("Raio", "Raio", dano));
    }

}