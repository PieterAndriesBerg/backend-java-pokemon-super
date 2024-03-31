public abstract class Pokemon {
    private String name;
    private int hp;
    private int level;
    private int xp;
    private int attack;
    private int defense;
    private int speed;

    public Pokemon(String name, int hp, int level, int xp, int attack, int defense, int speed) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.xp = xp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void attack(Pokemon enemy) {
        System.out.println(this.getName() + " is attacking " + enemy.getName());
        enemy.setHp(enemy.getHp() - this.getAttack());
        System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left");
    }

    public abstract void speak();
}
