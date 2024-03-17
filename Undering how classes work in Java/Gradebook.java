//Dylan Sedeno Programing 2 1/19/2022

import java.util.ArrayList;
class Gradebook {

	private ArrayList<Student> list;
	private int sScore [];

	public double getAverage(){
		
		double sum = 0;
		
		for(Student s: list){ 
			sum += s.getScore();
		}
		/*
		for(int i = 0; i < list.size(); i++){
			sum += list.get(i).getScore();
			
		}
		*/
		 return sum/list.size();
	}
	
	public void PrintStudentInfo(){
		
		for (int i = 0; i < list.size();i++){
				
			system.out.printf("%s\t%s\t%d\n", list.get(i).getFirstName(), list.get(i).getLastName(), list.get(i).getId(), list.get(i).getScore());
		}
		
	}
	
	public double getMedian(){
		int[] scores = new int[list.size()];
		int i = 0, n = list.size();
		
		for(Student s: list){
				scores[i++] = s.getScore();
		}
		
		Arrays.sort(scores);
		
		if(scores.length % 2 == 0){
			
			return(scores[n/2] + scores[n/2-1])/2.0;
			
		}
		else {
			
			return scores[n / 2];
		}
		
	} 
	
	

}