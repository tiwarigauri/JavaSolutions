import java.util.Scanner;

public class checkTypeOfWebsite {
    public static void main(String[] args) {
        System.out.println("Please enter any website url");
        Scanner sc = new Scanner(System.in);
        String url = sc.nextLine();
        if (url.contains(".com")) {
            System.out.println("Commercial Website");
        } else if (url.contains(".org")) {
            System.out.println("Organization Website");
        } else if (url.contains(".in")) {
            System.out.println("Indian Website");
        }
    }
}
