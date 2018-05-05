//package com.flyinquotes.flyinquotes.output.v2;
//
//import java.io.Serializable;
//
//import com.flyinquotes.flyinquotes.output.v2.builderv2.PricesCryptoOutputBuilderv2;
//
//public class PricesCryptoOutputv2 implements Serializable {
//	
//	private static final long serialVersionUID = 1L;
//	
//	private String id;
//	private String name;
//	private String symbol;
//	private String website_slug;
//	private String rank;
//	private String circulating_supply;
//	private String total_supply;
//	private String max_supply;
//	private Quotes quotes;
//	private String last_updated;
//	public PricesCryptoOutputv2(PricesCryptoOutputBuilderv2 pricesCryptoOutputBuilderv2){
//		id = pricesCryptoOutputBuilderv2.id;
//		name = pricesCryptoOutputBuilderv2.name;
//		symbol = pricesCryptoOutputBuilderv2.symbol;
//		website_slug = pricesCryptoOutputBuilderv2.website_slug;
//		rank = pricesCryptoOutputBuilderv2.rank;
//		circulating_supply = pricesCryptoOutputBuilderv2.circulating_supply;	
//		total_supply = pricesCryptoOutputBuilderv2.total_supply;
//		max_supply = pricesCryptoOutputBuilderv2.max_supply;
//		last_updated = pricesCryptoOutputBuilderv2.last_updated;	
//		quotes = pricesCryptoOutputBuilderv2.quotes;
//	}
//	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getSymbol() {
//		return symbol;
//	}
//	public void setSymbol(String symbol) {
//		this.symbol = symbol;
//	}
//	public String getRank() {
//		return rank;
//	}
//	public void setRank(String rank) {
//		this.rank = rank;
//	}
//	public String getTotal_supply() {
//		return total_supply;
//	}
//	public void setTotal_supply(String total_supply) {
//		this.total_supply = total_supply;
//	}
//	public String getMax_supply() {
//		return max_supply;
//	}
//	public void setMax_supply(String max_supply) {
//		this.max_supply = max_supply;
//	}
//	public String getLast_updated() {
//		return last_updated;
//	}
//	public void setLast_updated(String last_updated) {
//		this.last_updated = last_updated;
//	}
//
//	public String getWebsite_slug() {
//		return website_slug;
//	}
//
//	public void setWebsite_slug(String website_slug) {
//		this.website_slug = website_slug;
//	}
//
//	public String getCirculating_supply() {
//		return circulating_supply;
//	}
//
//	public void setCirculating_supply(String circulating_supply) {
//		this.circulating_supply = circulating_supply;
//	}
//
//	public Quotes getQuotes() {
//		return quotes;
//	}
//
//	public void setQuotes(Quotes quotes) {
//		this.quotes = quotes;
//	}
//
//
//}
