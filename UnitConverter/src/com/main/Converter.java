package com.main;

import java.util.Scanner;
import com.converters.*;
public class Converter {
	//Declaring Scanner obj
	static Scanner myScanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//declaring Variables
		String userInput;
		double meters;
		//double kilometers;
		LengthConverter lenCon = new LengthConverter();
		AstroConverter astroCon = new AstroConverter();
		VolumeConverter volCon = new VolumeConverter();
		double parsec;
		//double lightYear;
		double liters;
		//double gallons;
		boolean quit = false;
		
		do {
			System.out.println("Please select an option:");
			System.out.println("1. Convert Length");
			System.out.println("2. Convert Astronomical Distance");
			System.out.println("3. Convert Volume");
			System.out.println("Q. Press q to Quit");
			
			System.out.print("Your input: ");
			userInput = myScanner.next();
			System.out.println();
			
			switch (userInput){
			case "1":
				System.out.println("Please select an option:");
				System.out.println("1. Convert Meters to Kilometers");
				System.out.println("2. Convert Meters to Feet");
				System.out.println("3. Convert Meters to Centimeters");
				System.out.print("Your input: ");
				userInput = myScanner.next();
				System.out.println();
				
				switch(userInput) {
				case "1":
					System.out.print("Please enter in the number of meters: ");
					meters = myScanner.nextDouble();

					System.out.println("There are " + lenCon.meterToKilometer(meters) + "km in " + meters + "m!");
					break;
				case "2":
					System.out.print("Please enter in the number of meters: ");
					meters = myScanner.nextDouble();

					System.out.println("There are " + lenCon.meterToFeet(meters) + " Feet in " + meters + "m!");
					break;
				case "3":
					System.out.print("Please enter in the number of meters: ");
					meters = myScanner.nextDouble();

					System.out.println("There are " + lenCon.meterToCentimeter(meters) + "cm in " + meters + "m!");
					break;
				default:
					System.out.println("Outside the bounds of the selections. Reverting back to main selection menu.");
					break;
				}
				
				break;
			case "2":
				System.out.println("Please select an option:");
				System.out.println("1. Convert Parsecs to LightYears");
				System.out.println("2. Convert Parsecs to Astronomical Units");
				System.out.print("Your input: ");
				userInput = myScanner.next();
				System.out.println();
				
				switch (userInput) {
				case "1":
					System.out.print("Please enter the number of Parsecs: ");
					parsec = (float) myScanner.nextDouble();
					
					System.out.println("There are " + astroCon.parsecToLightYears(parsec) + " light years in " + parsec + " parsecs!");
					
					break;
				case "2":
					System.out.print("Please enter the number of Parsecs: ");
					parsec = (float) myScanner.nextDouble();
					
					System.out.println("There are " + astroCon.parsecToAstroUnits(parsec) + " AU in " + parsec + " parsecs!");
					
					break;
				default:
					System.out.println("Outside the bounds of the selections. Reverting back to main selection menu.");
					break;
				}
				break;
			case "3":
				System.out.println("Please select an option:");
				System.out.println("1. Convert liters to US Gallons");
				System.out.println("2. Convert liters to Imperial Gallons");
				System.out.println("3. Convert liters to Milliliters");
				System.out.print("Your input: ");
				userInput = myScanner.next();
				System.out.println();
				
				switch (userInput) {
				case "1":
					System.out.print("Please enter the number of Liters: ");
					liters = myScanner.nextDouble();
					System.out.println();
					System.out.println("There are " + volCon.literToUSGallon(liters) + " gallons in " + liters + " liters!");
					break;
				case "2":
					System.out.print("Please enter the number of Liters: ");
					liters = myScanner.nextDouble();
					System.out.println();
					System.out.println("There are " + volCon.literToImperialGallon(liters) + " gallons in " + liters + " liters!");
					break;
				case "3":
					System.out.print("Please enter the number of Liters: ");
					liters = myScanner.nextDouble();
					System.out.println();
					System.out.println("There are " + volCon.literToMilliliter(liters) + " milliliters in " + liters + " liters!");
					break;
				default:
					System.out.println("Outside the bounds of the selections. Reverting back to main selection menu.");
					break;
				}
				break;
			case "q":
				quit = true;
				break;
				
			}
			
		}while(quit != true);
		myScanner.close();
		
	}

}
