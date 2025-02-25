import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String playA;
        String playB;
        Scanner in = new Scanner(System.in);
        boolean doneA = false;
        boolean doneB = false;
        boolean replayGame = false;
        String gameReplay;
        do {
            do {
                System.out.println("Player A, please enter your move choice (R, P or S): ");
                playA = in.next();
                if (playA.equalsIgnoreCase("R") || playA.equalsIgnoreCase("P") || playA.equalsIgnoreCase("S")) {
                    doneA = true;
                } else {
                    System.out.println("Player A, please enter a valid move (R, P or S).");
                }
            } while (doneA == false);
            do {
                System.out.println("Player B, please enter your move choice (R, P or S): ");
                playB = in.next();
                if (playB.equalsIgnoreCase("R") || playB.equalsIgnoreCase("P") || playB.equalsIgnoreCase("S")) {
                    doneB = true;
                } else {
                    System.out.println("Player B, please enter a valid move (R, P or S).");
                }
            } while (doneB == false);
            if (playA.equalsIgnoreCase("R")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock, its a tie!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper covers Rock, player B wins!");
                } else //player B is scissor
                {
                    System.out.println("Rock breaks Scissors, player A wins!");
                }
            }
            if (playA.equalsIgnoreCase("P")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock, player A wins!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper, its a tie!");
                } else //player B is scissor
                {
                    System.out.println("Scissor cuts Paper, player B wins!");
                }
            }
            if (playA.equalsIgnoreCase("S")) {
                if (playB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, player B wins!");
                } else if (playB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper, Player A wins!");
                } else //player B is scissor
                {
                    System.out.println("Scissors vs Scissors, its a tie!");
                }
            }
            System.out.println("Would you like to play again? (Y/N).");
            gameReplay = in.next();
            if (gameReplay.equalsIgnoreCase("N")) {
                replayGame = false;
            } else if (gameReplay.equalsIgnoreCase("Y")) {
                replayGame = true;
            } else {
                System.out.println("Invalid input, please enter Y or N.");
                replayGame = false; // stop the game if invalid input
            }

        } while (replayGame==true);
    }
}