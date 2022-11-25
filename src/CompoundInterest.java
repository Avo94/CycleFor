public class CompoundInterest {
    public static void main(String[] args) {

        int balance = 1000;
        int year = 2;
        double interestRate = 0.1;

        for (int i = 0; i < year; i++) {
            balance += balance * interestRate;
        }
        System.out.println(balance);
    }
}