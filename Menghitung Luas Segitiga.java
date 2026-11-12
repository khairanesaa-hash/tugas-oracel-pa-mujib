import java.util.Scanner;

public class Luas Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga (b): ");
        double b = input.nextDouble();

        System.out.print("Masukkan tinggi segitiga (h): ");
        double h = input.nextDouble();

        // Rumus: A = (1/2) * b * h
        double A = 0.5 * b * h;

        System.out.println("Luas segitiga (A) = " + A);

        input.close();
    }
}