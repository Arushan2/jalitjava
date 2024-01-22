class HW_22_11_3{
	public static void main (String args[]){
		int i=1;
		int x=5;
		while(i<=5){
			int j=1;
			while(j<=5){
				System.out.print(x);
				j++;
			}
			System.out.println();
			i++;
			x=x-1;
		}
	}
}