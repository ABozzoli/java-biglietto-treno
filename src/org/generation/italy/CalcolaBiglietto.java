package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	/* chiedere all'utente num km da percorrere
	 * e l'età del passeggero
	 * in base a questo calcolare costo (0,21€/km)
	 * sconto 20% under 18
	 * sconto 40% over 65
	 */
	
	public static void main(String[] args) {

		// init Scanner
		Scanner scanner = new Scanner(System.in);
				
		// input vars
		int age;
		double km;
		
		// init vars
		System.out.print("Insert your age: ");
		age = scanner.nextInt();
		System.out.print("Insert how many km: ");
		km = scanner.nextDouble();
		
		// output
		double fullPrice = km * 0.21;
		double finalPrice;
		
		if(age < 18) {
			finalPrice = fullPrice * 0.8;
		} else if(age >= 65) {
			finalPrice = fullPrice * 0.6;
		} else {
			finalPrice = fullPrice;
		}
		
		// print
		System.out.print("Your ticket costs: " + finalPrice +"€");
		
		// close Scanner
		scanner.close();
				
	}

}
