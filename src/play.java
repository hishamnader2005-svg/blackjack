import java.util.ArrayList;
import java.util.Scanner;

public class play {

    private static Scanner sc= new Scanner(System.in);

    public play(){

        while (true){
            displaymenu();
        int choice=sc.nextInt();


            sc.nextLine();
            //to display menu

            switch (choice) {
                case 1:
                    hand();
                    break;
                case 2:
                    rules();
                    break;
                case 3:
                    System.out.println("Exiting goodbye");
                    return;
                default:
                    System.out.println("Invalid try again");
            }
        }
    }

    public void displaymenu(){
        System.out.println("Welcome to Black Jack");
        System.out.println("Choose your options:");
        System.out.println("1.Play");
        System.out.println("2.Rules");
        System.out.println("3.Exit");
    }

    public void rules(){
        System.out.println("=== BLACKJACK RULES ===\n" +
                "\n" +
                "Goal:\n" +
                "Get as close to 21 as possible without going over.\n" +
                "\n" +
                "Card Values:\n" +
                "2–10 = face value\n" +
                "J, Q, K = 10\n" +
                "Ace = 1 or 11\n" +
                "\n" +
                "Your Turn:\n" +
                "Hit = take a card\n" +
                "Stand = keep your hand\n" +
                "Over 21 = you lose\n" +
                "\n" +
                "Dealer:\n" +
                "Hits until 17+\n" +
                "Stands on 17+\n" +
                "\n" +
                "Win:\n" +
                "Higher hand wins\n" +
                "Dealer busts → you win\n" +
                "Tie = push\n" +
                "\n" +
                "Blackjack:\n" +
                "Ace + 10-value card\n" +
                "Instant win\n" +
                "\n" +
                "======================");
    }
    public void hand(){


        blackjack blackjack = new blackjack();


    }
}



