package model;

public class Cookie extends Pastry {
	
	public Cookie(Bakery bake1, Bakery bake2) {
		super(bake1, bake2);
	}
	
	public void create() {
		System.out.print("Cookie: ");
		bake1.produce();
		bake2.produce();
	}

}
