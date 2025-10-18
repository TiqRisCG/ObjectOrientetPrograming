package a;

import java.util.Scanner;

public class basamakbulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int n ,basamak=0;
		System.out.println("N degerini giriniz: ");
		n = input.nextInt();
		do {
			n = n/10;
			basamak++;
			
		}while(n!=0); {
			System.out.println("basamak sayısı:" +basamak);
		}
		

	}

}
