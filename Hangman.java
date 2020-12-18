/* Consider a class that could be used to play a game of hangman. The class has the following attributes:
•	The secret word
•	The disguised word, in which each unknown letter in the secret word is replaced with a question mark 
(?). For example, if the secret word is abracadabra, and the letters a , and b have been guessed, the 
disguised word would be ab?a?a?ab?a
•	The number of guesses made
•	The number of incorrect guesses
It will have the following methods:
•	MakeGuess(c) guesses that character c is in the word
•	getDisguisedWord returns a string containing correctly guessed letters in their correct positions 
and unknown letters replaced with ?
•	getSecretWord returns the secret word
•	getGuessCount returns the number of guesses made
•	isFound returns true if the hidden word has been discovered.
Perform the following actions:
•	Write a method heading for each method.
•	Write preconditions and postconditions for each method.
•	Write some Java statements that test the class.
•	Implement the class.
•	List any additional methods and attributes needed in the implementation that were not listed in 
the original design. List any other changes made to the original design.
•	Write a program that implements the game of handgman, using the class you wrote for part d. */

/* FAIR WARNING! I DID NOT MAKE METHOD MakeGuess(c), I MADE A METHOD WITH NO PARAMTERS! MY PROFESSOR
WAS FINE WITH IT AS I BELIEVE MY SOLUTION IS BETTER; YOURS MAY NOT FEEL THE SAME. YMMV. */

import java.util.Scanner;
public class Hangman{
	private int guessCount = 0;
	private int correctGuessCount = 0;
	private int incorrectGuessCount = 0;
	private int guessLimit;
	private String secretWord;
	private String disguisedWord = "";
	private String newDisguisedWord = "";
	private boolean wordFound = false;
	private String guess;
	private Scanner keyboard = new Scanner(System.in);
	
	private boolean isFound(){
			return wordFound;
	}
	private int getGuessCount(){
		return guessCount;
	}
	private String getSecretWord(){
		return secretWord;
	}
	private String getDisguisedWord(){
		return disguisedWord;
	}
	public void hangmanInitialize(){
		System.out.println("Player 1 will enter a secret word for player 2 to guess.");
		System.out.print("Player 1 Please enter the secret word: ");
		secretWord = keyboard.next();
		secretWord = secretWord.trim();
		secretWord = secretWord.toLowerCase();
		for (int i = 0; i < secretWord.length(); i ++){
			disguisedWord += "?";
		}
		guessLimit = secretWord.length();
		newDisguisedWord = "";
		for (int i = 0; i < 25; i ++){
			System.out.println("----------------------------------------------------------------------------------");
		}
		System.out.println("Player 2 your secret word is " + guessLimit + " letters long ");
		System.out.println("-----> " + disguisedWord + " <-----");
		System.out.println("You have " + guessLimit + " attempts left to guess the word.");
		System.out.println("Counter is set to " + guessCount);
		makeGuess();
	}
	private void makeGuess(){
		if (guessLimit > 0){
			System.out.println("Current state: " + disguisedWord);
			System.out.println("Guesses left: " + guessLimit);
			System.out.println("Guesses made: " + guessCount);
			System.out.println("Guess a letter in the word: ");
			guess = keyboard.next();
		}
		else if (guessLimit <= 0){
			System.out.println("No guesses left... YOU LOSE!");
			System.exit(0);
		}
		checkGuess();
	}
	private void checkGuess(){
		
		newDisguisedWord = "";
		
		for (int i = 0; i < secretWord.length(); i++){
			if (secretWord.charAt(i) == guess.charAt(0)){
				newDisguisedWord += guess.charAt(0);
			}
			else if ((disguisedWord.charAt(i)) != '?'){
				newDisguisedWord += disguisedWord.charAt(i);
			}
			else {
				newDisguisedWord += "?";
			}
		}
		countUpdate();
	}
	private void countUpdate(){
		if (disguisedWord.equals(newDisguisedWord)){
			guessCount ++;
			incorrectGuessCount ++;
			guessLimit --;
		}
		else {
			guessCount ++;
			correctGuessCount ++;
			disguisedWord = newDisguisedWord;
		}
		checkFinal();
	}
	private void checkFinal(){
		if (disguisedWord.equals(secretWord)){
			wordFound = true;
			System.out.println("Word has been found: ");
			System.out.println("----->" + secretWord + "<-----");
			System.out.println("YOU WIN! GOOD JOB");
			System.exit(0);
		}
		else{
			makeGuess();
		}
	}
	public static void main (String[] args){
	
		Hangman newGame = new Hangman();
		newGame.hangmanInitialize();
	}
}