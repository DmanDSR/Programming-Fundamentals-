/*
 Author : Dylan Sedeno
Course: COP2800 lab Session
Date: April 4th 2019
Project :Programming Lab 9: Abstract classes and Interfaces 
Instructor: Dr.Pisano
 */

package Ships;

public class CargoShip extends Ship {

	
		//Variables to be used
		private int maxCap; //the max capacity in tonnage (weight in tons)
		
		//sets the max capacity for the cargo ship
		public void setMaxCap(int Capacity) {
			maxCap = Capacity;
		}
		
		//will return the max capacity
		public int getMaxCap() {
			return maxCap;
		}
	
		//outputs the ships info, and overrides ships toString method
		public String toString() {
			return "The Cargo ship name is " + getShipName() +" and its max cargo capacity is " + maxCap + ".";
		}
		

}
