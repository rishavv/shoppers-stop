package com.cdk.model;

/**
 * @author rishavv
 * primarily to define customer types
 */
public class Customer {

	public enum CustomerType {
		REGULAR("regular"), PREMIUM("premium");

		private String type;

		CustomerType(String type) {
			this.type = type;
		}

		public String getCustomerType() {
			return type;
		}

		public static CustomerType fromString(String type) {
			for (CustomerType ct : CustomerType.values()) {
				if (ct.type.equalsIgnoreCase(type)) {
					return ct;
				}
			}
			return null;
		}
	}

	private CustomerType customerType;

	// fields below have been included only to demo
	// that customer details can be further added/retrieved from a DB
	// will be helpful while printing bill details

	private String name;

	public CustomerType getCustomerType() {
		return customerType;
	}

	public void setCustomerType(CustomerType customerType) {
		this.customerType = customerType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private Integer id;

}
