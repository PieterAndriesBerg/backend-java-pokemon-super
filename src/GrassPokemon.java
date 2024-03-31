public class GrassPokemon extends Pokemon {
    private final String type;
    private int leafSize;

    public GrassPokemon(String name, int hp, int level, int xp, int attack, int defense, int speed, int leafSize) {
        super(name, hp, level, xp, attack, defense, speed);
        this.type = "Grass";
        this.leafSize = leafSize;
    }

    public int getLeafSize() {
        return leafSize;
    }

    public void setLeafSize(int leafSize) {
        this.leafSize = leafSize;
    }

    public String getType() {
        return type;
    }

    public void leafBlade(Pokemon enemy) {
        // Give pokemon +10 attack when using leafblade
        this.setAttack(this.getAttack() + 10);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with leaf blade");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void solarBeam(Pokemon enemy) {
        // Give pokemon +10 attack when using solar beam
        this.setAttack(this.getAttack() + 50);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with solar beam");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    @Override
    public void speak() {
        System.out.println("pffffpfpfpfffffff");
    }
}
