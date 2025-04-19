class Main {
    public static void main(String args[]) {
        Deck deck = new Deck(); 
        
        System.out.println("****" + "Creating Deck" + "****");
        deck.createDeck();

        System.out.println("****" + "Print Deck" + "****");
        deck.displayDeck(deck.deck);
        
        deck.shuffleDeck();
        deck.displayDeck(deck.deck);
        
        deck.randomCards();
    }
}
