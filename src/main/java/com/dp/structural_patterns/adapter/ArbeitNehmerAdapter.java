package com.dp.structural_patterns.adapter;

public class ArbeitNehmerAdapter implements Employee {
	private ArbeitNehmer arbeitNehmer;
	
	public ArbeitNehmerAdapter(ArbeitNehmer arbeitNehmer) {
		this.arbeitNehmer = arbeitNehmer;
	}
	
	public String getId() {
		return arbeitNehmer.getNummer();
	}
	
	public String getFName() {
		return arbeitNehmer.getVorName();
	}
	
	public String getLName() {
		return arbeitNehmer.getNachName();
	}
}
