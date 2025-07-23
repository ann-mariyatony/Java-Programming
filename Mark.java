package demojava;
import java.util.Scanner;
public class Mark {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name:");
		String n2=sc.nextLine();
		System.out.println("Enter the mark:");
		int n1=sc.nextInt();
		System.out.println("Name:"+n2);
		if(n1>=90)
		{
			System.out.println("Grade=A");
		}
		else if(n1>=75){
			System.out.println("Grade=B");
		}
		else if(n1>=60){
			System.out.println("Grade=C");
		}
		else if(n1>=40){
			System.out.println("Grade=D");
		}
		else if(n1>=0){
			System.out.println("Failed");
		}
		else{
			System.out.println("INVALID");
		}
}
}

