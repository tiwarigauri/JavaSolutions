import java.util.Scanner;

public class firstNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter the value of N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        System.out.println("The N natural numbers are : ");
        do {
            System.out.println(i);
            i++;
        } while (i <= N);

    }
}
