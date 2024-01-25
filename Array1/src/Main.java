import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double [] vect = new double[n];
        double soma = 0.0;

        for (int i = 0; i<n; i++){
            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double media = soma / n;

        System.out.printf("AVERAGE HEIGHT = %.2f", media);

        sc.close();
    }
}