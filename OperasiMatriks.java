import java.util.Scanner;

public class OperasiMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        boolean hasA = false, hasB = false;
        char pilihan;

        do {
            System.out.println("\n=== MENU OPERASI MATRIKS (2x2) ===");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");
            System.out.print("Pilih opsi (a-f): ");
            pilihan = input.next().toLowerCase().charAt(0);

            switch (pilihan) {
                case 'a':
                    System.out.println("Masukkan 4 elemen Matriks A (2x2):");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            A[i][j] = input.nextInt();
                    hasA = true;
                    break;

                case 'b':
                    System.out.println("Masukkan 4 elemen Matriks B (2x2):");
                    for (int i = 0; i < 2; i++)
                        for (int j = 0; j < 2; j++)
                            B[i][j] = input.nextInt();
                    hasB = true;
                    break;

                case 'c':
                    if (hasA && hasB) {
                        System.out.println("Hasil A + B:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.print((A[i][j] + B[i][j]) + " ");
                            }
                            System.out.println();
                        }
                    } else System.out.println("Harap masukkan Matriks A dan B terlebih dahulu!");
                    break;

                case 'd':
                    if (hasA && hasB) {
                        System.out.println("Hasil A - B:");
                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.print((A[i][j] - B[i][j]) + " ");
                            }
                            System.out.println();
                        }
                    } else System.out.println("Harap masukkan Matriks A dan B terlebih dahulu!");
                    break;

                case 'e':
                    if (hasA && hasB) {
                        System.out.println("Hasil A * B:");
                        int[][] C = new int[2][2];
                        C[0][0] = A[0][0]*B[0][0] + A[0][1]*B[1][0];
                        C[0][1] = A[0][0]*B[0][1] + A[0][1]*B[1][1];
                        C[1][0] = A[1][0]*B[0][0] + A[1][1]*B[1][0];
                        C[1][1] = A[1][0]*B[0][1] + A[1][1]*B[1][1];

                        for (int i = 0; i < 2; i++) {
                            for (int j = 0; j < 2; j++) {
                                System.out.print(C[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else System.out.println("Harap masukkan Matriks A dan B terlebih dahulu!");
                    break;

                case 'f':
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 'f');

        input.close();
    }
}