package com.marcobuono.consumingrest;

public class Quote {
	
	private String type;
	private Value value;
	
	public Quote() {}
	
	
	// getter method
	public String getType() {
		return type;
	}
	
	public Value getValue() {
		return value;
	}
	// end getter method
	
	// setter method
	public void setType(String type) {
		this.type = type;
	}
	
	public void setValue(Value value) {
		this.value = value;
	}
	// end setter method
	
	@Override
	public String toString() {
		return "Quote {"
				+ "type='" + type + "', "
				+ "value=" + value
				+ "}";
	}

}
