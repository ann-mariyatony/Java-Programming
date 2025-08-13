package Java;
import java.util.Scanner;
public class ArrayDemo {
	public static void main(String[] args) 
{
	//int[]array= {10,20,30,40};
	//System.out.println("Length ="+array.length);
	
	//for(int i=0;i<array.length;i++)
	//{
	//	System.out.println(array[i]+"\t");
	//}
	
	//for(int num:array) {
	//	System.out.println(num+"\t");
	//}
	
	int [] array1 = new int[5];
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the elements");
	for(int i=0;i<5;i++) {
		array1[i]=sc.nextInt();
	}
	System.out.println("Elements are");
	for(int num:array1) {
		System.out.println(num+"\t");
	}

}

}
