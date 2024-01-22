import java.util.Scanner;
class Mainstudent2{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter ID :");
		int Stuid=scan.nextInt();
		
		System.out.println("Please enter name :");
		String Stuname=scan.next();
		
		Student1 Stu1=new Student1();
		Stu1.setStudent(Stuid,Stuname);
		Stu1.getStudent();
	}
}