public class ElectricPokemon extends Pokemon {
    private final String type;
    private int voltage;

    public ElectricPokemon(String name, int hp, int level, int xp, int attack, int defense, int speed, int voltage) {
        super(name, hp, level, xp, attack, defense, speed);
        this.type = "Electric";
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getType() {
        return type;
    }

    public void thunderShock(Pokemon enemy) {
        // Give pokemon +10 attack when using thunderShock

        this.setAttack(this.getAttack() + 10);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder shock");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void thunderBolt(Pokemon enemy) {
        // Give pokemon +10 attack when using thunderBolt
        this.setAttack(this.getAttack() + 25);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with thunder bolt");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    @Override
    public void speak() {
        System.out.println("Bzzzzzzbzbzzzzz");
    }
}
