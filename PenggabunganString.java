public class PenggabunganString {
    public static void main(String[] args) {
        // 1. Deklarasi dan instansiasi dua object String terpisah
        String str1 = "Halo ";
        String str2 = "Dunia!";

        // 2. Gabungkan keduanya dan tetapkan ke object String ketiga
        String str3 = str1 + str2;

        // 3. Cetak hasil penggabungan ke layar
        System.out.println("String Pertama : " + str1);
        System.out.println("String Kedua   : " + str2);
        System.out.println("String Ketiga  : " + str3);
    }
}