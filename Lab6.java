import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please type a word to be translated.");
		Scanner in = new Scanner(System.in);
		String englishWord = in.nextLine();
		String convertToPigLatin = translateWord(englishWord) + "ay";
		String piglatinWord = translateWord(englishWord);
		System.out.println(convertToPigLatin);
		String startsWith1Consanent = piglatinWord;
		System.out.println(piglatinWord);

		 		
		 }

	
	/**
	 * This method takes any single English word and translates it to a Pig
	 * Latin word.
	 * 
	 */
	public static String translateWord(String englishWord) {
		String latinWord = (englishWord);
		latinWord = englishWord;
	
		
		    		
	    String findFirstVowel = ("ornament");     
		char v = Character.toLowerCase(findFirstVowel.charAt(0));

		if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
			String convertToPigLatin = findFirstVowel + "way";
			System.out.println(convertToPigLatin);

		} else {
			String first = findFirstVowel.substring(0, 1);
			String slice = findFirstVowel.substring(1, findFirstVowel.length());
			System.out.println(slice + first + "way");
			
		
		}

		return latinWord;
		
		
		
		
	}
	
	
}
