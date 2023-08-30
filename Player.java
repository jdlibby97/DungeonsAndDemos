import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Combatant{
    Scanner scan;
    Player(Scanner scan){
        super(1, 10);
        Move[] Moves = {new BasicAttack(this), new Block(this), new Fireball(this), 
            new Pray(this), new DarkRitual(this), new Exhausted(this)};
        this.moves = Moves;
        this.scan = scan;
    }
    Move pickMove(){
        if (this.hasStatus("blocking")){
            this.removeStatus("blocking");
        }
        if (this.hasStatus("exhausted")){
            this.removeStatus("exhausted");
            return this.moves[5];
        }
        else{
            String input = "5";
            do{
                System.out.println("Available moves:");
                for(int i = 0; i < 5; i++){
                    System.out.println(i + " - " + this.moves[i].name + ": " + this.moves[i].generateDesc());
                }
                System.out.println("Enter the number of your chosen move:");
                input = scan.nextLine();
                try{
                    Integer.parseInt(input);
                    if(Integer.parseInt(input) < 0 || Integer.parseInt(input) > 4){
                        System.out.println("Please enter the number of an available move.");
                    }
                }
                catch(Exception e){
                    System.out.println("Please enter a number.");
                    input = "5";
                }
            }while(Integer.parseInt(input) < 0 || Integer.parseInt(input) > 4);
            return(this.moves[Integer.parseInt(input)]);
        }
    }
    
    void refresh(){
        this.hp = 10;
        this.strength = 1;
        this.statuses = new ArrayList<String>();
    }

}