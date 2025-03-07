package day1;

import java.util.Scanner;

public class alternative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		for(int i=0;  i<s1.length();i++)
			if(s1.charAt(i)==s1.charAt(i+2)&&s1.charAt(i+1)==s1.charAt(i+3)){
				System.out.println("yes");
				break; 
			}
			else {
				System.out.println("No");
			}
		
		

	}

}
