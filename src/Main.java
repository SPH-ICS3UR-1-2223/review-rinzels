import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//Quick review of reading from the screen
		System.out.println("Welcome to the review program!\nWhat's your name?");
		//Read in the name and save it.
		String name = in.nextLine(); //read the next line from the screen
		System.out.println("Welcome "+name+"! What's your favourite number?");
		//Read in a number
		int favouriteNumber = in.nextInt(); //reads an integer from the screen.
		
		
		/**************************************
		 * IF STATEMENTS
		 **************************************/
		if (favouriteNumber<0) {
			System.out.println("Whoa! You like negative numbers?");
		}else if (favouriteNumber==0) {
			System.out.println("So your favourite is nothing?");
		}else {
			System.out.println("Yeah, that's pretty positive of you!");
		}
		
		/******************************************
		 * WHILE LOOP
		 ******************************************/
		Random rnd=new Random(); //Build a new Random number generator
		//rnd.nextInt(high-low+1)+low
		int randomNum=rnd.nextInt(10)+1;
		int userGuess;
		do {
			System.out.println("Guess my random number!");
			userGuess=in.nextInt();
			
		}while (userGuess!=randomNum);
		System.out.println("You finally got it!");
		
		favouriteNumber = Math.abs(favouriteNumber);
		//while the number is bigger than zero
//		while (favouriteNumber>0) {
//			System.out.println(favouriteNumber);
//			favouriteNumber--;
//		}
		
		/*************************************
		 * FOR LOOP
		 *************************************/
		for (int counter=favouriteNumber;counter>0;counter--) {
			System.out.println(counter);
		}
		
		in.close();
	}

}
