public class card {

    //cards attributes
    private String suit;
    private String rank;
    private int value;

    //make cards constructor
    public card(String suit, String rank, int value){
        this.rank= rank;
        this.suit = suit;
        this.value = value;
    }

    //return int
    public int getValue(){
        return value;
    }

    public String toString(){
        return rank +" of " + suit +" ";
    }




}
