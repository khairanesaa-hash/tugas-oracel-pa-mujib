import java.util.Scanner;

public class BeratPlanet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat Anda di Bumi (lbs/kg): ");
        double beratBumi = input.nextDouble();

        System.out.println("\n--- MENU PLANET ---");
        System.out.println("1. Merkurius");
        System.out.println("2. Venus");
        System.out.println("3. Mars");
        System.out.println("4. Jupiter");
        System.out.println("5. Saturnus");
        System.out.println("6. Uranus");
        System.out.println("7. Neptunus");
        System.out.print("Pilih nomor planet (1-7): ");
        int pilihan = input.nextInt();

        double faktor = 0;
        String namaPlanet = "";

        switch (pilihan) {
            case 1: namaPlanet = "Merkurius"; faktor = 0.38; break;
            case 2: namaPlanet = "Venus"; faktor = 0.91; break;
            case 3: namaPlanet = "Mars"; faktor = 0.38; break;
            case 4: namaPlanet = "Jupiter"; faktor = 2.36; break;
            case 5: namaPlanet = "Saturnus"; faktor = 0.92; break;
            case 6: namaPlanet = "Uranus"; faktor = 0.89; break;
            case 7: namaPlanet = "Neptunus"; faktor = 1.13; break;
            default:
                System.out.println("Pilihan planet tidak valid!");
                input.close();
                return;
        }

        double beratPlanet = beratBumi * faktor;
        System.out.println("\nYour weight on " + namaPlanet + " is " + beratPlanet + " lbs.");

        input.close();
    }
}