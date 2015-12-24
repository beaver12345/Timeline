import java.util.*;

public class TimelineTest {
	public static void main(String[] args) {
		int input = 0;
		Scanner sc = new Scanner(System.in);
		TimelineList list = new TimelineList();
		int id = 0;
		
		System.out.println("Welcome to the Timeline program.");

		printPrompt();	
		input = sc.nextInt();

		while (input != 4) {
			if (input == 1) {
				System.out.println(list);
			} else if (input == 2) {
				System.out.print("Please enter the title of the event: ");
				String title = sc.nextLine();
				
				System.out.print("Please enter the year of the event: ");
				int year = sc.nextInt();

				System.out.print("Please enter the month of the event: ");
				int month = sc.nextInt();

				System.out.print("Please enter the day of the event: ");
				int day = sc.nextInt();

				list.add(new Event(new Date(year, month, day), title, id));
				list.sort();

				id++;
			} else if (input == 3) {
				System.out.print("Please enter the id of the event that you would like to remove: ");
				id = sc.nextInt();

				list.removeID(id);
			}
			printPrompt();
			input = sc.nextInt();
		}

		System.out.println("Goodbye. Have a nice day. :)");
	}

	public static void printPrompt() {
		System.out.print("You may enter 1 to view the complete timeline, 2 to add an event to your timeline, 3 to remove an event from your timeline, or 4 to exit this program.");
	}
}
