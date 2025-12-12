package prototype;

import java.util.List;

public class Enemy implements EnemyPrototype{
    private String name;
    private int health;
    private int attack;
    private String weapon;
    private List<String> abilities;

    public Enemy(String name, int health, int attack, String weapon, List<String> abilities) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.weapon = weapon;
        this.abilities = abilities;
    }

    @Override
    public EnemyPrototype clone() {
        return new Enemy(this.name, this.health, this.attack, this.weapon, this.abilities);
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attack=" + attack +
                ", weapon='" + weapon + '\'' +
                ", abilities=" + abilities +
                '}';
    }
}
