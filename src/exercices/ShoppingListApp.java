package exercices;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
	public static void main(String[] args) {
		List<String> shoppingList  =new ArrayList<>();
		
		
		
		
		shoppingList.add("fromage");
		shoppingList.add("Pommes");
		shoppingList.add("Tomates");
		
		System.out.println(" la liste des articles : ");
		for(String item :shoppingList) {
			System.out.println(item);
		}
		
		
		shoppingList.remove("Tomates");
		
		System.out.println(" la liste des articles : ");
		for(String item :shoppingList) {
			System.out.println(item);
		}
		
		boolean hasPomme= shoppingList.contains("Pommes");
		System.out.println("est ce que la liste contient des pommes ? "+hasPomme);
		System.out.println("Taille final de la liste : "+shoppingList.size());
		
		
	
	
	}

}
