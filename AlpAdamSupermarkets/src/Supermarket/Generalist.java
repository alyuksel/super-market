package Supermarket;

import Produits.ProductType;


public class Generalist extends SuperMarket{
	
	public Generalist(String name) {
		super(name,"Generalist");
		
	}

	
	public Integer numberOfAlimentaryRay(){
		return (int) this.rayons.values().stream()
				.filter(rayon -> rayon.getProductType().equals(ProductType.Alimentary))
				.count();
	}
	

}
