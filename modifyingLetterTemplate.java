import java.util.*;

public class modifyingLetterTemplate {
    public static void main(String[] args) {
        System.out.println("Please enter any two names");
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();
        String name2 = sc.next();
        String letter = "Dear " + name1 + " Thanks a lot";
        System.out.println(letter);
        System.out.println(letter.replace(name1, name2));
        sc.close();
    }
}
