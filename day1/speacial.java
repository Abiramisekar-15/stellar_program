package day1;
import java.util.*;


public class speacial {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int min=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		} 
		min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		} 
		System.out.println(min);
			}
			
		}
		



	


