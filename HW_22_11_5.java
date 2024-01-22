class HW_22_11_5{
	public static void main (String args[]){
		int i=1;
		while(i<=5){
			int x=1;
			while(x<=5){
				if(x%2==1){
					System.out.print(x);
				}
				else{
					System.out.print("*");
				}
				x=x+1;
			}
			System.out.println();
			i++;
		}
	}
}