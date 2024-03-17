/*Author: Dylan Sedeno  
  Course: COP 2800 293-2627
  Date: 3/12/19

   Assignment: #7
   Instructor: Dr.Sergio Pisano
 */

package tileFloor;

public class Room {

	//Variables to be used
	private boolean Value = true;
	
	RoomTile Tile = new RoomTile();
	 
	
	public boolean compareRoomNames (String roomName, String roomName2){
		// there are two strings to make comparing names easier	
		if (roomName.equalsIgnoreCase(roomName2) ) {
			
			Value = true;
		}
		else {
			Value = false;
		}
		
		
		return Value;
	}
	
	

}
