/*
 Author : Dylan Sedeno
Course: COP2800 lab Session
Date: April 4th 2019
Project :Programming Lab 9: Abstract classes and Interfaces 
Instructor: Dr.Pisano
 */


package Ships;

public class Ship {



		//Variables to be used
		private String shipName;
		private int shipDate;
		
		//sets the ships name and date
		public void setShipVar (String Name, int Date) {
			
			shipName = Name;
			shipDate = Date;
			
		}
		
		//returns the ships name
		public String getShipName() {
			return shipName;
		}
		
		//returns the ships date it was built
		public int getShipDate() {
			return shipDate;
		}
		
		//outputs the ships info
		public String toString() {
			return "The ships name is " + shipName + " it was built in " + shipDate + ".";
		}
		
		
	

}
