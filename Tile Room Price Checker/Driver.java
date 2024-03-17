/*Author: Dylan Sedeno  
  Course: COP 2800 293-2627
  Date: 3/12/19

   Assignment: #7
   Instructor: Dr.Sergio Pisano
 */

package tileFloor;

import java.util.*;

public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Variables to be used
		Scanner input = new Scanner(System.in);
		RoomSize sizeA = new RoomSize();//for the first room
		RoomSize sizeB = new RoomSize();//for the second room
		RoomTile tileA = new RoomTile();//for the first room
		RoomTile tileB = new RoomTile();//for the second room
		
		Room roomA = new Room();
		String roomName = " ", roomName2 = " ", Answer;
		double perSquare = 0, perSquare2 = 0, Length = 0 , Width = 0, Length2 = 0, Width2 = 0, both;
		boolean repeat = false, repeat2 = false;// so I have a way to get out of the loop
		
		
		//code to ask what the customer wants
		
		System.out.println("Hello, welcome to Robinson's Tile Store.");
		
		
		
		while(repeat == false) {// this loop is so they can put in the info for the second room
			
		System.out.println(" ");
			
		System.out.println("What is the name of the room you would like tiled.");
		System.out.print("(no spaces in name) Room Name:  ");
		
		//for inputing different names
		if (repeat2 == false ) {
			
		roomName = input.next();
		}
		else if (repeat2 == true) {
			
			roomName2 = input.next();
		}
		
		System.out.println(" ");
		
		System.out.println("May we have the lenght and width of the room?");
		System.out.print("Length: ");
		
		//for the length input of two different rooms
		if (repeat2 == false ) {
			Length = input.nextDouble();
	
		}
		else if (repeat2 == true) {
			Length2 = input.nextDouble();
		
		}
		
		System.out.println(" ");
		
		System.out.print("Width: ");
		
		//for the width input of two different rooms
		if (repeat2 == false ) {
			Width = input.nextDouble();
	
		}
		else if (repeat2 == true) {
			Width2 = input.nextDouble();
		
		}
		
		System.out.println(" ");
		
		//asking for the price of one tile
		System.out.println("What is the price per square foot of your desired tile.");
		System.out.print("Price Per Square Foot: $");
		
		//for the per square foot cost input for the two different rooms
		if (repeat2 == false ) {
			perSquare = input.nextDouble();
	
		}
		else if (repeat2 == true) {
			perSquare2 = input.nextDouble();
		
		}//end
		
		System.out.println(" ");
		
		//this is for outputting the cost of either room
		if (repeat2 == false ) {
			
			
			System.out.println("Alright here is the cost for " + roomName + ".");
			System.out.println(tileA.totalCost(perSquare,sizeA.roomArea(Length, Width)));
			
	
		}
		else if (repeat2 == true) {
			
			
			System.out.println("Alright here is the cost for " + roomName2 + ".");
			System.out.println(tileB.totalCost(perSquare2,sizeB.roomArea(Length2, Width2)));
			
		
		}
		
		
		System.out.println(" ");
		
		
		//first if statement
		if (repeat2 == false) {//this is here so they can only put info in for two rooms and not more
		System.out.println("would you like to calculate for another room?");
		Answer = input.next();
		
		
		//second if statement
		if(Answer.equalsIgnoreCase("Yes")) {
			
			repeat = false;// so the while loop can continue 
			repeat2 = true;// this is so the user is not prompt if they want to put info for another room
		}
		else if (Answer.equalsIgnoreCase("No")) {
			repeat = true;// so the while loop can end
			repeat2 = false;
		}//end of second if
		
		}
		else if (repeat2 == true) {
			repeat = true;
		}//end of first
		
		
		}//end of while loop
		
		System.out.println(" ");
		//roomA.compareRoomNames(roomName, roomName2);
		
		//if they pick to input two rooms this displays the cost of both together and if they are the same
		if (repeat2 == true) {
			
			//this is to add the values of the room
			both = tileA.totalCost(perSquare,sizeA.roomArea(Length, Width)) + tileB.totalCost(perSquare2,sizeB.roomArea(Length2, Width2)) ;
			
			System.out.println("Alright here is the cost for the rooms " + roomName + " and "+ roomName2 + ".");
			System.out.println("$" + both);
			
			System.out.println(" ");//just a space
		
		//this is for comparing the names
		if( roomA.compareRoomNames(roomName, roomName2) == true) {
			 System.out.println("The Rooms " + roomName + " and " + roomName2 + " are the same.");
		}
		else if (roomA.compareRoomNames(roomName, roomName2) == false) {
			 System.out.println("The Rooms " + roomName + " and " + roomName2 + " are not the same.");
		}
		
		}
		//if the user only chooses to input for one room
		else if (repeat2 == false) {
			
			
			System.out.println ("Have a good day.");
		}
		
		input.close();// to close the input scanner
	}

}

//Test Runs

/*
 
*Run # 1
Hello, welcome to Robinson's Tile Store.
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Angels
 
May we have the lenght and width of the room?
Length: 15
 
Width: 42
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $5.00
 
Alright here is the cost for Angels.
3150.0
 
would you like to calculate for another room?
yes
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Tomas's
 
May we have the lenght and width of the room?
Length: 20
 
Width: 13
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $.50
 
Alright here is the cost for Tomas's.
130.0
 
 
Alright here is the cost for the rooms Angels and Tomas's.
$3280.0
 
The Rooms Angels and Tomas's are not the same.

*Run 2

Hello, welcome to Robinson's Tile Store.
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Dylans
 
May we have the lenght and width of the room?
Length: 45
 
Width: 16
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $2.00
 
Alright here is the cost for Dylans.
1440.0
 
would you like to calculate for another room?
yes
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Alexs
 
May we have the lenght and width of the room?
Length: 22
 
Width: 55
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $3.00
 
Alright here is the cost for Alexs.
3630.0
 
 
Alright here is the cost for the rooms Dylans and Alexs.

$5070.0
 
The Rooms Dylans and Alexs are not the same.

*Run 3 

Hello, welcome to Robinson's Tile Store.
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Lola
 
May we have the lenght and width of the room?
Length: 12
 
Width: 13
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $.50
 
Alright here is the cost for Lola.
78.0
 
would you like to calculate for another room?
yes
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Charlies
 
May we have the lenght and width of the room?
Length: 16
 
Width: 18
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $4.00
 
Alright here is the cost for Charlies.
1152.0
 
 
Alright here is the cost for the rooms Lola and Charlies.
$1230.0
 
The Rooms Lola and Charlies are not the same.

*Run 4

Hello, welcome to Robinson's Tile Store.
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  living
 
May we have the lenght and width of the room?
Length: 15
 
Width: 62
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $.60
 
Alright here is the cost for living.
558.0
 
would you like to calculate for another room?
yes
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  living
 
May we have the lenght and width of the room?
Length: 16
 
Width: 42
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $2.00
 
Alright here is the cost for living.
1344.0
 
 
Alright here is the cost for the rooms living and living.
$1902.0
 
The Rooms living and living are the same.

*Run 5

Hello, welcome to Robinson's Tile Store.
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Dads
 
May we have the lenght and width of the room?
Length: 45
 
Width: 16
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $3.00
 
Alright here is the cost for Dads.
2160.0
 
would you like to calculate for another room?
no
 
Have a good day.

*Run 6

Hello, welcome to Robinson's Tile Store.
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  Cats
 
May we have the lenght and width of the room?
Length: 56
 
Width: 45
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $6.00
 
Alright here is the cost for Cats.
15120.0
 
would you like to calculate for another room?
yes
 
What is the name of the room you would like tiled.
(no spaces in name) Room Name:  cats
 
May we have the lenght and width of the room?
Length: 12
 
Width: 58
 
What is the price per square foot of your desired tile.
Price Per Square Foot: $2.00
 
Alright here is the cost for cats.
1392.0
 
 
Alright here is the cost for the rooms Cats and cats.
$16512.0
 
The Rooms Cats and cats are the same.

*/