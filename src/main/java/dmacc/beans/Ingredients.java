package dmacc.beans;

import jakarta.persistence.Embeddable;

/**
 * @author  Andrew Steele aeste - aesteele
 * CIS175 - Fall 2021
 * Apr 12, 2023
 */
@Embeddable
public class Ingredients {
	public String items;
	public double quantitys;
	public String quantityTypes;
	
	public Ingredients() {
		super();
	}
	public Ingredients(String items, double quantitys, String quantityTypes) {
		super();
		this.items = items;
		this.quantitys = quantitys;
		this.quantityTypes = quantityTypes;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String item) {
		this.items = item;
	}
	public double getQuantitys() {
		return quantitys;
	}
	public void setQuantitys(double quantity) {
		this.quantitys = quantity;
	}
	public String getQuantityTypes() {
		return quantityTypes;
	}
	public void setQuantityTypes(String quantityType) {
		this.quantityTypes = quantityType;
	}
	
}
