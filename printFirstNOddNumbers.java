import java.util.Scanner;

public class printFirstNOddNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter the value of N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("The first N odd numbers are : ");
        for (int i = 0; i < N; i++) {
            int odd = (2 * i + 1);
            System.out.println(odd);
        }
    }
}
