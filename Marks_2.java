class Marks_2{
	public static void main (String args[]){
		double marks=10000;
		String rank="x"; //define rank as char
		if ((marks>100)||(marks<0)) {
			rank="Invalid marks";
		}
		else if ((marks>75)&&(marks<100)){ //checking marks
			rank="A";
		}
		else if ((marks>65)&&(marks<75)){
			rank="B";
		}
		else if ((marks>55)&&(marks<65)){
			rank="C";
		}
		else if ((marks>45)&&(marks<55)){
			rank="S";
		}
		else {
			rank="F";
		}
		System.out.print(rank);//print rank as char
	}
}
				