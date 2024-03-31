public class WaterPokemon extends Pokemon {
    private final String type;
    private int waterPressure;

    public WaterPokemon(String name, int hp, int level, int xp, int attack, int defense, int speed,int waterPressure) {
        super(name, hp, level, xp, attack, defense, speed);
        this.type = "Water";
        this.waterPressure = waterPressure;
    }

    public int getWaterPressure() {
        return waterPressure;
    }

    public void setWaterPressure(int waterPressure) {
        this.waterPressure = waterPressure;
    }

    public String getType() {
        return type;
    }

    public void waterGun(Pokemon enemy) {
        // Give pokemon +10 attack when using water gun
        this.setAttack(this.getAttack() + 10);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with water gun");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void hydroPump(Pokemon enemy) {
        // Give pokemon +10 attack when using hydro pump
        this.setAttack(this.getAttack() + 50);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with hydro pump");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }


    @Override
    public void speak() {
        System.out.println("blub blub blub");
    }
}
