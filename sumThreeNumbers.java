import java.util.*;

public class sumThreeNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter three numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int sum = x + y + z;
        System.out.println("Sum of three numbers is : " + sum);
    }
}
