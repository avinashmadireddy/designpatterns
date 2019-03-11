package com.dp.creational_patterns.abstract_factory;

public abstract class CreditCardFactory {
	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore > 650)
			return new VisaCardFactory();
		else
			return new MasterCardFactory();
	}
	
	public abstract CreditCard getCreditCard(CardType cardtype);
	
	public abstract Validator getValidator(CardType cardtype);
}
