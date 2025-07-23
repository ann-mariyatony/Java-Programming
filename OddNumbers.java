package demojava;

import java.util.Scanner;

public class OddNumbers {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Odd numbers are:");
		for (int i=1;i<=50;i+=2)
    	{
    		System.out.println(+i);
    	}
	}
}

