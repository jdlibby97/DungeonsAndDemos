import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the dungeon! Fight as many orcs as you can.");
        int defeated = 0;
        Scanner scan = new Scanner(System.in);
        Player you = new Player(scan);
        while(you.getHp() > 0){
            you.refresh();
            Orc enemy = new Orc(defeated);
            if (defeated == 0){
                // Need a special exception here so it's 'an Orc' not 'a Orc'
                System.out.println("You come across an Orc.");
            }else{
                System.out.println("You come across a " + enemy.getName() +".");
            }
            while(you.getHp() > 0 && enemy.getHp() > 0){
                System.out.println();
                System.out.println("You: " + you.getHp() + "hp");
                System.out.println(enemy.getName() + ": "+ enemy.getHp() + "hp");
                Move playerMove = you.pickMove();
                playerMove.execute(enemy);
                if(you.getHp() > 0 && enemy.getHp() > 0){
                    Move orcMove = enemy.pickMove();
                    orcMove.execute(you);
                }
                else if(you.getHp() > 0){
                    System.out.println();
                    System.out.println("You won this fight! Now for the next...");
                    defeated += 1;
                }
            }
            
        }
        System.out.println("You managed to defeat " + defeated + " orcs. Thanks for playing!");
        scan.close();
    }
}
