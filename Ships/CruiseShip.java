/*
 Author : Dylan Sedeno
Course: COP2800 lab Session
Date: April 4th 2019
Project :Programming Lab 9: Abstract classes and Interfaces 
Instructor: Dr.Pisano
 */

package Ships;

public class CruiseShip extends Ship {

	
		//Variables to be used
		private int maxCap; //the max capacity
		
		//sets the max capacity of people
		public void setMaxCap (int Capacity) {
			maxCap = Capacity;
		}
		
		//returns the max capacity 
		public int getMaxCap() {
			return maxCap;
		}
	
		//outputs the ships info, and overrides ships toString method 
		public String toString() {
			return "The Cruise ship name is " + getShipName() +" it was build in " + getShipDate() + " and its max passanger capacity is "
					+ maxCap + ".";
		}
		

}
