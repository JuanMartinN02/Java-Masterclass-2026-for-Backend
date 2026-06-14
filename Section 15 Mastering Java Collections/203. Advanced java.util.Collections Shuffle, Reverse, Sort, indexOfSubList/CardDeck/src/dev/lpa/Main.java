package dev.lpa;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Card[] cardArray = new Card[13];
        Card aceOfHearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cardArray, aceOfHearts);
        Card.printDeck(Arrays.asList(cardArray));

        System.out.println("---------------------------");

        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceOfHearts);
        System.out.println(cards);
        System.out.println("card.size() = " + cards.size());

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHearts);
        Card.printDeck(acesOfHearts, "Aces of Heart", 1);

        Card kingOfClubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> kingsOfClubs = Collections.nCopies(13, kingOfClubs);
        Card.printDeck(kingsOfClubs, "Kings of Clubs", 1);

        Collections.addAll(cards, cardArray);
        Collections.addAll(cards, cardArray);
        Card.printDeck(cards, "Card collection with Aces Added", 2);

        Collections.copy(cards, kingsOfClubs);
        Card.printDeck(cards,"Card collection with Kings copied to it", 2);

        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck, "Unshuffled deck", 4);

        Collections.shuffle(deck);
        Card.printDeck(deck, "Shuffled deck", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Reversed deck", 4);

        var sortingAlg = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        deck.sort(sortingAlg);
        Card.printDeck(deck, "Sorted deck by rank, suit", 4);

        Collections.reverse(deck);
        Card.printDeck(deck, "Sorted by rank, suit reversed", 13);

        List<Card> kings = new ArrayList<>(deck.subList(4, 8));
        Card.printDeck(kings, "Kings in deck", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "Tens in deck", 1);

        int sublistIndex = Collections.indexOfSubList(deck, tens);
        System.out.println("Sublist of kings in deck = " + sublistIndex);

        System.out.println("Contains = " + deck.containsAll(tens));

        System.out.println("Disjoints between tens and kings? = " + Collections.disjoint(tens, kings));
        System.out.println("Disjoints between deck and kings? = " + Collections.disjoint(deck, kings));

    }
}
