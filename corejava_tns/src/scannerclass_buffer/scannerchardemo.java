package scannerclass_buffer;

import java.util.Scanner;

public class scannerchardemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		char c=scan.next().charAt(1);
		System.out.println("The second character of the input string is "+c);
		scan.close();
		
		

	}

}