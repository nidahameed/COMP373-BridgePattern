package view;

import model.Bake;
import model.Cake;
import model.Cookie;
import model.Decorate;
import model.Pastry;

public class Driver {

	public static void main(String[]args) {
		Pastry pastry1 = new Cookie(new Bake(), new Decorate());
		pastry1.create();
		Pastry pastry2= new Cake(new Bake(), new Decorate());
		pastry2.create();
	}
}
