package a;

import java.util.Scanner;

public class mathpı {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,a;
		Scanner input = new Scanner(System.in);
		System.out.print("r: ");
		r = input.nextInt();
		System.out.print("a: ");
		a = input.nextInt();
		double alan = (Math.PI*(r*r)*a)/360;
		System.out.print(alan);

	}

}
