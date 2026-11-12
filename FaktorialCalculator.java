public class FaktorialCalculator {
    // Variabel global public sesuai ketentuan soal
    public int num = 10;

    // Method menghitung nilai faktorial sesuai potongan kode dari soal
    int getFactorial() {
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    // Override method toString() untuk mencetak deret perkalian faktorial (Soal No. 3)
    @Override
    public String toString() {
        String hasilDeret = "";
        for (int i = 1; i <= num; i++) {
            hasilDeret += i;
            if (i < num) {
                hasilDeret += " * ";
            }
        }
        return "Factorial: " + num + "! = " + hasilDeret + " = " + getFactorial();
    }

    // Main method untuk menguji dan menjalankan program di VS Code
    public static void main(String[] args) {
        FaktorialCalculator fc = new FaktorialCalculator();
        
        // Memanggil method toString() secara otomatis saat objek dicetak
        System.out.println(fc.toString());
    }
}