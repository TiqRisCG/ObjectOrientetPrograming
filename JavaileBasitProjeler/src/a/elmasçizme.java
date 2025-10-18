package a;

import java.util.Scanner;

public class elmasçizme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner (System.in);
		n = input.nextInt();
	/*	for (int p = 1; p <= n; p++) {
            for (int t = 1; t <=( p ); t++) {
                System.out.print(" ");
		
            }
            System.out.print("* ");
            }*/
		
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=( i-1 ); j++) {
                System.out.print(" ");
                
                
            }
            int starCount = (n+1)-i;
            for (int k = 1;k<=2*starCount-1;k++) {
            	 System.out.print("*");
            }
           // System.out.println(2*starCount-1);
            System.out.println();
		}}}
