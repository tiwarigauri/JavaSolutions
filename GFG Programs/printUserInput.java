import java.util.Scanner;

class printUserInput {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Number entered by user is : " + x);
        sc.close();
    }
}