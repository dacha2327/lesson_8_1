package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Berserk extends Hero {
    private int savedDamage;

    public Berserk(int health, int damage, String name ) {
        super(health,damage,name, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }
    public int getSavedDamage() {
        return savedDamage;
    }

    public void setSavedDamage(int savedDamage) {
        this.savedDamage = savedDamage;
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        setSavedDamage(10);
        if (this.getHealth() > 0 && boss.getHealth() > 0) {
            boss.setHealth(boss.getHealth()
                    - this.getDamage() - this.getSavedDamage());
            System.out.println("Ahiles revert damage: " + (getSavedDamage() + getDamage()));
        }
    }

}
