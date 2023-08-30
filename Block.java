public class Block extends Move{
    // The player gains the blocking status
    public Block(Combatant owner){
        super(owner);
        this.name = "Block";
    }
    void execute(Combatant target){
        owner.inflict("blocking");
        System.out.println(this.generateFlavor());
    }
    String generateDesc(){
        return "You block the next attack.";
    }
    String generateFlavor(){
        return "You hold your shield out in front of you.";
    }
}