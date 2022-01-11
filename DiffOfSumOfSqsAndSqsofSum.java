package ExamplePrograms;

import java.util.Scanner;

public class DiffOfSumOfSqsAndSqsofSum {

	public static void main(String[] args) {
		DiffOfSumOfSqsAndSqsofSum s = new DiffOfSumOfSqsAndSqsofSum();
		s.diff();
	}
		void diff(){
		int num,i,sum=0,sum1=0,result;
		Scanner toscan = new Scanner(System.in);
		System.out.println("Enter a limit: ");
		num =toscan.nextInt();
		for(i=1;i<=num;i++) {
			sum = sum + i;
		}
		sum = sum * sum;
		for(i=1;i<=num;i++) {
			sum1 = (i*i) + sum1; 
		}
		result = sum -sum1;
		System.out.println(result);
	}
}
