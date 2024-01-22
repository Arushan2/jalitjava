import java.util.Scanner;
class Array_3{
	public static void main (String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number of inputs");
		int x=scan.nextInt();
		int num[]=new int[x];
		int i=0;
		int even_Count=0;
		int odd_Count=0;
		while (i<x){		//this while for take the input to array
			System.out.println("Please input the number ");
			num[i]=scan.nextInt();
			i++;
		}
		i=0;
		while (i<x){		//this while for take the numbers from list one by one
			if(num[i]%2==0){	//checking odd or even
				even_Count+=1;	
			}
			else{
				odd_Count+=1;
			}
			i++;
		}
		System.out.println("The total numbers of even numbers are "+even_Count);
		System.out.println("The total numbers of odd numbers are "+odd_Count);
	}
}
				
		
			

		
		