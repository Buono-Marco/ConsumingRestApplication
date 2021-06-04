package com.marcobuono.consumingrest;

public class Value {
	
	private Long id;
	private String quote;
	
	public Value() {}
	
	// getter method
	public Long getId() {
		return id;
	}
	
	public String getQuote() {
		return quote;
	}
	// end getter method
	
	// setter method
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setQuote(String quote) {
		this.quote = quote;
	}
	// end setter method
	
	@Override
	public String toString() {
		return "Value {"
				+ "id='" + id + "', "
				+ "quote=" + quote
				+ "}";
	}

}
