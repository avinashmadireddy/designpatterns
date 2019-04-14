package com.dp.structural_patterns.adapter;

public class ArbeitNehmer {
	private String nummer;
	private String vorName;
	private String nachName;
	
	public ArbeitNehmer(String nummer, String vorName, String nachName) {
		super();
		this.nummer = nummer;
		this.vorName = vorName;
		this.nachName = nachName;
	}
	
	public String getNummer() {
		return nummer;
	}
	
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
	public String getVorName() {
		return vorName;
	}
	
	public void setVorName(String vorName) {
		this.vorName = vorName;
	}
	
	public String getNachName() {
		return nachName;
	}
	
	public void setNachName(String nachName) {
		this.nachName = nachName;
	}
}
