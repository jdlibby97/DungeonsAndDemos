import java.util.concurrent.ThreadLocalRandom;
public class Orc extends Combatant{
    Orc(int level){
        // Orc health and strength scale with the number defeated
        super((level / 2) + 1, (level + 1) * 5);
        String name = "Orc";
        if (level > 0){
            name = "Big Orc";
        }
        if (level > 1){
            name = "Very Big Orc";
        }
        for(int i = level - 2; i > 0; i--){
            name = "Very, " + name;
        }
        this.name = name;
        // We put two basic attacks in the orc's movelist to increase the odds it will do a basic attack instead of getting fancy
        Move[] orcMoves = {new OrcBasic(this), new OrcBasic(this), new OrcBlock(this), new OrcCharge(this), new OrcHaymaker(this)};
        this.moves = orcMoves;
    }
    Move pickMove(){
        if (this.hasStatus("blocking")){
            this.removeStatus("blocking");
        }
        if (this.hasStatus("charging")){
            this.removeStatus("charging");
            return this.moves[4];
        }
        else{
            // Note we generate a number between 0 and 3, so we never pick the Haymaker randomly
            int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
            return this.moves[randomNum];
        }
    }

}