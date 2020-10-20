package conko;

import java.util.Scanner;

public class Pyramid2_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOfRows = scanner.nextInt();
		
		for(int i = 0; i < numberOfRows; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < numberOfRows - i; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}

}