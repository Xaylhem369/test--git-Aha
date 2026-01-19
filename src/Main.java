import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        System.out.println("Hello");
        System.out.println("Aha");
        System.out.println("Did you know that Aha used a worm to make the Emanator of Aha aka.Elation? [Y/N]");
        answer = sc.nextLine();
        if (answer.equalsIgnoreCase("Y"))
        {
            System.out.println("Want to be a follower of Aha? [Y/N]");
            answer = sc.nextLine();
            if (answer.equalsIgnoreCase("Y"))
            {
                System.out.println("THEN WE SHALL CREATE CHAOS TOGETHER");
            }
            else {
                System.out.println("YOU LITTLE PIECE OF ****, BEHOLD THE POWER OF THE AEON");
            }
        }
        else {
            System.out.println("You jerk, how dare you disrespect Aha");
        }

    }
}
