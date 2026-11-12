import java.util.Scanner;

public class MountvilleAdmission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah Anda Valedictorian atau Salutatorian? (true/false): ");
        boolean isHonor = input.nextBoolean();

        System.out.print("Masukkan jumlah siswa di sekolah Anda: ");
        int jumlahSiswa = input.nextInt();

        System.out.print("Masukkan GPA Anda: ");
        double gpa = input.nextDouble();

        System.out.print("Masukkan Skor SAT Anda: ");
        int sat = input.nextInt();

        boolean diterima = false;

        if (isHonor && jumlahSiswa >= 1400) {
            diterima = true;
        } else if (gpa >= 4.0 && sat >= 1100) {
            diterima = true;
        } else if (gpa >= 3.5 && sat >= 1300) {
            diterima = true;
        } else if (gpa >= 3.0 && sat >= 1500) {
            diterima = true;
        }

        if (diterima) {
            System.out.println("Selamat! Anda DITERIMA di Mountville University.");
        } else {
            System.out.println("Maaf, Anda BELUM MEMENUHI syarat penerimaan.");
        }

        input.close();
    }
}