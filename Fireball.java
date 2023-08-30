public class Fireball extends Move{
    // The player deals triple damage, but misses their next turn
    public Fireball(Combatant owner){
        super(owner);
        this.name = "Fireball";
    }
    void execute(Combatant target){
        if (target.hasStatus("blocking")){
            System.out.println(generateBlockedFlavor());
        }
        else{
            target.damage(owner.getStrength() * 3);
            System.out.println(this.generateFlavor());
        }
        owner.inflict("exhausted");
    }
    String generateDesc(){
        return "Shoot a fireball for " + (owner.getStrength() * 3) + " damage, but lose your next turn.";
    }
    String generateFlavor(){
        return "The orc howls in pain as your flames deal " + owner.getStrength() + " damage!";
    }

    String generateBlockedFlavor(){
        return "Your flames splash uselessly against the orc's shield.";
    }
}