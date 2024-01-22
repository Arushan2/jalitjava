import java.util.Scanner; 
	class Week_switch{
		public static void main (String args[]){
			Scanner scan=new Scanner(System.in);
			int day=0;
			System.out.println("Enter Date");
			day=scan.nextInt();
			switch (day){
				case 1:
					System.out.print("Monday");
					break;
				case 2:
					System.out.print("Tuesday");
					break;
				case 3:
					System.out.print("Wednesday");
					break;
				case 4:
					System.out.print("Thursday");
					break;
				case 5:
					System.out.print("Friday");
					break;
				case 6:
					System.out.print("Saturday");
					break;
				case 7:
					System.out.print("Sunday");
					break;
				default:
					System.out.print("Enter a valid date");
					break;
			}
		}
	}
				