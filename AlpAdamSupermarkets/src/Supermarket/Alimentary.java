package Supermarket;


import java.util.ArrayList;

import Rayons.AlimentaryRay;
import Rayons.Rayon;

public class Alimentary extends SuperMarket {
	
	public Alimentary(String name) {
		super(name,"Alimentary");
	}
	
	@Override
	public void setRayons(ArrayList<Rayon> instal) {
		for(Rayon rayon: instal){
			if(rayon.getClass().equals(AlimentaryRay.class)){
				this.setRayon(rayon);
			}
		}
	}

	
}
