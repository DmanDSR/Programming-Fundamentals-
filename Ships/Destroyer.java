/*
 Author : Dylan Sedeno
Course: COP2800 lab Session
Date: April 4th 2019
Project :Programming Lab 9: Abstract classes and Interfaces 
Instructor: Dr.Pisano
 */

package Ships;

public class Destroyer extends Ship implements  Militarizable {
	
	//variables to be used
	private int rocketNum, weaponNum;
	
	//sets the Destroyers weapons and rockets
	public void setDestroyVar (int Rockets, int Weapons) {
		rocketNum = Rockets;
		weaponNum = Weapons;
	}
	
	//returns the amount of rockets
	public int getRocketNum ( ) {
		return rocketNum;
	}
	
	//returns the amount of weapons
	public int getWeaponNum() {
		return weaponNum;
	}

	//outputs the Destroyers info , and overrides ships toString method
	public String toString() {
		return "The " + getShipName() + " has " + weaponNum + " weapons and " + rocketNum + " rockets.";
	}
	
	//overrides  Militarizable's method
	public String fireWeapons() {
		
		String Output = "weapons fired!";
	
	return Output;
	}
	
}
