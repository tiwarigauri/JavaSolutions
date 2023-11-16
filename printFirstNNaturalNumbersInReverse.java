import java.util.Scanner;

public class printFirstNNaturalNumbersInReverse {
    public static void main(String[] args) {
        System.out.println("Please enter the value of N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("The first N Natural numbers in reverse order is : ");
        for (int i = N; i > 0; i--) {
            System.out.println(i);
        }
    }
}
