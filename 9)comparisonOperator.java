import java.util.*;

class comparisonOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("Please enter any number");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(x < y);
        sc.close();
    }
}
