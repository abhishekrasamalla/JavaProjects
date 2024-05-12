import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random o1 = new Random();
        int random = o1.nextInt(100);
        int choices = 3;
        int cscore = 0;
        int uscore = 0;

        System.out.println("OP is generated a number between 1 to 100,match that number you have 3 choices");

        for (int i = 1; i <= choices; i++) {
            int userinput = sc.nextInt();

            if (userinput > random) {
                System.out.println("you are number is too High");

            }

            else if (userinput < random) {
                System.out.println("your are number is too Low");
            }

            else {
                System.out.println("both are equal congrationals");
                uscore++;
                System.out.println("user score is " + uscore);
                break;
            }

            if (i == choices) {
                System.out.println("sorry try again");
                cscore++;
                System.out.println("computer score is " + cscore);
            }
        }
        sc.close();

    }
}
