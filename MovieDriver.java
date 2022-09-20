/*
 *Class: CMSC203 CRN 21076 
 *Program: Lab 1
 *Instructor: Khandan Monshi
 *Summary of Description: In this lab, you are introduced to multiple classes (a driver class and a data element class).  You will write the driver class in order to test the various methods provided in the data element class.
 *Due Date: 09/20/2022
 *Platform/compiler: Eclipse
 *Integrity Pledge: I pledge that I have completed the programming assignment independently.
 *I have not copied the code from a student or any source.
 *Print your Name here: Majdoleen Mohammedaman
 */

import java.util.Scanner;

public class MovieDriver {

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
		
		// Task #2
		
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
		}
		else if(repeat.equals("n")) {
			System.out.println("Goodbye");
		}
		
		
		input.close();
		
		
	}

}
