package application;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double [] array = new double [n];
        double sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            System.out.print("Digite um numero: ");
            array[i] = sc.nextDouble();
            sum += array[i];
        }
        double average = sum / (double) array.length;

        System.out.print("Valores = ");
        for (double v : array) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", sum);
        System.out.printf("MEDIA = %.2f%n", average);

        sc.close();
    }
}