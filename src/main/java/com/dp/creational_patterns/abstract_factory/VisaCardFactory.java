package com.dp.creational_patterns.abstract_factory;

public class VisaCardFactory extends CreditCardFactory {
	@Override
	public CreditCard getCreditCard(CardType cardtype) {
		switch (cardtype) {
			case GOLD:
				return new VisaGold();
			case BASIC:
				return new VisaBasic();
			default:
				break;
		}
		return null;
	}
	
	@Override
	public Validator getValidator(CardType cardtype) {
		switch (cardtype) {
			case GOLD:
				return new VisaGoldValidator();
			case BASIC:
				return new VisaBasicValidator();
			default:
				break;
		}
		return null;
	}
}
