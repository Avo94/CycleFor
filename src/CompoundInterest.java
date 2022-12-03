import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вас приветствует калькулятор доходности банковских вкладов.");
        System.out.println("Введите сумму вклада:");
        int balance = scanner.nextInt();
        System.out.println("Срок хранения вклада в годах:");
        int year = scanner.nextInt();
        System.out.println("Процентная ставка в год:");
        double interestRate = scanner.nextDouble() * 0.01;

        for (int i = 0; i < year; i++) {
            balance += balance * interestRate;
        }
        System.out.println("Сумма по вкладу составит:");
        System.out.println(balance);
    }
}