import java.util.Scanner;

public class Todo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Functions f = new Functions();
		f.printCommands();
		int i = -1;
		while(i != 0) {
			System.out.print("\nEnter your command: ");
			i = sc.nextInt();
			sc.nextLine();
			
			switch (i) {
			case 0:
				break;
			
			case 1:
				f.printCommands();
				break;
				
			case 2:
				f.displayList();
				break;
				
			case 3:
				System.out.print("\nEnter item to add: ");
				f.addItem(sc.nextLine());
				break;
				
			case 4:
				System.out.println("Enter item number to update: ");
				int n = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter updated item: ");
				f.updateItem(n, sc.nextLine());
				break;
				
			case 5:
				System.out.println("Enter item number to be removed: ");
				f.removeItem(sc.nextInt());
				sc.nextLine();
				break;
				
			case 6:
				System.out.println("Enter item to be searched: ");
				f.searchItem(sc.nextLine());
				break;

			default:
				System.out.println("Enter correct choice:\n");
				break;
			}
		}
		

	}

}
