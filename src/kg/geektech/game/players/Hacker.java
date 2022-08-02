package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HACKING);
    }


    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
    }
}
