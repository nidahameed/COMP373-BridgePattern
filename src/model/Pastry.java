package model;

public class Pastry {
	
	protected Bakery bake1;
	protected Bakery bake2;
	
	protected Pastry(Bakery bake1, Bakery bake2) {
		this.bake1= bake1;
		this.bake2= bake2;
	}
	
	 public void create() {}

}
