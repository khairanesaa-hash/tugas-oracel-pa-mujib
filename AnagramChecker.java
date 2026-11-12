import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string pertama: ");
        String str1 = input.nextLine();

        System.out.print("Masukkan string kedua: ");
        String str2 = input.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("Hasil: Kedua string adalah ANAGRAM.");
        } else {
            System.out.println("Hasil: Kedua string BUKAN anagram.");
        }

        input.close();
    }

    public static boolean isAnagram(String s1, String s2) {
        // Mengabaikan spasi, tanda baca, dan mengubah ke huruf kecil
        String clean1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String clean2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Jika panjang karakter bersih berbeda, pasti bukan anagram
        if (clean1.length() != clean2.length()) {
            return false;
        }

        // Ubah string menjadi array karakter lalu diurutkan (sort)
        char[] arr1 = clean1.toCharArray();
        char[] arr2 = clean2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Bandingkan susunan hurufnya
        return Arrays.equals(arr1, arr2);
    }
}