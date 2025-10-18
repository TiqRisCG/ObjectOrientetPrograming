package a;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("n degerini gir: ");
		int n = input.nextInt();
		int a=1,b=1;
		System.out.println(a);
		System.out.println(b);
		
		for(int i = 1; i<n ; i++) {
			int temp = a+b;
			
			a=b;
			b=temp;
			
			System.out.println(temp);
		}
		

	}

}
