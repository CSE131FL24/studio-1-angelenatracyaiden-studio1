package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		double x = in.nextInt();
		double y = in.nextInt();
		System.out.print((x + y)/2);
	}

}
