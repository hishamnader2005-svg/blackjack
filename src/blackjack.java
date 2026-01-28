import java.util.Scanner;

public class blackjack {

    hands player = new hands();
    hands dealer = new hands();
    deck deck= new deck();

    private static Scanner sc = new Scanner (System.in);
    int choice;

    //constructor for the blackjackk
    public blackjack(){
        card c = deck.draw();
        player.addcard(c);
        card c2 = deck.draw();
        player.addcard(c);
        player.showhand("player");
        card c3 = deck.draw();
        dealer.addcard(c3);
        System.out.println("Dealer first card is : "+ c3);
        hit();
    }
    //logic for hitting
    public void hit()  {


    //if player goes over 21 he auto loses
        if (player.getvalue() > 21 ){
            System.out.println("You lose Dealer wins ");
        }
        else {

            System.out.println("Total is : "+ player.getvalue());
            pause(100);
            card c = deck.draw();
            player.addcard(c);
            player.showhand("player");

            if (player.getvalue()> 21 ){
                return;
            }
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
            System.out.println("Card is "+ c2);
            System.out.println("Dealer total is " + dealer.getvalue());
            pause(100);



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
        if (dealer.getvalue() > player.getvalue() && dealer.getvalue() <22) {
            pause(1000);
            System.out.println("----------------------------");
            System.out.println("Player hand is "+ player.getvalue());
            pause(100);
            System.out.println("Dealer hand is "+ dealer.getvalue());
            pause(100);

            System.out.println("Dealer wins Try again ");
            System.out.println("----------------------------");


        }
        else {
            System.out.println("----------------------------");
            pause(100);
            System.out.println("Player hand is " + player.getvalue());
            pause(100);
            System.out.println("Dealer hand is " + dealer.getvalue());
            pause(100);
            System.out.println("Player wins Congrats");
            System.out.println("----------------------------");


            pause(1000);
        }
    }
}
