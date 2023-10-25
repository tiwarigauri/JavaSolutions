import java.util.*;

public class convertKmsToMiles {
    public static void main(String[] args) {
        System.out.print("Please enter the kilometers : ");
        Scanner sc = new Scanner(System.in);
        int kms = sc.nextInt();
        sc.close();
        float miles = kms * 0.621F;
        System.out.println("In miles it is : " + miles + " miles");
    }
}
