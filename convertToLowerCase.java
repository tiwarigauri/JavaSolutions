import java.util.*;

class convertToLowerCase {
    public static void main(String[] args) {
        System.out.println("Please enter name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("In lower case the name is : " + name.toLowerCase());
        sc.close();
    }
}