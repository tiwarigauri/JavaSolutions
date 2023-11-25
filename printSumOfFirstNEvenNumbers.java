import java.util.Scanner;

public class printSumOfFirstNEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter any natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= (2 * n); i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of first " + n + " even numbers is : " + sum);
    }
}
