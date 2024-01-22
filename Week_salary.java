import java.util.Scanner;	
	class Week_salary{
		public static void main (String args[]){
			double total_Salary=0.0;
			int i=0;
			int salary[];
			salary=new int [7];
			while (i<7){
				Scanner scan=new Scanner(System.in);
				System.out.println("Please enter day "+ (i=i+1) +" salary:- ");
				salary[i]=scan.nextInt();
				total_Salary=total_Salary+salary[i];
				i++;
			}
			double bonus=0.0;
			if (total_Salary>10000){
				bonus=total_Salary/100*5;
			}
			else{
				bonus=0;
			}
			double net_Salary=total_Salary+bonus;
			System.out.println("Your this week bonus amount is "+bonus+" and your Net salary is "+net_Salary);
		}
	}
			