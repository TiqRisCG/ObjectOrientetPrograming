package a;

import java.util.Scanner;

public class teksayılarıtoplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,toplam=0;
		Scanner input = new Scanner(System.in);
		int number;
		do {
			 number = input.nextInt();
			 if(number%2==1) {
				// System.out.println("tek Sayılar:");
			 toplam += number;
			 }
			
		}while(number>0);

		System.out.println("Tek Toplamı: "+toplam);
	}

}
