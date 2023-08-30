public class Move {
    // This is the superclass for the various moves the player and monsters can perform //
    Combatant owner;
    String name = "Superclass Move";
    public Move(Combatant owner){
        this.owner = owner;
    };
    void execute(Combatant target){
    }
    String generateDesc(){
        return "This superclass should never be directly accessed.";
    }
    String generateFlavor(){
        return "ERROR: accessed Move superclass.";
    }
}
