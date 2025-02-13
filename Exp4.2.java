import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
class Card {
    String symbol;
    String value;
   Card(String symbol, String value) {
        this.symbol = symbol;
        this.value = value;
    }
    public String toString() {
        return value + " of " + symbol;
    }
}
public class CardCollection {
    public static void main(String[] args) {
        Collection<Card> cards = new ArrayList<>();
        cards.add(new Card("Hearts", "A"));
        cards.add(new Card("Hearts", "2"));
        cards.add(new Card("Spades", "K"));
        cards.add(new Card("Diamonds", "Q"));
        cards.add(new Card("Clubs", "J"));
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter symbol to search: ");
        String symbol = sc.next();
        for (Card c : cards) {
            if (c.symbol.equalsIgnoreCase(symbol)) {
                System.out.println(c);
            }
        }
        sc.close();
    }
}
