import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter the string :");
		Scanner toscan = new Scanner(System.in);
		String str = toscan.nextLine();
		int strlen, j=0;
		strlen = str.length();
		char[] second = new char[strlen];
		//System.out.println("Length = "+ strlen);
		for(int i = strlen-1 ; i >= 0; i--) // reverse the string and store in the form of char array
		{
			second[j] = str.charAt(i);
			j++;
			//System.out.println(second[j]);
		}
		String result = String.copyValueOf(second); //Converts char array to String
		System.out.println("After changing from char array to string : " + result);
		if(str.equalsIgnoreCase(result)) {
			System.out.println("String is Palindrome");
		}
		else
			System.out.println("String is Not Palindrome");
}
}
