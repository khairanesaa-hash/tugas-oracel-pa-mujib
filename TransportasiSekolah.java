import java.util.Scanner;

public class TransportasiSekolah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalOrang = input.nextInt();

        // Bus hanya digunakan jika terisi penuh (45 orang)
        int jumlahBus = totalOrang / 45;
        int sisaVan = totalOrang % 45;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total orang yang harus naik van: " + sisaVan);

        input.close();
    }
}