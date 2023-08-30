public class BasicAttack extends Move{
    // Basic attack for the player
    public BasicAttack(Combatant owner){
        super(owner);
        this.name = "Basic Attack";
    }
    void execute(Combatant target){
        if (target.hasStatus("blocking")){
            System.out.println(generateBlockedFlavor());
        }
        else{
            target.damage(owner.getStrength());
            System.out.println(this.generateFlavor());
        }
    }
    String generateDesc(){
        return "Attack the enemy for " + owner.getStrength() + " damage.";
    }
    String generateFlavor(){
        return "You slash the orc with your sword, dealing " + owner.getStrength() + " damage!";
    }

    String generateBlockedFlavor(){
        return "Your sword clangs against the orc's shield.";
    }
}