import java.util.Scanner;

public class AbstractDemo {
    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Please enter your name: ");
        input = scan.nextLine();

        if (input .equals("Varun") || input .equals("varun")) {
            Varun man = new Varun(input);
            man.setFamily();
            man.customMessage();
        } else if (input .equals("Shrikant") || input .equals("shrikant")) {
            Shrikant man = new Shrikant(input);
            man.setFamily();
            man.customMessage();
        } else if (input .equals("Kumar") || input .equals("kumar")) {
            Kumar man = new Kumar(input);
            man.setFamily();
            man.customMessage();
        } else
            System.out.println("Sorry friend. You're not a known member of the group, yet");
    }
}
