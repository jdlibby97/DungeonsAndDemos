public class DarkRitual extends Move{
    // The player damages themselves in exchange for a buff to strength
    public DarkRitual(Combatant owner){
        super(owner);
        this.name = "Dark Ritual";
    }
    void execute(Combatant target){
        owner.damage(owner.getStrength());
        owner.buffStrength();
        System.out.println(this.generateFlavor());
    }
    String generateDesc(){
        return "Perform a dark ritual that deals " + owner.getStrength() + " damage to yourself, but increases your strength for the rest of the fight.";
    }
    String generateFlavor(){
        return "You surge with unholy might!";
    }
}