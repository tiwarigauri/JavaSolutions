import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorGame {
    public static void main(String[] args) {
        System.out.println(
                "Please enter any whole number less than 3 where 0 means rock, 1 means paper, 2 means scissor");
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        Random r = new Random();
        int computer = r.nextInt(3);
        System.out.println(computer);
        if (user < 3) {
            if (user == computer) {
                System.out.println("Its a tie");
            } else if (user == 0) {
                if (computer == 1) {
                    System.out.println("Computer wins");
                } else {
                    System.out.println("user wins");
                }
            } else if (user == 1) {
                if (computer == 0) {
                    System.out.println("User wins");
                } else {
                    System.out.println("Computer wins");
                }
            }

            else if (user == 2) {
                if (computer == 0) {
                    System.out.println("Computer wins");
                } else {
                    System.out.println("User wins");
                }
            }
        } else {
            System.out.println("Invalid choice");
        }

    }
}
