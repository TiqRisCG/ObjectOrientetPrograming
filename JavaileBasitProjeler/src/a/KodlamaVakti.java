package a;

import java.util.Scanner;

public class KodlamaVakti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		double boy,kilo;
		System.out.println("Boyunuzu Giriniz: ");
		 boy = input.nextDouble();
		
		System.out.println("Kilonuzu Giriniz: ");
		 kilo = input.nextDouble();
		
		System.out.println("VKE: "+(kilo/(boy*boy)));
		

	}

}
