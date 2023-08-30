public class Exhausted extends Move{
    // This is the player skipping a turn after a fireball
    public Exhausted(Combatant owner){
        super(owner);
        this.name = "Exhausted";
    }
    void execute(Combatant target){
        System.out.println(this.generateFlavor());
    }
    String generateDesc(){
        return "You're too exhausted too move!";
    }
    String generateFlavor(){
        return "You're too exhausted to move!";
    }
}