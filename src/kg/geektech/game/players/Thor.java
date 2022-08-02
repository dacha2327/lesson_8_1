package kg.geektech.game.players;

public class Thor extends Hero{
    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.STANNING);
    }

    @Override
    public void applySuperPower(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0 ) {
                setHealth(getHealth() - boss.getDamage());

            }
        }
    }
}
