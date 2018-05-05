package com.flyinquotes.flyinquotes.output.v2;

import java.io.Serializable;

import com.flyinquotes.flyinquotes.output.v2.builderv2.PricesCryptoOutputBuilderv2;

public class Metadata implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String timestamp;
    private String error;
    
    
    public Metadata(PricesCryptoOutputBuilderv2 pricesCryptoOutputBuilderv2) {
    	timestamp = pricesCryptoOutputBuilderv2.timestamp;
    	error = pricesCryptoOutputBuilderv2.error;
	}

	public Metadata() {

	}
    
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
}
