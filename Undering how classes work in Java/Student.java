//Dylan Sedeno Programing 2 1/19/2022

public class Student {

	private string fName, lName;
	private int score, id;

	public void SetFirstName(String f){
		this.fName = f;
	}
	
	public void SetLastName(String l){
		this.lName = l;
	}
	public void SetId(int p){
		this.id = p;
	}

	public void SetScore(int s){
		this.score = s;
	}

	public String getName(){
		return this.fName;
		return this.lName;	
	}

	public int getId(){
		return this.id;
	}
	
	public int getScore(){
		return this.score;
	}
}