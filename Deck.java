import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Deck {
    ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
    }

    public void createDeck() {
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};

    for (String rank : ranks) {
        for (String suit : suits) {
            deck.add(new Card(rank, suit));
        }
    }
    }
    public void displayDeck(ArrayList<Card> hand) {
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    
    public void shuffleDeck() {
    Collections.shuffle(deck);
    }


    public void randomCards() {
    Random rand = new Random();
    int randomIndex1 = rand.nextInt(deck.size());
    Card randomCard1 = deck.get(randomIndex1);
    int randomIndex2 = rand.nextInt(deck.size());
    Card randomCard2 = deck.get(randomIndex2);
    System.out.println("Random Card: " + randomCard1);
    System.out.println("Random Card: " + randomCard2);
    
    }
    
    public void players() {
    shuffleDeck();

    ArrayList<Card> player1 = new ArrayList<>();
    ArrayList<Card> player2 = new ArrayList<>();
    ArrayList<Card> player3 = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
        player1.add(deck.remove(0));
        player2.add(deck.remove(0));
        player3.add(deck.remove(0));
    }
}


}
