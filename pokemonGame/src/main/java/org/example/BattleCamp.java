package org.example;

import org.example.attackPowerLevel.AttackPower;
import org.example.attackPowerLevel.Neutral;
import org.example.attackPowerLevel.Strong;
import org.example.attackPowerLevel.Weak;
import org.example.damageCaculator.DamageCalculator;

import java.util.HashMap;
import java.util.Map;

public class BattleCamp {
    Map<String, Map<String, AttackPower>> values = new HashMap<String, Map<String, AttackPower>>();
    public BattleCamp(){
        Map<String, AttackPower> fogo = new HashMap<>();
        fogo.put("Fogo", new Neutral());
        fogo.put("Agua", new Weak());
        fogo.put("Planta", new Strong());
        values.put("Fogo", fogo);

        Map<String, AttackPower> agua = new HashMap<>();
        agua.put("Agua", new Neutral());
        agua.put("Planta", new Weak());
        agua.put("Fogo", new Strong());
        values.put("Agua", agua);

        Map<String, AttackPower> planta = new HashMap<>();
        planta.put("Planta", new Neutral());
        planta.put("Fogo", new Weak());
        planta.put("Agua", new Strong());
        values.put("Planta", planta);
    }

    public int turnoAttack(String typoO, String typoT, int dano) {
        return values.getOrDefault(typoO, new HashMap<>()).getOrDefault(typoT, new Neutral()).attackEstime(dano);
    }
}
