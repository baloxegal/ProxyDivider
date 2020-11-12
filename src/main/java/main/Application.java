package main;

import data.DivideConsumer;

public class Application {

	public static void main(String[] args){
		
		DivideConsumer div = new DivideConsumer();		
				
		System.out.println(div.divide(6, 3));
		
		System.out.println(div.divide(6, 4));
		
		System.out.println(div.divide(10, 3));
		
		System.out.println(div.divide(6, 0));
		
		System.out.println(div.divide(10, 0));
				
	}

}
