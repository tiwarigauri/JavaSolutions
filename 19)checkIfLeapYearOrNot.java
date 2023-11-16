import java.util.Scanner;

public class checkIfLeapYearOrNot {
    public static void main(String[] args) {
        System.out.println("Please enter any year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int result;
        if (year % 100 != 0) {
            result = year % 4;
        } else {
            result = year % 400;
        }
        if (result == 0) {
            System.out.println("Its a Leap Year");
        } else {
            System.out.println("Its a Normal Year");
        }

    }
}
