import java.util.Scanner;

public class checkPassOrFail {
    public static void main(String[] args) {
        System.out.println("Please enter the marks of Physics, Chemstry and Maths");
        Scanner sc = new Scanner(System.in);
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Maths = sc.nextInt();
        if (Physics >= 33 && Chemistry >= 33 && Maths >= 33) {
            int percentage = (Physics + Chemistry + Maths) / 3;
            System.out.println("Your totak percentage is : "+percentage);
            if (percentage >= 40) {
                System.out.println("You are Pass");
            } else {
                System.out.println("You are Fail");
            }

        } else {
            System.out.println("You are Fail");
        }

    }
}
