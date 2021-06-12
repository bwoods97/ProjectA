package com.converters;

public class AstroConverter {
	
	double length;
	double outputLength;
	
	public double parsecToLightYears(double length) {
		System.out.println();
		this.length = length;
		outputLength = length * 3.26156378;
		return outputLength;
	
	}
	public double parsecToAstroUnits(double length) {
		System.out.println();
		this.length = length;
		outputLength = length * 206264.806;
		return outputLength;
	
	}
}
