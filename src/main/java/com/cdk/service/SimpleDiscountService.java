package com.cdk.service;

import java.util.TreeMap;

import com.cdk.config.DiscountConfig;
import com.cdk.exception.BillingAppException;
import com.cdk.model.BillDetails;
import com.cdk.model.Customer.CustomerType;
import com.cdk.model.Discount;
import com.cdk.utils.BillingAppUtils;

/**
 * @author rishavv
 * Simple Implementation of the DiscountService
 * Contains all calculation related logic
 */
public class SimpleDiscountService implements DiscountService{

	@Override
	public BillDetails calculateDiscount(String customerType, Double purchaseAmount) throws BillingAppException {
		
		if (purchaseAmount <= 0){
			throw new BillingAppException("Invalid purchase amount");
		}
		
		// initialize discount config
		DiscountConfig discountConfig = new DiscountConfig();
		if(!BillingAppUtils.isValidDiscountConfig(discountConfig)){
			throw new BillingAppException("Invalid discount config");
		}
		
		// validate Customer Type
		CustomerType ct = CustomerType.fromString(customerType);
		if(ct == null){
			throw new BillingAppException("Invalid customer type");
		}
		
		return calculateDiscount(ct, purchaseAmount, discountConfig);
	}

	private BillDetails calculateDiscount(CustomerType customerType, Double purchaseAmount, DiscountConfig discountConfig){
		TreeMap<Double, Discount> applicableDiscountRange = discountConfig.getDiscountProps().get(customerType);
		Double billAmount = 0.0d;
		Double applicableAmountForDiscount = 0.0d;
		for(Discount discount : applicableDiscountRange.values()){
			if(purchaseAmount >= discount.getMaxPrice()){
				applicableAmountForDiscount = discount.getMaxPrice() - discount.getMinPrice() + 1;
				billAmount+= BillingAppUtils.getPriceAfterDiscount(applicableAmountForDiscount, discount.getDiscountRate());
			}
			else if(purchaseAmount <= discount.getMaxPrice() 
					&& purchaseAmount+1 >= discount.getMinPrice()){
				applicableAmountForDiscount = purchaseAmount - discount.getMinPrice() + 1; // correction for min amount
				billAmount+= BillingAppUtils.getPriceAfterDiscount(applicableAmountForDiscount, discount.getDiscountRate());
			}
			else {
				break;
			}
		}
		
		BillDetails billDetails = new BillDetails(customerType, purchaseAmount, billAmount);
		
		return billDetails;
	}
	
}
