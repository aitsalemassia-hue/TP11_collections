package exercices;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
	public static void main(String[] args) {
		String text ="souris clavier pc ecran hautParleur ";
		String[] wordsArray =text.split("  ");
		
		
		Set<String> uniqueWords =new HashSet<>();
		
		
		for (String w:wordsArray) {
			uniqueWords.add(w);
		}
		
		
		
		System.out.println("Mots uniques : " +uniqueWords);
	}

}
