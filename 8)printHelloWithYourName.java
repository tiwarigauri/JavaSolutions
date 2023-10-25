import java.util.*;

public class printHelloWithYourName {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + ",have a good day");
    }
}
