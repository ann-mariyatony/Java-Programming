package Java;
import java.util.Scanner;
public class TwoDarrayDemo {
	public static void main(String[] args) 
	{
		//int [][] matrix = {{1,2,3},{3,5,6,7}};
		//for(int i=0;i<matrix.length;i++) {
		//	for (int j=0;j<matrix[i].length;j++) {
			//}
			//System.out.println();
	//	}
		int [] []matrix = new int[4][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  matrix elements");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		
}
