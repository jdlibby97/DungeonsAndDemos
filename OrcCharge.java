public class OrcCharge extends Move{
    // The monster charges up, doing nothing this turn but triple damage the next
    public OrcCharge(Combatant owner){
        super(owner);
        name = "Orc Charge Up";
    }
    void execute(Combatant target){
        owner.inflict("charging");
        System.out.println(this.generateFlavor());
    }
    String generateDesc(){
        return "The orc does nothing this turn, but deals triple damage next turn.";
    }
    String generateFlavor(){
        return "The orc rears back, preparing for a brutal strike.";
    }
}