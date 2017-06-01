package com.cdk.model;

import java.util.Comparator;

/**
 * @author rishavv
 * For discount range and rate
 */
public class Discount {

	private Double minPrice;
	
	private Double maxPrice;
	
	private Double discountRate;
	
	public Discount(Double minPrice, Double maxPrice, Double discountRate){
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.discountRate = discountRate;
	}

	public Double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(Double discountRate) {
		this.discountRate = discountRate;
	}

}

class DiscountComp implements Comparator<Discount>{
	 
    @Override
    public int compare(Discount dc1, Discount dc2) {
        if(dc1.getMinPrice() > dc2.getMinPrice()){
            return 1;
        } else {
            return -1;
        }
    }
}
