import java.util.Scanner;

class Card {
    String suit, name;
    int points;

    public Card(int n1, int n2) {
        this.name = "Card " + n2;
        this.suit = "Suit " + n1;
        this.points = n2;
    }

    public String toString() {
        return "The " + name + " of " + suit + " (Poin: " + points + ")";
    }

    public int getPoints() {
        return points;
    }
}

public class MainCardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Soal 7: Mengacak 2 kartu awal
        int suitNumber1 = (int)(Math.random() * 4.0 + 1);
        int faceNumber1 = (int)(Math.random() * 13.0 + 1);
        Card card1 = new Card(suitNumber1, faceNumber1);

        int suitNumber2 = (int)(Math.random() * 4.0 + 1);
        int faceNumber2 = (int)(Math.random() * 13.0 + 1);
        Card card2 = new Card(suitNumber2, faceNumber2);

        System.out.println("Kartu 1: " + card1);
        System.out.println("Kartu 2: " + card2);

        // Soal 8a: Menghitung total poin awal
        int totalPoints = card1.getPoints() + card2.getPoints();
        int totalCards = 2;
        System.out.println("Total Poin Sementara: " + totalPoints);

        // Soal 8b & 8c: Loop penambahan kartu
        while (totalCards < 5 && totalPoints <= 21) {
            System.out.print("Apakah Anda ingin menambah kartu lagi? (y/n): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y")) {
                int sNum = (int)(Math.random() * 4.0 + 1);
                int fNum = (int)(Math.random() * 13.0 + 1);
                Card newCard = new Card(sNum, fNum);
                
                totalCards++;
                totalPoints += newCard.getPoints();

                System.out.println("Kartu Baru: " + newCard);
                System.out.println("Jumlah Kartu di Tangan: " + totalCards);
                System.out.println("Total Poin: " + totalPoints);

                if (totalPoints > 21) {
                    System.out.println("Poin melebihi 21! Anda kalah (Bust).");
                    break;
                }
            } else {
                break;
            }
        }
        
        System.out.println("\n--- Permainan Selesai ---");
        System.out.println("Total Akhir Poin Anda: " + totalPoints);
        scanner.close();
    }
}