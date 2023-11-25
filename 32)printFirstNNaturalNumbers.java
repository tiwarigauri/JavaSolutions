import java.util.Scanner;

public class printFirstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter any natural number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        System.out.println("The first " + n + " natural numbers are : ");
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
