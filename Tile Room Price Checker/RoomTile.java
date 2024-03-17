/*Author: Dylan Sedeno  
  Course: COP 2800 293-2627
  Date: 3/12/19

   Assignment: #7
   Instructor: Dr.Sergio Pisano
 */


package tileFloor;

public class RoomTile {

	//Variables to be used
	private double totalCost;
	
	RoomSize size = new RoomSize();
	
	//to figure out the total cost for the room
	public double totalCost(double perSquare, double Area) {
		
		
		
		totalCost = perSquare * Area;
		
		
		return totalCost;
	}
	



}
