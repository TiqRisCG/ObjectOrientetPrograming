package a;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		double a,b,sonuc=0;
		int islem;
		
		System.out.println("A degeri: ");
		a = input.nextDouble();
		System.out.println("B degeri: ");
		b = input.nextDouble();
		System.out.println("Toplama:1-Cıkartma:2-Carpma:3-Bölme:4 basınız ");
		System.out.println("islem: ");
		islem = input.nextInt();
		
		switch (islem) {
		case 1:
			System.out.println(+(a+b));
			break;
		case 2:
			System.out.println(+(a-b));
			break;
		case 3:
			System.out.println(+(a*b));
			break;
		case 4:
			System.out.println(+(a/b));
			break;
		
		}
		/*if(islem==1) {
			sonuc=a+b;
			System.out.println(+sonuc);
		}
		else if(islem==2){
			sonuc=a-b;
			System.out.println(+sonuc);
		}
		else if(islem==3){
			sonuc=a*b;
			System.out.println(+sonuc);
		}
		else if(islem==4){
			sonuc=a/b;
			System.out.println(+sonuc);
		}else {
			System.out.println("İslem Gecersiz:");*/
		
				//System.out.println("Sonuc: "+sonuc);
		
	}

}
