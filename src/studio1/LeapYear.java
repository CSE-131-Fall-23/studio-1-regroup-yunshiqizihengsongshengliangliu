package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Year: ");
		int year = in.nextInt();
		boolean leapYear = ((year % 400 != 100) && (year % 400 != 200) && (year % 400 != 300) && (year % 4 == 0));
		System.out.println(leapYear);

	}

}
