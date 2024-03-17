/*Author: Dylan Sedeno  
  Course: COP 2800 293-2627
  Date: 2/26/19

   Assignment: #6
   Instructor: Dr.Sergio Pisano
 */

package coinToss;

import java.util.*;// this is to import the scanner and random classes
import java.io.*;// this is to import the print writer class



public class Coin  { 
	
	
	//variables to be used
	Random t = new Random();//this is so we have a random number picked from a certain scope
	private String sideUp, Both; //This is to hold the value heads or tails
	int Coin, Heads = 0, Tails = 0;
	String fileName = "CoinTossInfo";
	File readFile = new File (fileName);//so the file can be called to read
	//Scanner File = new Scanner(readFile);//so the file can be read
	

	
	

	//this is to return the toss method
	public Coin() {
		Toss();
	}
	//this method is for flipping the coin
	public void Toss() {
		Coin = t.nextInt(2);// this specifies form what numbers the scope is from here its from 0 to 1
		if (Coin == 0) {
			
			sideUp = "Heads";
			Heads++;//this is to keep track of numbers of heads
		}
		else {
			sideUp = "Tails";
			Tails++;// this is to keep track of number of tails
		}
	}
	
	public String numOfFaces() {
		
		 Both = "there were " + Heads + " Heads and " + Tails + " Tails";
		
		return Both;
	}
	
	public String getsideUp() {
		return sideUp;
	}
	
	public Scanner showPastRun(/*Scanner File*/) throws FileNotFoundException {
		Scanner File = new Scanner(readFile);//so the file can be read
		File.useDelimiter("\\Z");// this is so we can use the file.next with out errors
		
		System.out.println(File.next());//this is to print out what is in the output file named Coin Toss Info
		//File.next(sideUp); // this was for something else i was thinking of
		//File.nextInt(Heads);
		//File.nextInt(Tails);
		
		
		return File;
	}
}
