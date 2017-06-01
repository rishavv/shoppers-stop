package com.cdk.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.cdk.config.DiscountConfig;
import com.cdk.model.Customer.CustomerType;
import com.cdk.model.Discount;

/**
 * @author rishavv
 * Contains validation and calculation utils
 */
public class BillingAppUtils {

	// validate the discount objects in the discountconfig
	public static boolean isValidDiscountConfig(DiscountConfig discountConfig){
		for(Entry<CustomerType, TreeMap<Double, Discount>> e : discountConfig.getDiscountProps().entrySet()){
			List<Discount> discountVals = new ArrayList<Discount>(e.getValue().values());
			for (int i = 0; i < discountVals.size(); i ++) {
				if(!isDiscountRateValid(discountVals.get(i))){
					return false;
				}
				if(!isDiscountSlabValid(discountVals.get(i))){
					return false;
				}
				if( i > 0 && !isDiscountRangeValid(discountVals.get(i-1), discountVals.get(i))){
					return false;
				}
			}
		}
		return true;
	}

	// check if discount rate is between 0 and 100
	private static boolean isDiscountRateValid(Discount discount) {
		if (0.0d <= discount.getDiscountRate() && discount.getDiscountRate() <= 100.0d) {
			return true;
		}
		return false;
	}
	
	// check if each discount slab is valid
	private static boolean isDiscountSlabValid(Discount discount){
		if(discount.getMaxPrice() > discount.getMinPrice()){
			return true;
		}
		return false;
	}
	
	// checks if the defined discount slabs are consecutive
	private static boolean isDiscountRangeValid(Discount discount1, Discount discount2){
		if(discount2.getMinPrice() - discount1.getMaxPrice() == 1){
			return true;
		}
		return false;
	}
	
	public static double getPriceAfterDiscount(Double price, Double discountRate){
		return (1.0d - discountRate/100)*price;
	}
}
