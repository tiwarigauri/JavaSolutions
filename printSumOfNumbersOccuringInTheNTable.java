import java.util.Scanner;

public class printSumOfNumbersOccuringInTheNTable {
    public static void main(String[] args) {
        System.out.println("Please enter any natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " * " + i + " = " + product);
            sum = sum + product;
        }
        System.out.println(sum);
    }
}
