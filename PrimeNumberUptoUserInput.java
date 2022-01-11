package ExamplePrograms;

import java.util.Scanner;

public class PrimeNumberUptoUserInput {

	public static void main(String[] args) {
		Scanner toscan =new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = toscan.nextInt();
		int i,j,count = 0;
		for(i = 1;i <= num;i++)
		{
			count = 0;
				for(j=1;j<=i;j++)
				{
					if(i % j == 0)
						count++;
				}
			if(count == 2)
			System.out.println(i);
		}
	}
}