package day1;
import java.util.*;

public class ticket {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num=s.nextInt();
		if((num%10==3)||(num%10==8))
			 System.out.print("Lucky winners");
			else {
				 System.out.print("Not a lucky winners");
			}

	}

}
