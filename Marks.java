class Marks{
	public static void main (String args[]){
		double marks=47;
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
		System.out.print(rank);//print rank as char
	}
}
				