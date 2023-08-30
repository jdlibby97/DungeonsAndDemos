public class OrcHaymaker extends Move{
    // The monster deals triple damage
    // THIS ATTACK SHOULD NEVER BE CHOSEN ON ITS OWN, it triggers from the 'charging' status
    public OrcHaymaker(Combatant owner){
        super(owner);
        name = "Orc Haymaker";
    }
    void execute(Combatant target){
        if (target.hasStatus("blocking")){
            System.out.println(generateBlockedFlavor());
        }
        else{
            target.damage(owner.getStrength() * 3);
            System.out.println(this.generateFlavor());
        }
    }
    String generateDesc(){
        return "The orc attacks the player for " + owner.getStrength() + " damage.";
    }
    String generateFlavor(){
        return "The orc lands a brutal haymaker, dealing " + (owner.getStrength() * 3) + " damage!";
    }
    String generateBlockedFlavor(){
        return "The orc's brutal blow rattles your shield arm, but you hold fast.";
    }
}