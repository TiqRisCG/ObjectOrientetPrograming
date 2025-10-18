package a;

import java.util.Random;
import java.util.Scanner;

public class adamasmaca {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		Random random = new Random();
		String [] words = {"java", "programlama", "bilgisayar","insan","kitap"};
		String wordToGuess = words[random.nextInt(words.length)];
		System.out.println(wordToGuess);//rastgele kelime secme
		
		boolean[]tahminedilen = new boolean[wordToGuess.length()];
		
		int tahminhakkı = 6;
		boolean isComplate = false;
		System.out.println("Adam asmaca oyununa hoşgeldiniz: ");
		System.out.println("Harf giriniz: ");
		while(tahminhakkı>0) {
			for ( int i = 0; i<wordToGuess.length();i++) {
				if(tahminedilen[i]) {
					System.out.print(wordToGuess.charAt(i)+" ");	

				}else {
					System.out.print("_ ");	

				}
			}
			System.out.println("");
			System.out.println("kalan tahmin hakkı: "+tahminhakkı);
			System.out.println("Harf giriniz: ");
			char guess = scanner.next().charAt(0);
			
			boolean isFound = false;
			
			for (int i=0; i<wordToGuess.length();i++) {
				if(wordToGuess.charAt(i)==guess) {
					tahminedilen[i]=true;
					isFound=true;
				}
			}
			if(isFound) {
				System.out.println("Harf dogru tahmin edildi: ");
				

			}else {
				tahminhakkı--;
			System.out.println("Harf bulunamadı yanlış harf : ");	

		}
			for (boolean letter: tahminedilen) {
				if(!letter ) {
					isComplate = false;
				}
			}
			if (isComplate) {
				System.out.println("Tebrikler:");	

				break;
			}

			if(tahminhakkı == 0) {
				System.out.println("Tahmin hakkı bitti:");
				System.out.println("Doğru kelime: "+wordToGuess);
				

				

			}

	}
	}		
		}
		
		
		
		
		
	


