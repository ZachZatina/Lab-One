import java.util.Scanner;

/*
 * Zachariah Zatina
 */
public class labOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);
		String input;
		char cont = 'y';
		double length;
		double width;
		double height;
		double perimeter;
		double area;
		double volume;
		
		while (cont == 'y') {
			
			System.out.print("Enter length: ");
			length = scnr.nextDouble();
			System.out.print("Enter width: ");
			width = scnr.nextDouble();
			System.out.print("If you would like volume calculated enter height here, otherwise enter 0: ");
			height = scnr.nextDouble();
			
			perimeter = (length * 2) + (width * 2);
			area = length * width;
			
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Area: " + area);
			
			if (height > 0) {
				volume = length * width * height;
				System.out.println("Volume: " + volume);
			}
			else {
				System.out.print("");
			}
			
			System.out.print("Continue? (y/n): ");
			cont = scnr.next().charAt(0);
			System.out.println("");
			
			}
		
		System.out.print("Goodbye!");
		}

	}