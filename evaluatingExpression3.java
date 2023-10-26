import java.util.*;

public class evaluatingExpression3 {
    public static void main(String[] args) {
        int u, v, a, s, result;
        System.out.println("Please enter the values of u,v,a,s");
        Scanner sc = new Scanner(System.in);
        u = sc.nextInt();
        v = sc.nextInt();
        a = sc.nextInt();
        s = sc.nextInt();
        result = (v * v - u * u) / (2 * a * s);
        System.out.println("The result is : " + result);
        sc.close();
    }
}
