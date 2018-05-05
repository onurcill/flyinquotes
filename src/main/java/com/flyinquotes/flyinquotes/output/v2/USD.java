package com.flyinquotes.flyinquotes.output.v2;

import java.io.Serializable;

import com.flyinquotes.flyinquotes.output.v2.builderv2.PricesCryptoOutputBuilderv2;

public class USD implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String price;
	private String volume_24h;
	private String market_cap;
	private String percent_change_1h;
	private String percent_change_24h;
	private String percent_change_7d;
	
	public USD(PricesCryptoOutputBuilderv2 pricesCryptoOutputBuilderv2) {
		price = pricesCryptoOutputBuilderv2.price;  
		volume_24h = pricesCryptoOutputBuilderv2.volume_24h;
		market_cap = pricesCryptoOutputBuilderv2.market_cap;
		percent_change_1h = pricesCryptoOutputBuilderv2.percent_change_1h;
		percent_change_24h = pricesCryptoOutputBuilderv2.percent_change_24h;
		percent_change_7d = pricesCryptoOutputBuilderv2.percent_change_7d;
	}

	public USD() {

	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getVolume_24h() {
		return volume_24h;
	}
	public void setVolume_24h(String volume_24h) {
		this.volume_24h = volume_24h;
	}
	public String getMarket_cap() {
		return market_cap;
	}
	public void setMarket_cap(String market_cap) {
		this.market_cap = market_cap;
	}
	public String getPercent_change_1h() {
		return percent_change_1h;
	}
	public void setPercent_change_1h(String percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
	}
	public String getPercent_change_24h() {
		return percent_change_24h;
	}
	public void setPercent_change_24h(String percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
	}
	public String getPercent_change_7d() {
		return percent_change_7d;
	}
	public void setPercent_change_7d(String percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
	}
}
