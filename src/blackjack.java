import java.util.Scanner;
import java.lang.*;

public class blackjack {

    hands player = new hands();
    hands dealer = new hands();
    deck deck= new deck();
    private static Scanner sc = new Scanner (System.in);

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
            System.out.println("Hit or Stay");
            pause(1000);// pauses for 1000 milliseconds = 1 second
            System.out.println("1.Hit");
            System.out.println("2.Stay");
            int choice = sc.nextInt();
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

        card c2 = deck.draw();
        dealer.addcard(c2);


        while(dealer.getvalue() < 21 ) {
            System.out.println("Dealer total is " + dealer.getvalue());
            stay();
            pause(1000);

        }
        if (dealer.getvalue() > 21) {
            pause(1000);
            System.out.println("Player hand is "+ player.getvalue());
            System.out.println("Player wins Congrats");
            return;
        }
        else if (dealer.getvalue() > player.getvalue()) {
            System.out.println("Dealer wins ");

            pause(10000);
            return;
        }

    }

    public static void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
