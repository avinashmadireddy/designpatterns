package com.dp.creational_patterns.abstract_factory;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

//Factory of factories
//Factory of related objects
//Common interface
//Defer to Subclasses
//ex: Document builder, Frame works
public class AbstractFactory {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		documentBuilder();
		cardBuilder();
	}
	
	private static void cardBuilder() {
		CreditCardFactory cardFactory = CreditCardFactory.getCreditCardFactory(343);
		CreditCard creditCard = cardFactory.getCreditCard(CardType.BASIC);
		System.out.println(creditCard.getClass());
		//
		cardFactory = CreditCardFactory.getCreditCardFactory(888);
		creditCard = cardFactory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());
	}
	
	private static void documentBuilder() throws ParserConfigurationException, SAXException, IOException {
		String xml = "<document><html></html></document>";
		ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder newDocumentBuilder = dbf.newDocumentBuilder();
		Document doc = newDocumentBuilder.parse(bais);
		doc.getDocumentElement().normalize();
		System.out.println("Root element  " + doc.getDocumentElement().getNodeName());
		System.out.println(dbf.getClass());
		System.out.println(newDocumentBuilder.getClass());
	}
}
