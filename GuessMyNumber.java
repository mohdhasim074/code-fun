import java.util.Scanner;

public class miniProject_Condition {
    public static void main(String[] args) {
        // MINI PROJECT FOR GUESS NUMBER

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0; // this user output number
        do {
            System.out.print("Guess my Number (1-100) :");
            userNumber = sc.nextInt();
            // condition
            if (userNumber == myNumber) {
                System.out.println("Wow : CURRECT NUMBER...!");
                break; // to stop because has been task completed
            } else if (userNumber > myNumber) {
                System.out.println("uff :Your Number is too large.");
            } else {
                System.out.println("Your Number is too small :");
            }

        } while (userNumber >= 0);
        System.out.println("My number was : " + myNumber);
    }
}
