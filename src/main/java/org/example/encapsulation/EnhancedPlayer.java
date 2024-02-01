package org.example.encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health <=0 ) this.health = 1;
        else if(health > 100) this.health = 100;
        else this.health = health;
        this.weapon = weapon;
    }

    public EnhancedPlayer(String name) {
        this(name, 100,"sword");
    }
    public void loseHealth(int damage){
        health -= damage;
        if(health <= 0 ) System.out.println("knocked");
    }
    public int healthRemaining(){
        return health;
    }
    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if(health > 100) System.out.println("100%");
        health = 100;
    }
}
