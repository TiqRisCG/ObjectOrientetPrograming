package a;

import java.util.Scanner;

public class recursiveilefibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("n degerini giriniz: ");
		int n = input.nextInt();
		for (int i = 0; i<n ; i++) {
			System.out.println(fibo(i)+"");
		}
		
	}
		public static int fibo(int n) {
			if(n==0) {
				return  0; 
			}else if (n == 1) {
				return  1;
			}
			return fibo( n-2)+fibo( n-1);
		}

	}


