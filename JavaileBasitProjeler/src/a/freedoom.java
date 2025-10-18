package a;

import java.util.Scanner;

public class freedoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner (System.in);
	int fizik,fiz,mat,tde,kimya,muzik,tarih;
	
	fizik = input.nextInt();
	fiz = input.nextInt();
	System.out.println("fizik: "+((fizik+fiz)/2));
	
	System.out.println("mat: ");
	mat = input.nextInt();
	
	System.out.println("tde: ");
	tde = input.nextInt();
	
	System.out.println("kimya: ");
	kimya = input.nextInt();
	
	System.out.println("muzik: ");
	muzik = input.nextInt();
	
	System.out.println("tarih: ");
	tarih = input.nextInt();
	
	double ort;
	System.out.println("ort:"+(fizik+mat+tde+kimya+muzik+tarih)/6);
	//System.out.println("geçti"+(ort=60));
	}

}
