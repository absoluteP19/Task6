public class Main {
    public static void main(String[] args) {
        for (double i = 1; i < 11; i++) {
            double result = 1 / i;
            int number = (int) i;
            System.out.printf("%.2f", result);
            System.out.println("|" + number);
        }
    }
}
