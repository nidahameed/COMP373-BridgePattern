package model;

public class Decorate implements Bakery {

	@Override
	public void produce() {
		System.out.println(" And Decorated.");
		
	}

}
