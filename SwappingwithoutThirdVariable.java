package ExamplePrograms;

import java.util.Scanner;

public class SwappingwithoutThirdVariable {

	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter two number: ");
		int num1 = toscan.nextInt();
		int num2 = toscan.nextInt();
		int a =num1;
		int b= num2;
		num1 = num1 + num2;
		num2 = num1 -num2;
		num1 = num1 - num2;
		System.out.println("Before Swapping " + a + "_"+ b +"_After swapping " + num1 +"_"+ num2);
	}

}
