import java.util.Random;
import java.util.Scanner;

/*
Mini Project 1
Group 7: Ioana Guna, Jealee Jones, Mary Safowah, McKenzie Custer
Date: 09/25/2020
*/

class Main {
  public static void main(String[] args) {
    
    System.out.println("Welcome to the guessing game!");
    System.out.println("Please enter any positive whole number: ");
    
    Random r = new Random();
    Scanner s = new Scanner(System.in);

    int upperBound = s.nextInt();
    int number = r.nextInt(upperBound - 1) + 1;
    
    System.out.println("A random number to guess has been generated ");
    
    System.out.println("Please guess a number between 0 and " + upperBound);
    
    int guess = s.nextInt();
    
    playGame(guess, number);
    }

    public static void playGame(int theGuess,int theNumber)
    {
     
    Scanner sc = new Scanner(System.in);
    int userGuess = theGuess;
    
    int count = 1;

    while(userGuess != theNumber) {
      if(userGuess < theNumber)  {
        System.out.println("Guess higher!");
    }
      else if (userGuess > theNumber) {
        System.out.println("Guess lower!");
      }
      System.out.println("Enter your new guess: ");
      userGuess = sc.nextInt();
      count = count + 1;
    }
      System.out.println("Great, you win! It took you " + count + " tries.");
  }
}