package com.collections.array;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int d[][]= {
		{1,2,3,4},
		{2,4,6,8},
		{5,6,7,8}
};
for(int i=0; i<3; i++) {
	for(int j=0;j<4; j++)
	{
System.out.print(" "+d[i][j]);
	}
System.out.println();
}
}
}