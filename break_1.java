import java.util.Scanner;	
	class break_1{
		public static void main (String args[]){
			Scanner scan=new Scanner(System.in);
			System.out.print("Please enter your target value ");
			int target=scan.nextInt();
			boolean check=false;
			for(int x=1; x<=10; x++){
				if(x==target){
					System.out.print("Your target value "+target+" is found");
					check=true;
					break;
				}
			}
				if(!check){
					System.out.print("your target value is not found");
				}
			
			
		}
	}