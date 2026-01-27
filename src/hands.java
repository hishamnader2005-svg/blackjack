import java.util.ArrayList;

public class hands {

    ArrayList<card> cards = new ArrayList<>();

    public hands(){
        cards = new ArrayList<>();
    }
    public void addcard(card Card){
        cards.add(Card);
    }

    public int getvalue(){
        int total=0;

        for(card Card:cards){
            total+= Card.getValue();

        }
        return total;
    }
    public void showhand(String owner){
        System.out.println(owner + "'s hand:");
        for (card Card : cards){
            System.out.println(" "+ Card);

        }
        System.out.println("Total is "+ getvalue());

    }
}
