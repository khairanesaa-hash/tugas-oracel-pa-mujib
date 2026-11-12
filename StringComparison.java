public class StringComparison {
    public static void main(String[] args) {
        String s1 = "ABC";
        String s2 = new String("DEF");
        String s3 = "AB" + "C";

        // a. s1.compareTo(s2);
        int hasilA = s1.compareTo(s2);

        // b. s2.equals(s3);
        boolean hasilB = s2.equals(s3);

        // c. s3 == s1;
        boolean hasilC = (s3 == s1);

        // d. s2.compareTo(s3);
        int hasilD = s2.compareTo(s3);

        // e. s3.equals(s1);
        boolean hasilE = s3.equals(s1);

        // Menampilkan hasil yang dikembalikan oleh masing-masing pernyataan
        System.out.println("a. s1.compareTo(s2)  : " + hasilA + " (artinya 'ABC' sebelum 'DEF' secara alfabetis)");
        System.out.println("b. s2.equals(s3)     : " + hasilB + " ('DEF' tidak sama dengan 'ABC')");
        System.out.println("c. s3 == s1          : " + hasilC + " (referensi memori sama karena String Pool)");
        System.out.println("d. s2.compareTo(s3)  : " + hasilD + " (artinya 'DEF' setelah 'ABC' secara alfabetis)");
        System.out.println("e. s3.equals(s1)     : " + hasilE + " (isinya sama-sama 'ABC')");
    }
}