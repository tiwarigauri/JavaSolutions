import java.util.*;

public class calculateCgpThreeSubjects {
    public static void main(String[] args) {
        System.out.println("Please enter marks of three subjects");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        double cgpa = (s1 + s2 + s3) / (3 * 9.5);
        System.out.println("Your cgpa is : " + cgpa);

    }
}
