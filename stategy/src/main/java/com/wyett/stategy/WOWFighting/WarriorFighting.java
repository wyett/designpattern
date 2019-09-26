package com.wyett.stategy.WOWFighting;

/**
 * @author : wyettLei
 * @date : Created in 2019/9/26 15:17
 * @description: TODO
 */

public class WarriorFighting {
    private FightingStategy fightingStategy;
    public WarriorFighting(FightingStategy fightingStategy) {
        this.fightingStategy = fightingStategy;
    }
    public void setFightingStategy() {
        fightingStategy.fighting();
    }
}
