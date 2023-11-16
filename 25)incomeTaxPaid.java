import java.util.Scanner;

public class incomeTaxPaid {
    public static void main(String[] args) {
        System.out.println("Please enter your annual income in lakhs per annum");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0.0f;
        if (income > 10.0) {
            tax = (30 * income) / 100;
        } else if (income >= 5.0 && income <= 10.0) {
            tax = (20 * income) / 100;
        } else if (income >= 2.5 && income <= 5.0) {
            tax = (5 * income) / 100;
        } else {
            System.out.println("No tax needs to be paid");
        }

        System.out.println("Tax paid : " + tax + "lakhs");
    }
}
