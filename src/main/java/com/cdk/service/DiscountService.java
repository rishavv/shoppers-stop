package com.cdk.service;

import com.cdk.exception.BillingAppException;
import com.cdk.model.BillDetails;

/**
 * @author rishavv
 * Can have different implementations if required
 */
public interface DiscountService {

	public BillDetails calculateDiscount(String customerType, Double purchaseAmount) throws BillingAppException;
}
