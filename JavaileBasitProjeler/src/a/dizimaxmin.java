package a;

import java.util.Scanner;

public class dizimaxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=0;
		Scanner input = new Scanner (System.in);
		System.out.println("Dizinin boyutunu giriniz: ");
		sayi = input.nextInt();
		
		int[] numbers = new int[sayi];
		
		for (int i=0;i<sayi;i++) {
			System.out.println((i+1)+". elemanını giriniz:");
			numbers[i] = input.nextInt();
			
		}
		int min = numbers[0];
		int max = numbers[0];
		
		for(int i = 1;i<numbers.length;i++) {
			if(numbers[i]<min) {
				min = numbers[i];
			}
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		
		System.out.println("min: "+min);
		System.out.println("max: "+max);

	}

}
