import java.util.Scanner;

public class MovieDriver_Task2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Movie m = new Movie();
		
		// Task #1
		System.out.println("Enter the name of a movie");
		m.setTitle(input.nextLine());
				
		System.out.println("Enter the rating of the movie");
		m.setRating(input.nextLine());
				
		System.out.println("Enter the number of tickets sold for this movie");
		m.setSoldTickets(input.nextInt());
				
		System.out.println(m.toString());
		
		//Task #2
		String repeat;
		System.out.println("Do you want to enter another movie? (y or n)");
		repeat = input.next();
		
		if (repeat.equals("y")) {
			System.out.println("Enter the name of a movie");
			m.setTitle(input.nextLine());
			String title = input.nextLine();
			
			System.out.println("Enter the rating of the movie");
			m.setRating(input.nextLine());
			
			
			System.out.println("Enter the number of tickets sold for this movie");
			m.setSoldTickets(input.nextInt());
			
			System.out.println(title + m.toString());
			
			System.out.println("Do you want to enter another movie? (y or n)");
			repeat = input.next();
			
			if (repeat.equals("n")) {
				System.out.println("Goodbye");
			}
		}
		else if(repeat.equals("n")) {
			System.out.println("Goodbye");
		}
		
		
		
		input.close();

	}

}
