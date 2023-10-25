import java.util.*;

public class checkIfItsInteger {
    public static void main(String[] args) {
        System.out.println("Please enter a number : ");
        Scanner sc = new Scanner(System.in);
        boolean b = sc.hasNextInt();
        sc.close();
        System.out.println(b);
    }
}
