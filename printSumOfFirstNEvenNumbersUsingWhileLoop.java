import java.util.Scanner;

public class printSumOfFirstNEvenNumbersUsingWhileLoop {
    public static void main(String[] args) {
        System.out.println("Please enter any natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while (i <= (2 * n)) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("The sum of first " + n + " even numbers is : " + sum);
    }
}
