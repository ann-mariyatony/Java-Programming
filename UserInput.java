package demojava;
import java.util.Scanner;
public class UserInput {
    public static void main (String [] args) {
    	Scanner sc =new Scanner(System.in);
    	System.out.println("Enter a number:");
    	int number=sc.nextInt();
    	System.out.println("The number is : "+number);
    	System.out.println("Enter a limit:");
    	int number1=sc.nextInt();
    	for (int i=0;i<number1;i++)
    	{
    		System.out.println(+i);
    	}
    }
}
