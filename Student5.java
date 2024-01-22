class Student5{
	int id;
	String fname;
	String lname;
	
	
	Student5(int id){
		this.id=id;
	}
	void setfullname(String fname,String lname){
		this.fname=fname;
		this.lname=lname;
		
	}
	
	String getfullname(){
		//System.out.println("Your full name is "+ this.fname+" "+this.lname);
		String funame=("Your full name is "+ this.fname+" "+this.lname);
		return funame;
	}
	
	
	void display(){
		System.out.println("Id "+this.id);
		System.out.println("First name "+this.fname);
		System.out.println("Last name "+this.lname);
		//System.out.println("Full name "+this.fname+" "+this.lname);
		//this.getfullname();
		String fullname=getfullname();
		System.out.println(fullname);
	}
}