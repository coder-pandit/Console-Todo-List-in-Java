import java.util.ArrayList;

public class Functions {
	ArrayList<String> a = new ArrayList<String>();
	
	void printCommands() {
		System.out.println("Commands: \n"
				+ "1. Print Commands \n"
				+ "2. Print Todo List \n"
				+ "3. Add Item \n"
				+ "4. Update Item \n"
				+ "5. Remove Item \n"
				+ "6. Search Item \n"
				+ "0. Exit");
	}
	
	void addItem(String s) {
		a.add(s);
	}
	
	void displayList() {
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i + 1 + ". " + a.get(i));
		}
	}
	
	void removeItem(int i) {
		String str = a.get(i-1);
		a.remove(i-1);
		System.out.println("Removed item is: " + str);
	}
	
	void updateItem(int i, String s) {
		a.set(i-1, s);
	}
	
	void searchItem(String s) {
		int i = a.indexOf(s);
		
		if(i == -1) {
			System.out.println("Item not found");
		}
		else {
			System.out.println("Item found at position: " + (i+1));
		}
		
	}
}
