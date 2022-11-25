import java.util.Scanner;

public class LargestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число равное или больше 2");
        int inputNumber = scanner.nextInt();
        int diviner = 0;

        while (inputNumber < 2) {
            System.out.println("Введите число равное или больше 2");
            inputNumber = scanner.nextInt();
        }

        for (int i = 1; i < inputNumber; i++) {
            if (inputNumber % i == 0) diviner = i;
        }
        System.out.println(diviner);
    }
}