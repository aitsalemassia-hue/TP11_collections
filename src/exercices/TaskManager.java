package exercices;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	public static void main(String[] args) {
		List<Task> tasks =new ArrayList<>();
		
		tasks.add(new Task("Faire le TP 11 les collections en java "));
		tasks.add(new Task("Faire les cours "));
		
		
		tasks.get(0).setCompleted(true);
		
		
		for (Task t:tasks) {
			System.out.println(t);
		}
	}

}
