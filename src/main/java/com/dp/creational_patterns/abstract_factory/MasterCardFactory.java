package com.dp.creational_patterns.abstract_factory;

public class MasterCardFactory extends CreditCardFactory {
	@Override
	public CreditCard getCreditCard(CardType cardtype) {
		switch (cardtype) {
			case GOLD:
				return new MasterGold();
			case BASIC:
				return new MasterBasic();
			default:
				break;
		}
		return null;
	}
	
	@Override
	public Validator getValidator(CardType cardtype) {
		switch (cardtype) {
			case GOLD:
				return new MasterGoldValidator();
			case BASIC:
				return new MasterBasicValidator();
			default:
				break;
		}
		return null;
	}
}
