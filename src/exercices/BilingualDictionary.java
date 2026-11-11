package exercices;

import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
	public static void main(String[] args) {
		Map<String, String> dictionnaire = new HashMap<>();
		dictionnaire.put("cat", "chat");
		dictionnaire.put("dog","chien");
		dictionnaire.put("bird", "oiseau");
		
		
		System.out.println("Traduction de dog : " +dictionnaire.get("dog"));
		System.out.println("Traduction de cat : " +dictionnaire.get("cat"));

		System.out.println("Dictionnaire complet :");
		for (Map.Entry<String, String> entry:dictionnaire.entrySet()) {
			System.out.println(entry.getKey()+ "->"+ entry.getValue());
		}
		
		
		
	}

}
