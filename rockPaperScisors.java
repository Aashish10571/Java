import java.util.Random;
import java.util.Scanner;

public class rockPaperScisors {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(3);

        Scanner inp = new Scanner(System.in);
        System.out.println("choose between rock, paper, scissor");
        System.out.print("your choice : ");
        String myChoice = inp.next();

        String compChoice = "";
        if (n == 0) {
            compChoice = "rock";
        } else if (n == 1) {
            compChoice = "paper";
        } else {
            compChoice = "scissors";
        }

        System.out.println("computer choice : " + compChoice);

        System.out.println();

        if (compChoice.compareToIgnoreCase(myChoice) == 0) {
            System.out.println("draw");
        } else {
            if (compChoice.equalsIgnoreCase("rock") || myChoice.equalsIgnoreCase("rock")) {
                if (compChoice.equalsIgnoreCase("rock")) {
                    if (myChoice.equalsIgnoreCase("paper")) {
                        System.out.println("you won");
                    } else {
                        System.out.println("you lost");
                    }
                } else {
                    if (compChoice.equalsIgnoreCase("paper")) {
                        System.out.println("you lost");
                    } else {
                        System.out.println("you won");
                    }
                }
            } else if (compChoice.equalsIgnoreCase("paper") || myChoice.equalsIgnoreCase("paper")) {
                if (compChoice.equalsIgnoreCase("paper")) {
                    if (myChoice.equalsIgnoreCase("scissors")) {
                        System.out.println("you won");
                    } else {
                        System.out.println("you lost");
                    }
                } else {
                    if (compChoice.equalsIgnoreCase("scissors")) {
                        System.out.println("you lost");
                    } else {
                        System.out.println("you won");
                    }
                }
            } else  {
                if (compChoice.equalsIgnoreCase("scissors")) {
                    if (myChoice.equalsIgnoreCase("rock")) {
                        System.out.println("you won");
                    } else {
                        System.out.println("you lost");
                    }
                } else {
                    if (compChoice.equalsIgnoreCase("rock")) {
                        System.out.println("you lost");
                    } else {
                        System.out.println("you won");
                    }
                }
            }
        }
    }
}
