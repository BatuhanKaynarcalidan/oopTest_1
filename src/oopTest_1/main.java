package oopTest_1;

import java.util.Iterator;

public class main {

	public static void main(String[] args) 
	{
		Plant plant1 = new Plant(0,"Marul",3);
		Plant plant2 = new Plant(1,"Armut",5);
		Plant plant3 = new Plant(2,"Elma",12);
		Plant plant4 = new Plant(3,"Biber",23);
		Plant plant5 = new Plant(4,"Patates",123);
		
		Category category1 =new Category(0,"Sebze");
		Category category2 =new Category(1,"Meyve");

		Category[] categories = {category1,category2};
		
		Plant[] plants = {plant1,plant2,plant3,plant4,plant5};
		
		for (Category category : categories ) 
		{	
			System.out.println(category.name);
		
		}
		for (Plant plant :plants ) 
		{
			System.out.println(plant.name+" "+plant.piece);
		}
		
		PlantManager plantManager = new PlantManager();
		plantManager.toColletct();
	}

}
