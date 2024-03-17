/*
 Author : Dylan Sedeno
Course: COP2800 lab Session
Date: April 4th 2019
Project :Programming Lab 9: Abstract classes and Interfaces 
Instructor: Dr.Pisano
 */

package Ships;

public interface Militarizable {
 
	//returns nothing
	default String fireWeapons() {
		return null;
	}
}
