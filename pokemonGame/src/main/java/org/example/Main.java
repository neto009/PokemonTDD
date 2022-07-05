package org.example;


import org.example.attackPowerLevel.AttackPower;
import org.example.damageCaculator.DamageCalculator;
import pokemons.Pokemon;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Charmander", 215, 75, 75, "Fogo");
        Pokemon boss = new Pokemon("Gyrados", 320, 80, "Agua");

        BattleCamp battleCamp = new BattleCamp();

        System.out.println(battleCamp.turnoAttack(pokemon.getType(), boss.getType(), 100));
    }
}