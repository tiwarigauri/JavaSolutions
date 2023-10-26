import java.util.*;

public class detectDoubleTrippleSpaces {
    public static void main(String[] args) {
        System.out.println("Please enter any string with double and tripple spaces");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        // if the value comes to be -1 for any of the below statements, it means there
        // is no double or tripple space
        System.out.println(s1.indexOf("  "));
        System.out.println(s1.indexOf("   "));

    }
}
