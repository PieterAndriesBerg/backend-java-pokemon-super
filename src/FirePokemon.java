public class FirePokemon extends Pokemon {
    private final String type;
    private int heatRadius;

    public FirePokemon(String name, int hp, int level, int xp, int attack, int defense, int speed, int heatRadius) {
        super(name, hp, level, xp, attack, defense, speed);
        this.type = "Fire";
        this.heatRadius = heatRadius;
    }

    public String getType() {
        return type;
    }

    public int getHeatRadius() {
        return heatRadius;
    }

    public void setHeatRadius(int heatRadius) {
        this.heatRadius = heatRadius;
    }

    public void fireBlast(Pokemon enemy) {
        // Give pokemon +10 attack when using fire blast
        this.setAttack(this.getAttack() + 10);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with fire blast");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public void flameThrower(Pokemon enemy) {
        // Give pokemon +10 attack when using flamethrower
        this.setAttack(this.getAttack() + 25);

        System.out.println(this.getName() + " is attacking " + enemy.getName() + " with flame thrower");
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }



    @Override
    public void speak(){
        System.out.println("Fire fire fire fire fire");
    }





}
