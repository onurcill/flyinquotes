package com.flyinquotes.flyinquotes.output.v2;

import java.io.Serializable;

import com.flyinquotes.flyinquotes.output.v2.builderv2.PricesCryptoOutputBuilderv2;


public class Quotes implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private USD USD;
	
	public Quotes(PricesCryptoOutputBuilderv2 pricesCryptoOutputBuilderv2) {
    	USD = pricesCryptoOutputBuilderv2.USD;  	
	}

	public Quotes() {

	}
	
	public USD getUSD() {
		return USD;
	}

	public void setUSD(USD uSD) {
		USD = uSD;
	}
	
}
