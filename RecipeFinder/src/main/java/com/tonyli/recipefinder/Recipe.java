package com.tonyli.recipefinder;

import java.util.Date;
import java.util.List;

public class Recipe{

	private String name;
	private List<Material> ingredients;
	
	private Date closestUseBy = RecipeFinder.INIT_USEBY;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Material> getIngredients() {
		return ingredients;
	}
	
	public void setIngredients(List<Material> ingredients) {
		this.ingredients = ingredients;
	}

	public Date getClosestUseBy() {
		return closestUseBy;
	}

	public void setClosestUseBy(Date closestUseBy) {
		this.closestUseBy = closestUseBy;
	}
}


