class Array_1{
	public static void main (String args[]){
		int marks [] [] = new int [3][];
		marks [0]=new int[3];
		marks [1]=new int[2];
		marks [2]=new int[2];
		
		marks [0] [0] =20;
		marks [0] [1] =45;
		marks [0] [2] =67;
		marks [1] [0] =35;
		marks [1] [1] =65;
		marks [2] [0] =90;
		marks [2] [1] =75;
		
		int i=0;
		while(i<marks.length){
			int j=0;
			while(j<marks[i].length){
				System.out.println(marks [i] [j]);
				j++;
			}
			i++;
		}
	}
}