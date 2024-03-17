
package coinToss;

import java.io.*;
import java.time.*;// this is so i can do the local time/date
import java.util.Scanner;//this is imported so we can get user input

public class Driver {
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//variables to be used
		
		Scanner in = new Scanner(System.in);
		String Answer;
		boolean repeat = true, Repeat2 = true;// used to see if they want to do a another run
		int tossNum, Tosses = 0;
		Coin coinToss = new Coin();
		String fileName = "CoinTossInfo";//name of file and where it is located can change when put on different device
		LocalTime localTime = LocalTime.now();//for todays time
		LocalDate localDate = LocalDate.now();//for todays Date
		//LocalTime localTime = LocalTime.now();//for todays time
		//LocalDate localDate = LocalDate.now();//for todays Date
		//File readFile = new File (fileName);//so the file can be called to read
		//Scanner File = new Scanner(readFile);//so the file can be read
		
		
		//the start of asking the user what they want to do
		System.out.println("Hello this is the Coin Toss Simulator, do you want to see the past run?");
		System.out.print("Yes or No? ");
		Answer = in.next();
		
		//used to decide to flip the coin or see past run
		if(Answer.equalsIgnoreCase("Yes")) {
			
			//File.useDelimiter("\\Z"); // this is so the file.next can work in this class
			
			
			
			
			System.out.println("Alright here is the past run ");
			//System.out.println(File.next()); // this is if you want to get the past info from this class
			
			 coinToss.showPastRun();//this is calling the show past run method from the Coin class
			 
			repeat = false;//so the while loop doesn't start
			Repeat2 = false;
			
			System.out.println(" ");//just a space
			System.out.println("Have a nice day.");
		}
		else {
			System.out.println("New Coin-Toss Simulator Run:");
		}
		
		
		//System.out.println("New Coin-Toss Simulator Run:");
		
		//this loop is to repeat if they want to do another run of flips
		while (repeat == true) {
			
			
			PrintWriter outputFile = new PrintWriter(fileName);// this is to make the file thats gonna have the text	
			
		System.out.println(" ");// just a space
		
		coinToss.Toss(); // to toss the coin before telling them what it is
		
		System.out.println("This will be your starting face. " + coinToss.getsideUp() );
		
		outputFile.println(" "); // these four lines of code if to put the data into the output file
		outputFile.println("Coin-Toss Simulator Run:" + localDate + "  " + localTime);
		outputFile.println("Started off with " + coinToss.getsideUp());
		outputFile.println(" ");
		
		System.out.print("How many times do you want to flip the coin. ");
		tossNum = in.nextInt();
		
		coinToss.Tails = 0;// this is so the tails variable in Coin class is zero with out this will give it an extra 1
		coinToss.Heads = 0;// did this for heads as well just in case
		
		//used to doing the flipping 
		while (Tosses < tossNum ) {
			
			coinToss.Toss();//to toss the coin
			
			outputFile.println("Side up is: " + coinToss.getsideUp());// this is for the output file
		
			
			System.out.println("Side up is: " + coinToss.getsideUp());
			
			Tosses++;//so we don't get stuck in loop of flipping
		}
		
		System.out.println(coinToss.numOfFaces());
		
		outputFile.println(" ");// this is for the output file
		outputFile.println (coinToss.numOfFaces());
		
		System.out.println(" ");
		//to see if they want to do another round of flipping
		 System.out.println("Would you like to do another run? ");
		 System.out.print("Yes or No? ");
		 Answer = in.next();
		 
		 //this is so if they don't want to do more flipping the loop stops 
		 if (Answer.equalsIgnoreCase("No")) {
			 
			 repeat = false;
			 //System.out.println("Goodbye have a nice day.");
			Repeat2 = true;
			 outputFile.close();//this is to close the output file if they don't want to do more runs
		 }
		 else if (Answer.equalsIgnoreCase("Yes")){//to keep the loop going
			 
			 repeat = true;
			 Repeat2 = false;
			 Tosses = 0; // to reset the tosses variable to 0 so the while loop will go again
			 coinToss.Tails = 0;// this is so when the loop restarts the value will start from zero
			 coinToss.Heads = 0;// this is so when the loop restarts the value will start from zero
			 
		 }
		 
		}
			
	
	//}
		
	
	//Scanner in = new Scanner(System.in);
	//String Answer;
	//boolean repeat = true, Repeat2 = true;// used to see if they want to do a another run
	//int tossNum, Tosses = 0;
	//Coin coinToss = new Coin();
	//String fileName = "CoinTossInfo";//name of file and where it is located can change when put on different device
	
	
			//File readFile = new File (fileName);//so the file can be called to read
			//Scanner File = new Scanner(readFile);//so the file can be read
			
		if (Repeat2 == true) {	
		 
		 System.out.println(" Do you want to see the past run?");
			System.out.print("Yes or No? ");
			Answer = in.next();
			
			//used to decide to flip the coin or see past run
			if(Answer.equalsIgnoreCase("Yes")) {
				
				//File.useDelimiter("\\Z"); // this is so the file.next can work in this class
				
				
				
				
				System.out.println("Alright here is the past run ");
				//System.out.println(File.next()); // this is if you want to get the past info from this class
				
				 coinToss.showPastRun();//this is calling the show past run method from the Coin class
				 
				repeat = false;//so the while loop doesn't start
				
				System.out.println(" ");//just a space
				System.out.println("Have a nice day.");
			}
			else {
				System.out.println("Alright have a nice day.");
			}
		}
		in.close();//to close the scanner named in
		//File.close();// to close the scanner named file
	}

}
	
/*  *run # 1
 Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Tails
How many times do you want to flip the coin. 20
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Heads
there were 13 Heads and 7 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:17:46.879524800
Started off with Tails
 
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Heads
 
there were 13 Heads and 7 Tails
 
Have a nice day.

*run# 2
Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Tails
How many times do you want to flip the coin. 7
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
there were 3 Heads and 4 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:18:32.093074300
Started off with Tails
 
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
 
there were 3 Heads and 4 Tails
 
Have a nice day.

*run # 3

Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Heads
How many times do you want to flip the coin. 4
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
there were 2 Heads and 2 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:19:17.412817700
Started off with Heads
 
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
 
there were 2 Heads and 2 Tails
 
Have a nice day.


*run# 4
Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Tails
How many times do you want to flip the coin. 35
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
there were 18 Heads and 17 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:19:47.564672800
Started off with Tails
 
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
 
there were 18 Heads and 17 Tails
 
Have a nice day.

*run# 5

Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Heads
How many times do you want to flip the coin. 8
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
there were 4 Heads and 4 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:20:21.128086900
Started off with Heads
 
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
 
there were 4 Heads and 4 Tails
 
Have a nice day.

*run # 6

Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Tails
How many times do you want to flip the coin. 9
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
there were 2 Heads and 7 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:20:54.201500800
Started off with Tails
 
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Tails
 
there were 2 Heads and 7 Tails
 
Have a nice day.

*run# 7

Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? no
New Coin-Toss Simulator Run:
 
This will be your starting face. Heads
How many times do you want to flip the coin. 12
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
there were 5 Heads and 7 Tails
 
Would you like to do another run? 
Yes or No? no
 Do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:21:36.670945500
Started off with Heads
 
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
 
there were 5 Heads and 7 Tails
 
Have a nice day.

*run# 8 when you say yes at the beginning after you do one round

Hello this is the Coin Toss Simulator, do you want to see the past run?
Yes or No? yes
Alright here is the past run 
 
Coin-Toss Simulator Run:2019-02-26  22:21:36.670945500
Started off with Heads
 
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Heads
Side up is: Heads
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
Side up is: Heads
Side up is: Tails
Side up is: Tails
 
there were 5 Heads and 7 Tails
 
Have a nice day.

*/

