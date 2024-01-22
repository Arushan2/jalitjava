import java.util.Scanner;
class array{
	public static void main (String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of students");
		int k=scan.nextInt();
		System.out.println("Please enter the number of subjects");
		int l=scan.nextInt();
		int total=0;
		int marks[] [];
		marks= new int [k] [l];
		int i=0;

		while(i<k){
				int j=0;
				while(j<l){
				System.out.println("Please enter the marks of student "+ (i+1) +" subject "+ (j+1));
				marks[i][j]=scan.nextInt();
				total=total+marks[i] [j];
				j++;
			}
			System.out.println("The total marks of student "+(i+1)+" is "+ total);
			double average=total/marks[i].length;
			System.out.println("The average marks of student "+(i+1)+" is "+ average);
			total=0;
			i++;
		}
	}
}
		
	