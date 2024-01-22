class Salary{
	public static void main (String args[]){
		double salary=450000;
		double tax=0;
		if (salary>100000){
			tax=5;}
		else{
			tax=3;}
		double tax_Amount=salary/100*tax;
		double net_Salary=salary-tax_Amount;
		System.out.println("Salary is "+salary);
		System.out.println("Tax amount is "+tax_Amount);
		System.out.println("Net salary is "+net_Salary);
	}
}