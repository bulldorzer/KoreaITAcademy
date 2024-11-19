package generic;

import genericExtends.GenericPrinter;
import genericExtends.Plastic;
import genericExtends.Powder;

public class TestGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericPrinter<Powder> Powder = new GenericPrinter<Powder>();
		Powder.setMaterial(new Powder());
		GenericPrinter<Plastic> Plastic = new GenericPrinter<Plastic>();
		Plastic.setMaterial(new Plastic());
		
		System.out.println(Powder.toString());
		System.out.println(Plastic.toString());
	}

}
