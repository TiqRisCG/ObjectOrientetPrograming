package a;

import java.util.Scanner;

public class Taksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double acılıs=10,km=2.20,a;
		Scanner input = new Scanner (System.in);
		System.out.println("Mesafe: ");
		a = input.nextDouble();
		double toplam=acılıs+km*a;
		
		/*
		if(toplam<20) {
			System.out.println("toplam: 20");
		}
		else {
			System.out.println("toplam: "+toplam);
		}*/
		toplam =(toplam<20)?20:toplam;
		System.out.println(+toplam);
		
		

	}

}
