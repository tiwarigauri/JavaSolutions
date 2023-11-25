import java.util.Scanner;

public class printMultiplicationTableInReverseOrder {
    public static void main(String[] args) {
        System.out.println("Please enter any natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 10; i > 0; i--) {
            int product = n * i;
            System.out.println(n + " * " + i + " = " + product);
        }

    }
}
