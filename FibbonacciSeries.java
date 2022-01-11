package ExamplePrograms;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter a number: ");
		long num = toscan.nextInt();
		long index,FirstNum = 0,SecondNum = 1,a,b;
		long  temp;
		a = FirstNum ;
		b = SecondNum;
		for(index=0;index<num;index++) {
		temp = FirstNum + SecondNum;
		FirstNum = SecondNum;
		SecondNum = temp;
		System.out.println(temp);
		}
		
	}
}
