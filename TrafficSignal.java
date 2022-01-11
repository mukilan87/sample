package ExamplePrograms;

import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		Scanner toscan = new Scanner(System.in);
		System.out.println("Enter the color of the signal: ");
		String str = toscan.nextLine();
		String str1,str2,str3;
		str1 = "red";
		str2 = "yellow";
		str3 = "green";
		if(str.equals("red"))
			System.out.println("STOP");
		else if(str.equals(str2))
			System.out.println("READY");
		else if(str.equals(str3))
			System.out.println("GO");
		else
			System.out.println("Please enter a valid color");

	}

}
