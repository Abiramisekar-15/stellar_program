package day1;
import java.util.*;

public class mark {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int mark=s.nextInt();
		if(mark<=100){
			System.out.print("Grade A");
		}
		else if(mark>=75){
				System.out.print("Grade B");
		}
		else {
			System.out.print("Grade E");
			
		}

	}

}
