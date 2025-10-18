package a;

import java.util.Scanner;

public class harmonikseri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n,result;
		Scanner input = new Scanner (System.in);
		System.out.println("N degerini gir: ");
		n = input.nextInt();
		result=0;
		for (double i = 1; i<=n ; i++) {
			result += (1.0/i);
		}

		System.out.println(result);
	}

}
