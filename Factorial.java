package ExamplePrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = toscan.nextInt();
		int index,fact=1;
		if(num >= 1) {
			for(index=1;index<=num;index++) {
				fact = fact*index;
			}
			System.out.println("Factorial of entered number is : "+ fact);
		}
		else if(num == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("Enter a valid Number");
		}
	}
}
