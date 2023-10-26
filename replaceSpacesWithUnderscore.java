import java.util.*;

public class replaceSpacesWithUnderscore {
    public static void main(String[] args) {
        System.out.println("Please enter any name with spaces");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.replace(" ", "_"));
        sc.close();
    }
}
