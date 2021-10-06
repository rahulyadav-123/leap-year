package leap;

import java.util.Scanner;

public class leap {
 public static void main(String[] args) {
	 int year;
	 System.out.println("Enter the year");
	Scanner sc = new scanner(System.in;);
	 int year = sc.nextInt();
	 if(((year % == 0) && (year %100 |= 0)) || (year % 400 ==o)) {
		 System.err.println("This year is a leap year");
		 else {
			 System.out.println("This year is not aleap year");
		 }
	 }
}
}
