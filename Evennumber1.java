import java.util.Scanner;
class Evennumber1{
	public static void main (String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter number ");
		int num=scan.nextInt();
		if(num%2==0){
			System.out.print("You have entered evennumber ");
		}
		else{
			System.out.print("You have entered oddnumber ");
		}
	}
}