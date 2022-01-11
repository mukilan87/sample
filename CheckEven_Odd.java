package ExamplePrograms;

import java.util.Scanner;

public class CheckEven_Odd {
	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = toscan.nextInt();
		int index;
		if(num % 2 ==0) {
			System.out.println("Entered number " + num + " is Even");
		}
		else {
			System.out.println("Entered number " + num + " is Odd");
		}
	}
}
