package com.samovich.java.oop.inheritance.abstractex;

public class SquareContainer extends Container {

	public double calculateAreaOfBase(int length) {
		
		double area = length * length;
		System.out.println("Square area = " + area);
		return area;
	}

}