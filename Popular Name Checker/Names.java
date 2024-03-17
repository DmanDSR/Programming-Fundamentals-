/*Author: Dylan Sedeno  
  Course: COP 2800 293-2627
  Date: 3/21/19

   Assignment: #8
   Instructor: Dr.Sergio Pisano
 */



package names;

import java.util.*;// this is to import the scanner and random classes
import java.io.*;// this is to import the print writer class

public class Names {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		//Variables to be used
		String[] boyNames = new String [200], girlNames = new String [200], bothNames = new String [400];
		int index = 0, both = 200;
		String Answer, Name = null;//
		boolean Boy = false, Girl = false, Repeat = true;
		Random rName = new Random();//this is so we have a random name picked 
		File Boys = new File ("BoyNames.txt");
		File Girls = new File ("GirlNames.txt");
		Scanner inputB = new Scanner (Boys);
		Scanner inputG = new Scanner (Girls);
		Scanner input = new Scanner (System.in);
		
		
		//copying the contents of the files into the arrays
		while (inputB.hasNext() && index < boyNames.length) {
			
			boyNames[index] = inputB.next();
			index++;
		}
		
		index = 0;//to reset index
		
		while (inputG.hasNext() && index < girlNames.length) {

			girlNames[index] = inputG.next();
			index++;
		}
		
		index = 0;//to reset index
		
		//this is to copy both arrays into a single array
		while ( index < boyNames.length  ) {

			
			bothNames[index] = boyNames[index];
			bothNames[both] = girlNames[index];
			index++;
			both++;
		}
		
		index = 0;// to reset index
		both = 0;//to reset both

		//to make sure that the arrays are coping 
		/* while (index < boyNames.length) {
			 
			 System.out.println(boyNames[index]);
			 index++;
		 }
		

		 while (index < girlNames.length) {

			 System.out.println(girlNames[index]);
			 index++;
		 }

		
		
		while (index < bothNames.length) {

			System.out.println(bothNames[index]);
			index++;
		}
		
		*/
		
		// for prompting the user
		System.out.println("Hello welcome, I know the most popular names for babys from 2000 to 2009.");
		System.out.println("Enter a name and I will tell you if it was popular back in  that time frame.");
		System.out.print("First which gender will I be searching Boy, Girl or both: ");
		Answer = input.next();
		
		System.out.println(" ");
		
		//to know which array to look through to find the name
		if(Answer.equalsIgnoreCase("Boy")) {
			
			System.out.print("Alright please enter the name: ");
			Name = input.next();
			
			Boy = true;
			
		}
		else if (Answer.equalsIgnoreCase("Girl")) {
			
			System.out.print("Alright please enter the name: ");
			Name = input.next();
			
			Girl = true;
			
		}
		else if (Answer.equalsIgnoreCase("Both")) {

			System.out.print("Alright please enter the name: ");
			Name = input.next();
			Boy= true;
			Girl = true;
			

		}
	
		
		System.out.println(" ");
		
		//for searching to see if the name was popular
		while (Repeat == true && index < boyNames.length) {
		
		//for searching the boy names array	
		if (Boy == true && boyNames[index].equalsIgnoreCase(Name)) {
			
			Repeat = false;//to stop the loop if name is found
			
			System.out.println( Name + " was a popular name back then.");
			
		}
		
		//for searching the girl names array
		if (Girl == true && girlNames[index].equalsIgnoreCase(Name)) {

			Repeat = false;//to stop the loop if name is found
			
			System.out.println( Name + " was a popular name back then.");

		}
		
		index++;
		}//end of while loop
		
		//if name is not found in either list
		if (Repeat == true) {
			
			System.out.println(  Name + " was not a popular name back then at all.");
		}
		
		System.out.println(" ");//just a space
		
		
		// this is used for picking a random number 
		int random= rName.nextInt(bothNames.length);
		
		// then the random number is used to pick the random name to display
		System.out.println("In my opinion I think "+ bothNames[random] +" is a good name.");
		
		
		
		 input.close();
		 inputB.close();
		 inputG.close();
	}

}
/*
 Run 1
 
  Hello welcome, I know the most popular names for babys from 2000 to 2009.
Enter a name and I will tell you if it was popular back in  that time frame.
First which gender will I be searching Boy, Girl or both: boy
 
Alright please enter the name: martin
 
martin was a popular name back then.
 
In my opinion I think Jayla is a good name.
  
  Run 2
 
  Hello welcome, I know the most popular names for babys from 2000 to 2009.
Enter a name and I will tell you if it was popular back in  that time frame.
First which gender will I be searching Boy, Girl or both: girl
 
Alright please enter the name: lucy
 
lucy was a popular name back then.
 
In my opinion I think Peyton is a good name.

Run 3

Hello welcome, I know the most popular names for babys from 2000 to 2009.
Enter a name and I will tell you if it was popular back in  that time frame.
First which gender will I be searching Boy, Girl or both: both
 
Alright please enter the name: dylan
 
dylan was a popular name back then.
 
In my opinion I think Caden is a good name.

Run 4

Hello welcome, I know the most popular names for babys from 2000 to 2009.
Enter a name and I will tell you if it was popular back in  that time frame.
First which gender will I be searching Boy, Girl or both: boy
 
Alright please enter the name: tomas
 
tomas was not a popular name back then at all.
 
In my opinion I think Maya is a good name.

Run 5

Hello welcome, I know the most popular names for babys from 2000 to 2009.
Enter a name and I will tell you if it was popular back in  that time frame.
First which gender will I be searching Boy, Girl or both: girl
 
Alright please enter the name: Alisha
 
Alisha was not a popular name back then at all.
 
In my opinion I think Crystal is a good name.

Run 6

Hello welcome, I know the most popular names for babys from 2000 to 2009.
Enter a name and I will tell you if it was popular back in  that time frame.
First which gender will I be searching Boy, Girl or both: both
 
Alright please enter the name: Bragi
 
Bragi was not a popular name back then at all.
 
In my opinion I think Juliana is a good name.
  
*/
