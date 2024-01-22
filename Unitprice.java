class Unitprice{
	public static void main (String args[]){
		int unit=301;//define unit as integer
		double bill_Amount=0.0;//define bill amount as double
		if (unit>300){
			int x=90*7+60*15+150*36;
			int y=(unit-300)*45;
			bill_Amount=x+y;
		}
		else if (unit>150){
			int x=90*7+60*15;
			int y=(unit-150)*36;
			bill_Amount=x+y;
		}
		else if (unit>90){
			int x=90*7;
			int y=(unit-90)*15;
			bill_Amount=x+y;
		}
		else {
			bill_Amount=unit*7;
		}
		System.out.print(bill_Amount);
	}
}