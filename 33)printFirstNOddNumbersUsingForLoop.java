import java.util.Scanner;

public class printFirstNOddNumbersUsingForLoop {
    public static void main(String[] args) {
        System.out.println("Please enter any natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The first " + n + " odd numbers are : ");
        for (int i = 0; i < (2 * n + 1); i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
