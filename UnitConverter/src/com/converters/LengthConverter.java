package com.converters;


public class LengthConverter {
	
	double length;
	double outputLength;
	
	public double meterToKilometer(double length) {
		this.length = length;	
		System.out.println();
		outputLength = length / 1000;
		return outputLength;
	}
	
	public double meterToFeet(double length) {
		this.length = length;	
		System.out.println();
		outputLength = length * 3.2808399;
		return outputLength;
	}
	
	public double meterToCentimeter(double length) {
		this.length = length;
		System.out.println();		
		outputLength = length * 100;
		return outputLength;
	}
}
