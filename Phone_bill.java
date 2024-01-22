import java.util.Scanner; 
	class Phone_bill{
		public static void main (String args[]){
			Scanner scan=new Scanner(System.in);
			int minute;
			System.out.println("Enter the minutes");
			minute=scan.nextInt();
			double bill=0;
			if(minute>120){
				bill=30*1.0+30*0.75+60*0.5+(minute-120)*0.4;
				System.out.print("You have talked for "+minute+" minutes and you have been charged for "+bill+" rupees.");
			}
			else if(minute>60){
				bill=30*1.0+30*0.75+(minute-60)*0.5;
				System.out.print("You have talked for "+minute+" minutes and you have been charged for "+bill+" rupees.");
			}
			else if(minute>30){
				bill=30*1.0+(minute-30)*0.75;
				System.out.print("You have talked for "+minute+" minutes and you have been charged for "+bill+" rupees.");
			}
			else if(minute>0){
				bill=minute*0.75;
				System.out.print("You have talked for "+minute+" minutes and you have been charged for "+bill+" rupees.");
			}
			else{
				System.out.print("You have entered invalid number of minutes");
			}
	}
}
