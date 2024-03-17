/*************************************
Author        :Dylan Sedeno 
Course        :CGS3767 MonWed 6:25 - 7:40
professor     :Michael Robinson
Program       :sedenoDwindowindowsPgm1
Purpose       :Prints out my name and the requested numbers.
Due Date      :09/16/2019
Certification :I Dylan Sedeno hearby certify that this work is my own
			   and none of it is the work of any other person.
			   
........{Dylan R. Sedeno}............
**************************************/

public class sedenoDwindowindowsPgm1 
{
	
	public static void processWindows( String name, double num1, double num2,int num3) 
	{
	
	   double aGpa = (num1 + num2) / num3;  //is to calculate the average GPA
	
		
       System.out.printf("%s %6.5f %6.5f %6d\nAverage GPA: %6.2f\n", name,num1,num2,num3,aGpa);   //to print the info a certian way
	
	}
	
	public static void main( String args[] )
	{
		
		processWindows( "DylanSedeno", 3.99 , 3.50 , 2 ); // the info to be displayed 
		
	}
	
	
}