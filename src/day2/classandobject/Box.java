package day2.classandobject;

public class Box {
	
	int length; // class level data
	int width;
	
	
	int calculateArea(int length, int width){ // passing arguments
		int area = this.length * this.width;
		System.out.println("Area = " + area);
		return area;
	}
}
