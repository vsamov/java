package org.samovich.technologies.basics.concepts.objects.box;

public class Employee {
	
	// encapsulation: data & methods that act on the data
	double salary;
	double bonus;
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Totla pay " + totalPay);
	}
	
}
