import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"Rock", "Paper", "Scissors"};
        
        int userWins = 0;
        int computerWins = 0;
        int totalGames = 0;

        while (totalGames < 5) {
            System.out.print("Enter your choice (Rock, Paper, Scissors): ");
            String userChoice = scanner.nextLine().trim().toLowerCase();

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input, please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (userChoice.equals("rock")) {
                if (computerChoice.equals("Rock")) {
                    System.out.println("It's a tie!");
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("Computer wins!");
                    computerWins++;
                } else {
                    System.out.println("You win!");
                    userWins++;
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("Rock")) {
                    System.out.println("You win!");
                    userWins++;
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("It's a tie!");
                } else {
                    System.out.println("Computer wins!");
                    computerWins++;
                }
            } else if (userChoice.equals("scissors")) {
                if (computerChoice.equals("Rock")) {
                    System.out.println("Computer wins!");
                    computerWins++;
                } else if (computerChoice.equals("Paper")) {
                    System.out.println("You win!");
                    userWins++;
                } else {
                    System.out.println("It's a tie!");
                }
            }

            totalGames++;
            System.out.println("Current score: You " + userWins + " - " + computerWins + " Computer");
            System.out.println();
        }

        if (userWins > computerWins) {
            System.out.println("Congratulations! You won the best of 5 games.");
        } else if (computerWins > userWins) {
            System.out.println("Computer wins the best of 5 games. Better luck next time!");
        } else {
            System.out.println("It's a tie after 5 games!");
        }

        scanner.close();
    }
}
