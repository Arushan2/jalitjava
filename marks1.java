class marks1{	
	int id;
	int marks1;
	int marks2;
	int marks3;
	String name;

	marks1(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setMarks(int marks1,int marks2,int marks3){
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	int calcTotal(){
		int total=this.marks1+this.marks2+this.marks3;
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
		System.out.println("Marks 1 is "+this.marks1);
		System.out.println("Marks 2 is "+this.marks2);
		System.out.println("Marks 3 is "+this.marks3);
		int total=this.calcTotal();
		double average=this.calAvg(total);
		char rank=this.getResults(average);
		System.out.println("Total is "+total);
		System.out.println("Average is "+average);
		System.out.println("Rank is "+rank);
	}
}
	
		
		