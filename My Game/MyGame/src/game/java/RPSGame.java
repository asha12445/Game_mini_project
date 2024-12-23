package game.java;

import java.util.Random;
import java.util.Scanner;

public class RPSGame {
	 public static void main(String[] args) {
	        Random random = new Random();
	        Scanner scanner = new Scanner(System.in);
	        int userScore = 0;
	        int computerScore = 0;
	        
	        System.out.println("Hello! Welcome To the Game...");
	        System.out.println("Enter Username:");
	        String name=scanner.nextLine();
	        System.out.println("Hii "+name+" Start your game...");
	        while (true) {
	            System.out.println("Choose your choice (rock, paper, scissors):");
	            String userChoice = scanner.nextLine().toLowerCase();

	            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
	                System.out.println("Invalid choice. Please try again.");
	                continue;
	            }

	            String computerChoice = getComputerChoice(random);
	            System.out.println("Computer chose: " + computerChoice);

	            String winner = determineWinner(userChoice, computerChoice);
	            System.out.println(winner);

	            if (winner.equals("You win!")) {
	                userScore++;
	            } else if (winner.equals("Computer wins!")) {
	                computerScore++;
	            }

	            System.out.println("Score - You: " + userScore + ", Computer: " + computerScore);
	            System.out.println("Do you want to Play again? "+name+" (yes/no):");
	            String playAgain = scanner.nextLine().toLowerCase();

	            if (!playAgain.equals("yes")) {
	            	System.out.println("Thank you for playing, " + name + "!");
	            	
	                break;
	            }
	        }
	        
	    }


	    private static String getComputerChoice(Random random) {
	        String[] choices = {"rock", "paper", "scissors"};
	        return choices[random.nextInt(choices.length)];
	    }

	    private static String determineWinner(String userChoice, String computerChoice) {
	        if (userChoice.equals(computerChoice)) {
	            return "It's a tie!";
	        }

	        switch (userChoice) {
	            case "rock":
	                return computerChoice.equals("scissors") ? "You win!" : "Computer wins!";
	            case "paper":
	                return computerChoice.equals("rock") ? "You win!" : "Computer wins!";
	            case "scissors":
	                return computerChoice.equals("paper") ? "You win!" : "Computer wins!";
	            default:
	                return "";
	        }
	    }
	    
	}




