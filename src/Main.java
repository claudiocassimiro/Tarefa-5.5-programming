import java.util.Scanner;

public class Main {
    public static int recursiveSum(int number) {
        if (number < 10) {
            return number;
        }

        return number % 10 + recursiveSum(number / 10);
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Adicione um número inteiro positivo: ");
            number = scanner.nextInt();
        } while (number < 0);

        int sum = recursiveSum(number);

        System.out.println("A soma entre os digitos do número inteiro é: " + sum);
    }
}