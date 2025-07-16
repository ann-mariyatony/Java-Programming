package demojava;
import java.util.Scanner;
public class Sum {
      public static void main (String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the First number:");
		int n1=sc.nextInt();
		System.out.println("Enter the second number:");
		int n2=sc.nextInt();
		int n3=n1+n2;
		System.out.println("The Sum is:"+n3);
	
}
}
