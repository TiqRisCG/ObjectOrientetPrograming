package a;

import java.util.Scanner;

public class BiletSistemi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String isim;
		int yas,km = 1,yolculuktipi,kmu,baslangıc = 300,toplam,son = 0;
		Scanner input = new Scanner (System.in);
		System.out.println("isim giriniz: ");
		isim = input.nextLine();
		System.out.println("yas giriniz:");
		yas = input.nextInt();
		System.out.println("km giriniz: ");
		kmu = input.nextInt();
		System.out.println("yolcu tipini giriniz:1->tek yön: 2->çift yön: basınız: ");
		yolculuktipi = input.nextInt();
		toplam=km*kmu+300;
		
		if(yas<12) {
			System.out.println((toplam)*50/100);
			son = (toplam)*50/100;
		}else if (yas<24&&yas>12) {
			System.out.println((toplam)*90/100);
			son = (toplam)*90/100;
		}
		else if (yas>65) {
			System.out.println((toplam)*70/100);
			son = (toplam)*70/100;
		}
		 if(yolculuktipi==1) {
			System.out.println((toplam));
		}
		else if(yolculuktipi==2) {
			System.out.println((son)*80/100);
		}
	}

}
