package day1;
import java.util.*;
public class middle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		StringBuffer str1=new StringBuffer(str).reverse();
		if(str.equals(str1.toString())){
			System.out.println("palindrome");
		}
			else {
				System.out.println("Not a palinndrome");
			}
		}
}

			
			

