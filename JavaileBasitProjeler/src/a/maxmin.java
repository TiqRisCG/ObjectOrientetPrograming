package a;

import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi,min=0,max=0;
		Scanner input = new Scanner (System.in);
		sayi = input.nextInt();
		for(int i=1;i<=sayi;i++) {
			System.out.print(i+". sayiyi gir:");
			int num = input.nextInt();
			if(num<min || min==0) {
				min = num;
				
			}
			if(num>max) {
				max = num;
				
			}
			
		}
		System.out.println("min:"+min);
		System.out.println("max:"+max);
		
		/*do {
			sayi = input.nextInt();
			for (int i=0;i<=sayi;i++) {
				System.out.println("Sayilar:");
			}
		}while(sayi!=0);*/
	}

}
