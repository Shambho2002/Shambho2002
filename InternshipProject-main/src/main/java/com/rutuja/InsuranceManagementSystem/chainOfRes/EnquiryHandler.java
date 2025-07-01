package com.rutuja.InsuranceManagementSystem.chainOfRes;

public interface EnquiryHandler {
	boolean handle();
	void setNext(EnquiryHandler handler);
}
