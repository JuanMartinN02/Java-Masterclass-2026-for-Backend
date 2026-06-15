import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Card> deck = Card.getStandardDeck();

        var sortingAlg = Comparator.comparing(Card::rank).thenComparing(Card::suit);

        Card tenOfHearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundIndex = Collections.binarySearch(deck, tenOfHearts, sortingAlg);

        // It won't work because for a binary search the Collection must be sorted
        System.out.println("Ten of hearts found in index " + foundIndex + " of the deck!");

        deck.sort(sortingAlg);
        Card.printDeck(deck, "Sorted Deck!", 4);

        int foundIndexTrue = Collections.binarySearch(deck, tenOfHearts, sortingAlg);
        System.out.println("----------------------------------------------------------");
        System.out.println("Ten of hearts found in index " + foundIndexTrue + " of the deck! -> " + deck.get(foundIndexTrue));

        // We can also find an object in the Collection passing it in indexOf
        System.out.println(deck.indexOf(tenOfHearts));

        // We can also replace objects in a collection with other objects
        Card tenOfClubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        if(Collections.replaceAll(deck, tenOfHearts, tenOfClubs)){
            System.out.println("Cards were replaced!");
        }else {
            System.out.println("Cards were not replaced!");
        }
        Card.printDeck(deck.subList(32, 36), "Tens row", 1);

        // Number of this object found in collection
        System.out.println("Tens of club found = " + Collections.frequency(deck, tenOfClubs));

        // Max and Min
        System.out.println("Best Card = " + Collections.max(deck, sortingAlg));
        System.out.println("Worst Card = " + Collections.min(deck, sortingAlg));

        // Sorting by suit
        var sortedBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);
        deck.sort(sortedBySuit);
        Card.printDeck(deck, "Deck sorted by suit!", 4);
    }
}