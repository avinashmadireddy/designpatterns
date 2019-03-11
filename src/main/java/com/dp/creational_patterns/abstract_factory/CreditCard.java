package com.dp.creational_patterns.abstract_factory;

public abstract class CreditCard {
	protected int cardNumLength;
	protected int cscNumber;
	
	public int getCardNumLength() {
		return cardNumLength;
	}
	
	public void setCardNumLength(int cardNumLength) {
		this.cardNumLength = cardNumLength;
	}
	
	public int getCscNumber() {
		return cscNumber;
	}
	
	public void setCscNumber(int cscNumber) {
		this.cscNumber = cscNumber;
	}
}
