package day1;
import java.util.*;
public class day1_program1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Total43675 Salary");
		int salary=s.nextInt();
		
		int ExtraHoursonWeekdays=10*80;
		int weekend=(salary-ExtraHoursonWeekdays)/(80+50);
		System.out.println("Number of Hours Worked on Weekdays:"+(weekend+10 ));
		System.out.println("Number of Hours Worked on Weekend:"+ weekend);
		
		
		
		
	}
	

}
