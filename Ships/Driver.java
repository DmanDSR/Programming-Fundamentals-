/*
 Author : Dylan Sedeno
Course: COP2800 lab Session
Date: April 4th 2019
Project :Programming Lab 9: Abstract classes and Interfaces 
Instructor: Dr.Pisano
 */

package Ships;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables to be used
		Scanner input = new Scanner (System.in);
		String Name, Answer;
		int Max, Date,  weaponNum, rocketNum, Value = 0;
		Ship Ship = new Ship();
		CruiseShip Cruise = new CruiseShip();
		CargoShip Cargo = new CargoShip();
		Destroyer Naval = new Destroyer();
		ArrayList<Object> shipList = new ArrayList<Object>();
		
		//prompting the user for the ship info 
		System.out.println("Hello welcome please get ready to input the info for the different ships");
		System.out.println("First we will start with a normal ship, what is the ships name?");
		Name = input.next();
		System.out.print("what year was the ship built? ");
		Date = input.nextInt();
		
		Ship.setShipVar(Name,Date);
		
		System.out.println(" ");//just a space
		
		
		System.out.println("The second ship will be the cruise ship, what is the ships name?");
		Name = input.next();
		System.out.print("what year was the ship built? ");
		Date = input.nextInt();
		System.out.println("What is the max capacity of the cruise ship? ");
		Max = input.nextInt();
		
		//sets the variables for the cruise ship
		Cruise.setShipVar(Name, Date);
		Cruise.setMaxCap(Max);
		
		System.out.println(" ");//just a space
		
		System.out.println("The next ship will be a cargo ship, what is the ships name?");
		Name = input.next();
		System.out.print("what year was the ship built? ");
		Date = input.nextInt();
		System.out.println("What is the max capacity of the cargo ship? ");
		Max = input.nextInt();
		
		//sets the variables for the cargo ship
		Cargo.setShipVar(Name, Date);
		Cargo.setMaxCap(Max);
		
		System.out.println(" ");//just a space

		System.out.println("Now for the Destroyer ship, what is the ships name?");
		Name = input.next();
		System.out.println("how many weapons does the " + Name + " have? ");
		weaponNum = input.nextInt();
		System.out.println("how many rockets does the " + Name + " have? ");
		rocketNum = input.nextInt();

		//sets the variables for the Destroyer ship
		Naval.setShipVar(Name, Value);
		Naval.setDestroyVar(rocketNum, weaponNum);
		
		System.out.println(" ");//just a space
		
		
		//outputs the info for each ship
		System.out.println("Alright here is the info the ships you put in: ");
		
		System.out.println(" ");
		
		//Saves the different ships to the ship list
		shipList.add(Ship);
		shipList.add(Cruise);
		shipList.add(Cargo);
		shipList.add(Naval);
		
		
		//outputs the toString methods of the different Ships
		while (Value <  shipList.size()) {
			
			System.out.println(shipList.get(Value));
			System.out.println(" ");//just a space
			Value++;//adds 1  to the Value variable
		}
		
		//prompts the user if they want to fire the Destroyer ships weapons and rockets
		System.out.println("Would you like to activate the " + Naval.getShipName() + " weapons syetem and unleash all it's weapons and rockets?" );
		System.out.println("Yes or No");
		Answer = input.next();

		//shipList.add(Naval.fireWeapons());


		if (Answer.equalsIgnoreCase("yes")) {
			
			System.out.println(" ");//just a space	
			System.out.println(Naval.fireWeapons());
			
		}
		else System.out.println("Alright maybe next time, goodbye."); 


		input.close();//closes the Scanner input
	}

}

/*
 Run 1
  Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
Dylan
what year was the ship built? 1997
 
The second ship will be the cruise ship, what is the ships name?
Alex
what year was the ship built? 2008
What is the max capacity of the cruise ship? 
300
 
The next ship will be a cargo ship, what is the ships name?
Bragi
what year was the ship built? 1992
What is the max capacity of the cargo ship? 
1000
 
Now for the Destroyer ship, what is the ships name?
Dave
how many weapons does the Dave have? 
50
how many rockets does the Dave have? 
32
 
Alright here is the info the ships you put in: 
 
The ships name is Dylan it was built in 1997.
 
The Cruise ship name is Alex it was built in 2008.
 
The Cargo ship name is Bragi it was built in 1992.
 
The Dave has 50 weapons and 32 rockets.
 
Would you like to activate the Dave weapons syetem and unleash all it's weapons and rockets?
Yes or No
yes
 
weapons fired!
  
  Run 2
  Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
tomas
what year was the ship built? 1998
 
The second ship will be the cruise ship, what is the ships name?
Peter
what year was the ship built? 1998
What is the max capacity of the cruise ship? 
200
 
The next ship will be a cargo ship, what is the ships name?
ben
what year was the ship built? 1990
What is the max capacity of the cargo ship? 
1592
 
Now for the Destroyer ship, what is the ships name?
Alisha
how many weapons does the Alisha have? 
500
how many rockets does the Alisha have? 
6000
 
Alright here is the info the ships you put in: 
 
The ships name is tomas it was built in 1998.
 
The Cruise ship name is Peter it was built in 1998.
 
The Cargo ship name is ben it was built in 1990.
 
The Alisha has 500 weapons and 6000 rockets.
 
Would you like to activate the Alisha weapons syetem and unleash all it's weapons and rockets?
Yes or No
yes
 
weapons fired!
  
  Run 3
  
  Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
vicent
what year was the ship built? 1980
 
The second ship will be the cruise ship, what is the ships name?
shane
what year was the ship built? 1997
What is the max capacity of the cruise ship? 
562
 
The next ship will be a cargo ship, what is the ships name?
jhon
what year was the ship built? 1959
What is the max capacity of the cargo ship? 
5662
 
Now for the Destroyer ship, what is the ships name?
roy
how many weapons does the roy have? 
45
how many rockets does the roy have? 
85
 
Alright here is the info the ships you put in: 
 
The ships name is vicent it was built in 1980.
 
The Cruise ship name is shane it was built in 1997.
 
The Cargo ship name is jhon it was built in 1959.
 
The roy has 45 weapons and 85 rockets.
 
Would you like to activate the roy weapons syetem and unleash all it's weapons and rockets?
Yes or No
no
Alright maybe next time, goodbye.

Run 4
  
  Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
sam
what year was the ship built? 1990
 
The second ship will be the cruise ship, what is the ships name?
dean
what year was the ship built? 1985
What is the max capacity of the cruise ship? 
500
 
The next ship will be a cargo ship, what is the ships name?
jo
what year was the ship built? 1582
What is the max capacity of the cargo ship? 
100
 
Now for the Destroyer ship, what is the ships name?
gon
how many weapons does the gon have? 
45
how many rockets does the gon have? 
660
 
Alright here is the info the ships you put in: 
 
The ships name is sam it was built in 1990.
 
The Cruise ship name is dean it was build in 1985 and its max passanger capacity is 500.
 
The Cargo ship name is jo and its max cargo capacity is 100.
 
The gon has 45 weapons and 660 rockets.
 
Would you like to activate the gon weapons syetem and unleash all it's weapons and rockets?
Yes or No
no
  
  Run 5
  
  Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
tom
what year was the ship built? 1278
 
The second ship will be the cruise ship, what is the ships name?
hank
what year was the ship built? 1952
What is the max capacity of the cruise ship? 
562
 
The next ship will be a cargo ship, what is the ships name?
dan
what year was the ship built? 1456
What is the max capacity of the cargo ship? 
520
 
Now for the Destroyer ship, what is the ships name?
jake
how many weapons does the jake have? 
45
how many rockets does the jake have? 
62
 
Alright here is the info the ships you put in: 
 
The ships name is tom it was built in 1278.
 
The Cruise ship name is hank it was build in 1952 and its max passanger capacity is 562.
 
The Cargo ship name is dan and its max cargo capacity is 520.
 
The jake has 45 weapons and 62 rockets.
 
Would you like to activate the jake weapons syetem and unleash all it's weapons and rockets?
Yes or No
yes
 
weapons fired!
  
  Run 6
  
  Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
Decarlo
what year was the ship built? 1596
 
The second ship will be the cruise ship, what is the ships name?
pablo
what year was the ship built? 1456
What is the max capacity of the cruise ship? 
500
 
The next ship will be a cargo ship, what is the ships name?
monet
what year was the ship built? 1995
What is the max capacity of the cargo ship? 
520
 
Now for the Destroyer ship, what is the ships name?
troy
how many weapons does the troy have? 
5000
how many rockets does the troy have? 
6000
 
Alright here is the info the ships you put in: 
 
The ships name is Decarlo it was built in 1596.
 
The Cruise ship name is pablo it was build in 1456 and its max passanger capacity is 500.
 
The Cargo ship name is monet and its max cargo capacity is 520.
 
The troy has 5000 weapons and 6000 rockets.
 
Would you like to activate the troy weapons syetem and unleash all it's weapons and rockets?
Yes or No
yes
 
weapons fired!

 Run 7
 
 Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
willie
what year was the ship built? 1990
 
The second ship will be the cruise ship, what is the ships name?
omar
what year was the ship built? 1995
What is the max capacity of the cruise ship? 
200
 
The next ship will be a cargo ship, what is the ships name?
eddy
what year was the ship built? 1991
What is the max capacity of the cargo ship? 
12345
 
Now for the Destroyer ship, what is the ships name?
tim
how many weapons does the tim have? 
520
how many rockets does the tim have? 
145
 
Alright here is the info the ships you put in: 
 
The ships name is willie it was built in 1990.
 
The Cruise ship name is omar it was build in 1995 and its max passanger capacity is 200.
 
The Cargo ship name is eddy and its max cargo capacity is 12345.
 
The tim has 520 weapons and 145 rockets.
 
Would you like to activate the tim weapons syetem and unleash all it's weapons and rockets?
Yes or No
no
Alright maybe next time, goodbye.

Run 8
  
Hello welcome please get ready to input the info for the different ships
First we will start with a normal ship, what is the ships name?
Bruce
what year was the ship built? 1982
 
The second ship will be the cruise ship, what is the ships name?
Alfred
what year was the ship built? 1980
What is the max capacity of the cruise ship? 
6230
 
The next ship will be a cargo ship, what is the ships name?
Grayson
what year was the ship built? 1990
What is the max capacity of the cargo ship? 
50000
 
Now for the Destroyer ship, what is the ships name?
tim
how many weapons does the tim have? 
500
how many rockets does the tim have? 
6000
 
Alright here is the info the ships you put in: 
 
The ships name is Bruce it was built in 1982.
 
The Cruise ship name is Alfred it was build in 1980 and its max passanger capacity is 6230.
 
The Cargo ship name is Grayson and its max cargo capacity is 50000.
 
The tim has 500 weapons and 6000 rockets.
 
Would you like to activate the tim weapons syetem and unleash all it's weapons and rockets?
Yes or No
yes
 
weapons fired!  
  
  
  
 */
