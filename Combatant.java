import java.util.ArrayList;
import java.util.List;

public class Combatant {
    // This is the superclass for the player and monsters //
    int strength;
    int hp;
    String name;
    List<String> statuses;
    Move[] moves;
    public Combatant (int strength, int hp){
        this.strength = strength;
        this.hp = hp;
        this.statuses = new ArrayList<String>();
    }
    // Just setters and getters below this point basically
    String getName(){
        return this.name;
    }
    int getStrength(){
        return this.strength;
    }
    int getHp(){
        return this.hp;
    }
    void heal(int healing){
        this.hp += healing;
    }
    void damage(int damage){
        this.hp -= damage;
    }
    void buffStrength(){
        this.strength += 1;
    }
    void setStrength(int strength){
        this.strength = strength;
    }
    void setHp(int hp){
        this.hp = hp;
    }
    boolean hasStatus(String status){
        return statuses.contains(status);
    }
    void inflict(String status){
        statuses.add(status);
    }
    void removeStatus(String status){
        statuses.remove(status);
    }
}
