package com.cdk.model;

import com.cdk.model.Customer.CustomerType;

/**
 * @author rishavv
 * Any extension to bill details should be done here
 */
public class BillDetails {

	private CustomerType customerType;
	
	private Double purchaseAmount;
	
	private Double billAmount;

	public BillDetails(CustomerType customerType, Double purchaseAmount, Double billAmount){
		this.customerType = customerType;
		this.purchaseAmount = purchaseAmount;
		this.billAmount = billAmount;
	}
	
	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public Double getPurchaseAmount() {
		return purchaseAmount;
	}

	public void setPurchaseAmount(Double purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}
	
	
}
