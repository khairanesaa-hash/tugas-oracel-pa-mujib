import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double gallons;
        double liters;

        System.out.print("Masukkan jumlah galon: ");
        gallons = in.nextDouble();

        liters = gallons * 3.785;

        System.out.println(gallons + " gallons equals " + liters + " liters");
    }
}