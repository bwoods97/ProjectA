package com.converters;

public class VolumeConverter {
	double volume;
	double outputVolume;
	
	public double literToUSGallon(double volume) {
		this.volume = volume;	
		System.out.println();
		outputVolume = volume / 3.78541178;
		return outputVolume;
	}
	
	public double literToImperialGallon(double volume) {
		this.volume = volume;	
		System.out.println();
		outputVolume = volume / 4.546092;
		return outputVolume;
	}
	
	public double literToMilliliter(double volume) {
		this.volume = volume;
		System.out.println();		
		outputVolume = volume * 1000;
		return outputVolume;
	}
}
