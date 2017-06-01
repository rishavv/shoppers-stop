package com.cdk.config;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.cdk.model.Customer.CustomerType;
import com.cdk.model.Discount;

/**
 * @author rishavv
 *	Initializes and holds the discount configuration
 */
public class DiscountConfig {

	private Map<CustomerType, TreeMap<Double, Discount>> discountProps;

	public DiscountConfig() {
		this.discountProps = initDiscountProperties();
	}

	// this can be loaded from a properties file or a database
	private Map<CustomerType, TreeMap<Double, Discount>> initDiscountProperties() {
		Map<CustomerType, TreeMap<Double, Discount>> discountProps = new HashMap<CustomerType, TreeMap<Double, Discount>>();

		// regular customer discount ranges
		TreeMap<Double, Discount> regularCustomerMap = new TreeMap<Double, Discount>();
		// min price as key and Discount object as value
		// this ensures there are no duplicate discount ranges;
		regularCustomerMap.put(1.0d, new Discount(1.0d, 5000.0d, 0.0d));
		regularCustomerMap.put(5001.0d, new Discount(5001.0d, 10000.0d, 10.0d));
		regularCustomerMap.put(10001.0d, new Discount(10001.0d, Double.MAX_VALUE, 20.0d));
		discountProps.put(CustomerType.REGULAR, regularCustomerMap);

		// regular customer discount ranges
		TreeMap<Double, Discount> premiumCustomerMap = new TreeMap<Double, Discount>();
		premiumCustomerMap.put(1.0d, new Discount(1.0d, 5000.0d, 10.0d));
		premiumCustomerMap.put(5001.0d, new Discount(5001.0d, 10000.0d, 20.0d));
		premiumCustomerMap.put(10001.0d, new Discount(10001.0d, Double.MAX_VALUE, 30.0d));
		discountProps.put(CustomerType.PREMIUM, premiumCustomerMap);

		return discountProps;
	}

	public Map<CustomerType, TreeMap<Double, Discount>> getDiscountProps() {
		return discountProps;
	}

	public void setDiscountProps(Map<CustomerType, TreeMap<Double, Discount>> discountProps) {
		this.discountProps = discountProps;
	}

}
