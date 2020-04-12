package model;

public class Cake extends Pastry {

	public Cake(Bakery bake1, Bakery bake2) {
		super(bake1, bake2);
	}
	
	public void create() {
		System.out.print("Cake: ");
		bake1.produce();
		bake2.produce();
	}

}
