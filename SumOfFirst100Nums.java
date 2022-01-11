package ExamplePrograms;

import java.util.Scanner;

public class SumOfFirst100Nums {

	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter two number: ");
		int num = 100,index,sum=0;
		for(index=1;index<=100;index++) {
			sum = sum + index;
		}
		System.out.println(sum);
	}

}
