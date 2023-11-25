import java.util.Scanner;

public class findFactorialOfN {
  public static void main(String[] args) {
    System.out.println("Please enter any natural number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }
    System.out.println("Factorial of your number is : " + factorial);
  }
}
