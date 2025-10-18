package a;

import java.util.Scanner;

public class KDV {

	public static void main(String[] args) {

	 
		double KDV;
		Scanner input = new Scanner (System.in);
		System.out.println("Kdv : ");
		KDV = input.nextInt();
		System.out.println("Kdv oranı:%18");
		System.out.println("Kdvli oran: "+(KDV+KDV*18/100));
		
		
		
		
		
	}

}
