import java.util.Scanner;
class Oddnumber{
	public static void main (String args[]){
		int total=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Please enter starting number ");
		int start = scan.nextInt();
		
		System.out.print("Please enter ending number");
		int end = scan.nextInt();
		
		start++;
		for(int i=start; i<end; i++){
			if(i%2 != 0){
				total += i;
			}
		}
		System.out.println("The summation of oddnumbers is "+total);
	}
}