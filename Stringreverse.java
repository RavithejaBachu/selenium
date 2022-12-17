package pack1;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		char []c=name.toCharArray();
		for (int i =c.length-1; i>=0; i--) {
			
			System.out.println(name.charAt(i));
		}
  
	}

}
