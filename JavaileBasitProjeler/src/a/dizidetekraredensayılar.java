package a;

import java.util.Scanner;

public class dizidetekraredensayılar {

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
		boolean[] checked = new boolean[numbers.length];
		
		System.out.println("Tekrar eden sayılar:");
		for(int i=0;i<numbers.length;i++) {
			int count = 1;
			if(!checked[i]) {
				
			
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j] ){
					count++;
					checked[j]=true;
				}
			}
			if(count>1) {
				System.out.println(numbers[i]+"("+count+" kez)");
			}
		}

	}
	}
}
