package ExamplePrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = toscan.nextInt();
		int index,count=0;
		for(index=1;index<=num;index++) {
			if(num % index == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Entered number " + num + " is a Prime Number");
		}
		else {
			System.out.println("Not a Prime number");
		}

	}

}
