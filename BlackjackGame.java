import java.util.ArrayList;

class Card {
    String suit, name;
    int points;

    Card(int n1, int n2) {
        this.suit = getSuit(n1);
        this.name = getName(n2);
        this.points = getPoints(this.name);
    }

    private String getSuit(int n) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        return suits[n - 1];
    }

    private String getName(int n) {
        if (n == 1) return "Ace";
        if (n == 11) return "Jack";
        if (n == 12) return "Queen";
        if (n == 13) return "King";
        return String.valueOf(n);
    }

    private int getPoints(String name) {
        if (name.equals("Ace")) return 11;
        if (name.equals("Jack") || name.equals("Queen") || name.equals("King")) return 10;
        return Integer.parseInt(name);
    }

    @Override
    public String toString() {
        return name + " of " + suit;
    }
}

class Deck {
    Card[] cardArray = new Card[52];

    Deck() {
        int cardCount = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cardArray[cardCount++] = new Card(i, j);
            }
        }
    }

    // Opsi 7a: Method Shuffle
    public void shuffle() {
        for (int i = 0; i < cardArray.length; i++) {
            int randomIndex = (int) (Math.random() * cardArray.length);
            Card temp = cardArray[i];
            cardArray[i] = cardArray[randomIndex];
            cardArray[randomIndex] = temp;
        }
    }
}

public class BlackjackGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        System.out.println("Dek kartu telah berhasil diacak!");
        System.out.println("KARTU PERTAMA DALAM DECK TERACAK: " + deck.cardArray[0]);
    }
}