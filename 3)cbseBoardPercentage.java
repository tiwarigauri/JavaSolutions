import java.util.*;

class cbseBoardPercentage {
    public static void main(String[] args) {
        System.out.println("Please enter the total marks of subjects : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Please enter marks for all 5 subjects : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int percentage = ((a + b + c + d + e) * 100) / (5 * n);
        System.out.println("Your percentage is : " + percentage + "%");
    }
}
