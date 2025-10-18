package a;

import java.util.Scanner;

public class Diziort {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		int sayi;
		System.out.println("Sayiyi giriniz: ");
		sayi = input.nextInt();
		int[] numbers = new int[sayi];
		
		for(int i = 0; i<sayi ; i++) {
			System.out.println((i+1)+". elemanı giriniz:");
			numbers[i] = input.nextInt();
		}
		double sum = 0;
		for(int i=0 ; i<numbers.length;i++) {
			sum += numbers[i];
		}
		
		double result=sum/numbers.length;
		System.out.println("Dizinin ort: "+result);
		
	}

}
