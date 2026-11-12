import java.util.Scanner;

public class HitungCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = input.nextDouble();

        // Luas 4 Dinding = 2 * (panjang * tinggi + lebar * tinggi)
        double luasDinding = 2 * (panjang * tinggi + lebar * tinggi);
        
        // Luas Langit-langit = panjang * lebar
        double luasAtap = panjang * lebar;

        double totalLuas = luasDinding + luasAtap;

        // Ember 5 liter: menutup 1500 sq ft ($15)
        // Ember 1 liter: menutup 300 sq ft ($4)
        int ember5Liter = (int) (totalLuas / 1500);
        double sisaLuas = totalLuas % 1500;

        int ember1Liter = (int) Math.ceil(sisaLuas / 300.0);

        int totalBiaya = (ember5Liter * 15) + (ember1Liter * 4);

        System.out.println("\n--- HASIL PERHITUNGAN ---");
        System.out.println("Total Luas Area Cat: " + totalLuas + " kaki persegi");
        System.out.println("Jumlah Ember 5 Liter ($15): " + ember5Liter);
        System.out.println("Jumlah Ember 1 Liter ($4) : " + ember1Liter);
        System.out.println("Total Biaya Cat          : $" + totalBiaya);

        input.close();
    }
}