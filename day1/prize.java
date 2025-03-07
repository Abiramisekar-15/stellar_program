package day1;
import java.util.*;
public class prize {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int angle=n1+n2+n3;
		if(angle==180) {
			if((n1==90)||(n2==90)||(n3==90)) {
			  System.out.print("prize 2");
			}
		else if((n1==n2)&&(n2==n3)){
			System.out.print("prize 3");
		}
		else {
			System.out.print("prize 1");
		}
		
		 
		
		

	}else {
		System.out.print("no prize");
	}
	}

}
