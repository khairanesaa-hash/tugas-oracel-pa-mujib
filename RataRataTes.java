import java.util.Scanner;

public class RataRataTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("--- PROGRAM HITUNG RATA-RATA TES ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = input.nextDouble();
            total += nilaiTes[i];
        }

        double rataRata = total / 5;
        System.out.println("\nTotal Nilai : " + total);
        System.out.println("Rata-rata   : " + rataRata);

        input.close();
    }
}