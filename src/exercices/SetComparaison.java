package exercices;

import java.util.*;

public class SetComparaison {
public static void main(String[] args) {
	Set<String> hashSet=new HashSet<>(Arrays.asList("RAM","disque dur","ROM"));
	Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("RAM","disque dur","ROM"));
	Set<String> treeSet = new TreeSet<>(Arrays.asList("RAM","disque dur","ROM"));
	
	
	
	System.out.println("HashSet (non ordonne) : " + hashSet );
	System.out.println("LinkedHashSet  (ordre d'insertion ) : " + linkedHashSet );
	System.out.println("TreeSet  (trie par ordre alphabetique) : " + treeSet );
	
	
	
}
}
