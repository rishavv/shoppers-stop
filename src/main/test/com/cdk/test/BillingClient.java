package com.cdk.test;

import java.util.ArrayList;
import java.util.List;

import com.cdk.exception.BillingAppException;
import com.cdk.model.BillDetails;
import com.cdk.model.Customer.CustomerType;
import com.cdk.service.DiscountService;
import com.cdk.service.SimpleDiscountService;

/**
 * @author rishavv
 * Simple Client for the billing app
 * Contains test cases for all possible billing calculations
 * and validating the discount configuration
 */

public class BillingClient {

	public static void main(String[] args) {
		try {
			testExpectedBillResults();
		} catch (BillingAppException e) {
			e.printStackTrace();
		}
	}

	private static List<BillDetails> getExpectedBillAmountsData(){
		List<BillDetails> expectedBillAmountList = new ArrayList<BillDetails>();
		expectedBillAmountList.add(new BillDetails(CustomerType.REGULAR,5000.0d,5000.0d));
		expectedBillAmountList.add(new BillDetails(CustomerType.REGULAR,10000.0d,9500.0d));
		expectedBillAmountList.add(new BillDetails(CustomerType.REGULAR,15000.0d,13500.0d));
		expectedBillAmountList.add(new BillDetails(CustomerType.PREMIUM,5000.0d,4500.0d));
		expectedBillAmountList.add(new BillDetails(CustomerType.PREMIUM,10000.0d,8500.0d));
		expectedBillAmountList.add(new BillDetails(CustomerType.PREMIUM,15000.0d,12000.0d));
		return expectedBillAmountList;
	}
	
	private static void testExpectedBillResults() throws BillingAppException{
		DiscountService ds = new SimpleDiscountService();
		
		List<BillDetails> expectedBillAmountList = getExpectedBillAmountsData();
		BillDetails actualBill;
		for(BillDetails expectedBill : expectedBillAmountList){
			actualBill = ds.calculateDiscount(expectedBill.getCustomerType().getCustomerType(), expectedBill.getPurchaseAmount());
			StringBuilder sb = new StringBuilder();
			sb.append("Customer Type ");
			sb.append(expectedBill.getCustomerType().getCustomerType());
			sb.append(" Purchase Amount ");
			sb.append(expectedBill.getPurchaseAmount());
			sb.append(" Expected Bill Amount ");
			sb.append(expectedBill.getBillAmount());
			sb.append(" Actual Bill Amount ");
			sb.append(actualBill.getBillAmount());
			if(expectedBill.getBillAmount().equals(actualBill.getBillAmount())){
				sb.append(" PASSED");
			}
			else {
				sb.append(" FAILED");
			}
			System.out.println(sb.toString());
		}
	}
}
