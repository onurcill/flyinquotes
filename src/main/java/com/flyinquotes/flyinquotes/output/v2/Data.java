package com.flyinquotes.flyinquotes.output.v2;

import java.io.Serializable;

import com.flyinquotes.flyinquotes.output.v2.builderv2.PricesCryptoOutputBuilderv2;

public class Data implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String id;
    private String name;
    private String symbol;
    private String website_slug;
    private String rank;
    private String circulating_supply;
    private String total_supply;
    private String max_supply;
    private Quotes quotes;
    private String last_updated;
    
    public Data(PricesCryptoOutputBuilderv2 pricesCryptoOutputBuilderv2) {
    	id = pricesCryptoOutputBuilderv2.id;
    	name = pricesCryptoOutputBuilderv2.name;
    	symbol = pricesCryptoOutputBuilderv2.symbol;
    	website_slug = pricesCryptoOutputBuilderv2.website_slug;
    	rank = pricesCryptoOutputBuilderv2.rank;
    	circulating_supply = pricesCryptoOutputBuilderv2.circulating_supply;
    	total_supply = pricesCryptoOutputBuilderv2.total_supply;
    	max_supply = pricesCryptoOutputBuilderv2.max_supply;
    	quotes = pricesCryptoOutputBuilderv2.quotes;
    	last_updated = pricesCryptoOutputBuilderv2.last_updated;
	}

	public Data() {

	}
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getWebsiteSlug() {
		return website_slug;
	}
	public void setWebsiteSlug(String website_slug) {
		this.website_slug = website_slug;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getCirculatingSupply() {
		return circulating_supply;
	}
	public void setCirculatingSupply(String circulating_supply) {
		this.circulating_supply = circulating_supply;
	}
	public String getTotalSupply() {
		return total_supply;
	}
	public void setTotalSupply(String total_supply) {
		this.total_supply = total_supply;
	}
	public String getMaxSupply() {
		return max_supply;
	}
	public void setMaxSupply(String max_supply) {
		this.max_supply = max_supply;
	}
	public Quotes getQuotes() {
		return quotes;
	}
	public void setQuotes(Quotes quotes) {
		this.quotes = quotes;
	}
	public String getLastUpdated() {
		return last_updated;
	}
	public void setLastUpdated(String last_updated) {
		this.last_updated = last_updated;
	}
}
