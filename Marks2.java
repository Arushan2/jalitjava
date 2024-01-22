import java.util.Scanner;

class marks1{	
	int id;
	int marksnum;
	int[] marks;
	String name;

	marks1(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void setMarksnum(int marksnum){
		this.marksnum=marksnum;
	}
	
	int setArray(){
		int marks[]=new int [this.marksnum];
		this.marks=marks[];
	}
	
	int getMarks(){
		int i=0;
		while(i<this.marksnum){
			Scanner scan=new Scanner(System.in);
			System.out.println("Please enter the marks");
			int mark=scan.nextInt();
			marks=this.marks[i];
			i++;
		}
		return marks;
	}
			
	
	int calcTotal(){
		int i=0;
		while(i<this.marksnum){
			int total=total+marks[i];
			i++;
		}
		return total;
	}
	
	double calAvg(int total){
		double average=total/3;
		return average;
	}
	
	char getResults(double average){
		double marks=average;
		char rank='x'; //define rank as char
		
		if (marks>100) {
			System.out.print("Invalid marks");
		}
		else if (marks>75){ //checking marks
			rank='A';
		}
		else if (marks>65){
			rank='B';
		}
		else if (marks>55){
			rank='C';
		}
		else if (marks>45){
			rank='S';
		}
		else {
			rank='F';
		}
		
		return rank;
	}
	
	void display(){
		System.out.println("Your id is "+this.id);
		System.out.println("Your name is "+this.name);
		int[] marks=this.getMarks();
		System.out.println("Your marks is/are"+marks[]);
		int total=this.calcTotal(marks);
		double average=this.calAvg(total);
		char rank=this.getResults(average);
		System.out.println("Total is "+total);
		System.out.println("Average is "+average);
		System.out.println("Rank is "+rank);
	}
}