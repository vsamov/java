package day3.interfaceex;

public class Word implements Office{
	
	public void New(){
		System.out.println("Word New .doc");
	}
	
	public void open(){
		System.out.println("Word Open .doc");
	}
	
	public void save(){
		System.out.println("Word Save .doc");
	}
}
