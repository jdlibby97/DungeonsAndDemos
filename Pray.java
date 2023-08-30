public class Pray extends Move{
    // The player heals for twice their strength. Overhealing is allowed.
    public Pray(Combatant owner){
        super(owner);
        this.name = "Pray";
    }
    void execute(Combatant target){
        owner.heal(owner.getStrength() * 2);
        System.out.println(generateFlavor());
    }
    String generateDesc(){
        return "Heal yourself for " + (owner.getStrength() * 2) + " hp.";
    }
    String generateFlavor(){
        return "Holy light rejuvenates you, bringing you up to " + owner.getHp() + "hp.";
    }
}