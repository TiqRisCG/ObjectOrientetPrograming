package a;

import java.util.Scanner;

public class üçgençizme {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        int sayi;

	        do {//Menü
	            System.out.println("Aşağıdaki seçeneklerden birini (1'i) seçiniz:");
	            System.out.println("1. İçi dolu eşkenar dik üçgen");
	            System.out.println("2. Çıkış");
	            sayi = scanner.nextInt();

	            
	            if (sayi < 1 || sayi > 2) {
	                System.out.println("1 'i tercih yapmalısınız.");
	            } else if (sayi != 2) {
	                System.out.print("Şekil için sayiyi giriniz: ");
	                int size = scanner.nextInt();

		   switch (sayi) {
          
           case 1:
           	 içidoluüçgen(size);
               break;
           
       }
       }
   } while (sayi != 2);

   System.out.println("Programdan Çıktınız Tekrar Denemek İçin Yeniden Başlatın.");
   scanner.close();
}

		 public static void içidoluüçgen(float size) {
		    	
		    	float alan = (size * size) / 2 ;//Alan hesabı için
		    	System.out.println("Üçgenin Alanı: "+alan);//Ekrana yazdır.
		    	
		        for (int i = 1; i <= size; i++) {
		            for (int j = 1; j <= i; j++) {
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		       
		 }}


