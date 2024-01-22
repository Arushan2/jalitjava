class HW_22_11_1_5{
	public static void main (String args[]){
		for(int x=1;x<=5;x++){
			for(int y=1;y<=5;y++){
				if(y%2==1){
					System.out.print(y);
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}