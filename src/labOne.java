import java.util.Scanner;

/*
 * Zachariah Zatina
 */
public class labOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables being named
		Scanner scnr = new Scanner(System.in);
		char cont = 'y';
		double length;
		double width;
		double height;
		double perimeter;
		double area;
		double volume;
		
		//Set up of loop in order to continue application based on user preference.
		while (cont == 'y') {
			
			//input of data
			System.out.print("Enter length: ");
			length = scnr.nextDouble();
			System.out.print("Enter width: ");
			width = scnr.nextDouble();
			System.out.print("If you would like volume calculated enter height here, otherwise enter 0: ");
			height = scnr.nextDouble();
			
			//calculations of perimeter and area
			perimeter = (length * 2) + (width * 2);
			area = length * width;
			
			//output of wanted data
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Area: " + area);
			
			//if-else statement to find volume based on height if user wants this data.
			if (height > 0) {
				volume = length * width * height;
				System.out.println("Volume: " + volume);
			}
			else {
				System.out.print("");
			}
			
			//this is where user decides if they want to continue using application or not
			/*
			 * Q: had an error when I used a string enter initially
			 * i.e.: String input = scnr.nextLine();
			 * 		 cont = input.charAt(0);
			 * why is this the case as opposed to how i did it below
			 * which returns no errors.
			 */
			System.out.print("Continue? (y/n): ");
			cont = scnr.next().charAt(0);
			System.out.println("");
			
			}
		
		System.out.print("Goodbye!");
		scnr.close();
		
		}

	}