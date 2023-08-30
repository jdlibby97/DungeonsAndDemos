public class OrcBasic extends Move{
    // Basic attack for the monster
    public OrcBasic(Combatant owner){
        super(owner);
        this.name = "Orc Basic Attack";
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
        return "The orc attacks the player for " + owner.getStrength() + " damage.";
    }
    String generateFlavor(){
        return "The orc bashes you with his club, dealing " + owner.getStrength() + " damage!";
    }
    String generateBlockedFlavor(){
        return "You block the orc's blow with your shield!";
    }
}