import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double num1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double num2 = input.nextDouble();

        System.out.print("Masukkan operator (*, +, /, %, -): ");
        char operator = input.next().charAt(0);

        System.out.println("\n--- HASIL MENGGUNAKAN SWITCH ---");
        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Hasil: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Hasil: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Hasil: " + (num1 / num2));
                } else {
                    System.out.println("Error: Pembagian dengan nol!");
                }
                break;
            case '%':
                System.out.println("Hasil: " + (num1 % num2));
                break;
            default:
                System.out.println("Operator tidak valid!");
        }

        System.out.println("\n--- HASIL MENGGUNAKAN IF/ELSE ---");
        if (operator == '+') {
            System.out.println("Hasil: " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("Hasil: " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("Hasil: " + (num1 * num2));
        } else if (operator == '/') {
            if (num2 != 0) {
                System.out.println("Hasil: " + (num1 / num2));
            } else {
                System.out.println("Error: Pembagian dengan nol!");
            }
        } else if (operator == '%') {
            System.out.println("Hasil: " + (num1 % num2));
        } else {
            System.out.println("Operator tidak valid!");
        }

        input.close();
    }
}