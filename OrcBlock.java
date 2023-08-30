public class OrcBlock extends Move{
    // The monster charges up, doing nothing this turn but triple damage the next
    public OrcBlock(Combatant owner){
        super(owner);
        this.name = "Orc Block";
    }
    void execute(Combatant target){
        owner.inflict("blocking");
        System.out.println(this.generateFlavor());
    }
    String generateDesc(){
        return "The orc gains the blocking status.";
    }
    String generateFlavor(){
        return "The orc huddles behind his battered shield.";
    }
}