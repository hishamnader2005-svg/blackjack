import java.util.Scanner;

public class blackjack {

    hands player = new hands();
    hands dealer = new hands();
    deck deck= new deck();

    private static Scanner sc = new Scanner (System.in);
    int choice;

    public blackjack(){
        hit();
    }
    public void hit()  {
        card c = deck.draw();
        player.addcard(c);
        if (player.getvalue() > 21 ){
            System.out.println("You lose Dealer wins ");
        }
        else {
            System.out.println("Total is : "+ player.getvalue());
            pause(100);
            System.out.println("Card is "+ c);
            System.out.println("Hit or Stay");
            pause(1000);// pauses for 1000 milliseconds = 1 second
            System.out.println("1.Hit");
            System.out.println("2.Stay");
            choice = sc.nextInt();
            if (choice == 1 ){
                hit();
            }
            else {
                System.out.println("Player stayed Dealer turn");
                stay();
            }

        }
    }

    public void stay (){
        pause(1000);




        while(dealer.getvalue() < 21 && dealer.getvalue()< player.getvalue() ) {
            card c2 = deck.draw();
            dealer.addcard(c2);
            System.out.println("Dealer total is " + dealer.getvalue());
            pause(100);
            System.out.println("Card is "+ c2);
            pause(1000);

        }
        endgame();


    }

    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    public void endgame(){
        if (dealer.getvalue() > 21) {
            pause(1000);
            System.out.println("----------------------------");
            System.out.println("Player hand is "+ player.getvalue());
            pause(100);
            System.out.println("Dealer hand is "+ dealer.getvalue());
            pause(100);
            System.out.println("Player wins Congrats");

        }
        else if (dealer.getvalue() > player.getvalue()) {
            System.out.println("----------------------------");
            pause(100);
            System.out.println("Player hand is " + player.getvalue());
            pause(100);
            System.out.println("Dealer hand is " + dealer.getvalue());
            pause(100);
            System.out.println("Dealer wins Try again ");
            System.out.println("Want to try again press 1 :");

            pause(1000);
        }
    }
}
