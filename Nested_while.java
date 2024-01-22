class Nested_while{
	public static void main (String args[]){
		int x=1;
		int y=1;
		while(x<=5){
			while(y<=3){
				System.out.print(y);
			y++;
			}
			y=1;
			System.out.println(x);
		x++;
		}
	}
}