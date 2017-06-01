package com.cdk.exception;

/**
 * @author rishavv
 *	Custom Exception for representing all validation failures
 */
public class BillingAppException extends Exception{
	private static final long serialVersionUID = 1L;

	public BillingAppException(String message){
		super(message);
	}
}
