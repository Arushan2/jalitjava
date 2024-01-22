class Employee{
	int id;
	String name;
	double basic_salary;
	Employee(int id,String name){
		this.id=id;
		this.name=name;
	}
		
	void setBasicSalary(double basic_salary){
		this.basic_salary=basic_salary;
	}
	double calcBonus(double basic_salary){
		double bonus=0.0;
		if(basic_salary>100000.00){
			bonus=10000.00;
		}
		else{
			bonus=5000.00;
		}
		return bonus;
	}
	double calcTax(double sub_salary){
		double tax=0.0;
		if(sub_salary>150000.00){
			tax=sub_salary*0.05;
		}
		else{
			tax=sub_salary*0.03;
		}
		return tax;
	}
	void display(){
		System.out.println("Your ID is "+this.id);
		System.out.println("Your Name is "+this.name);
		System.out.println("Your Basic salary is "+this.basic_salary);
		double bonus=this.calcBonus(this.basic_salary);
		System.out.println("Your Bonus salary is "+bonus);
		double sub_salary=this.basic_salary+bonus;
		double tax=this.calcTax(sub_salary);
		System.out.println("Your tax amount is "+tax);
		double total=sub_salary-tax;
		System.out.println("Your total salary is "+total);
	}
			
}