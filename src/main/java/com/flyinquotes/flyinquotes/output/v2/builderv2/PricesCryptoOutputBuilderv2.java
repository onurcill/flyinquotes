package com.flyinquotes.flyinquotes.output.v2.builderv2;

import com.flyinquotes.flyinquotes.output.v2.Coin;
import com.flyinquotes.flyinquotes.output.v2.Data;
import com.flyinquotes.flyinquotes.output.v2.Metadata;
import com.flyinquotes.flyinquotes.output.v2.Quotes;
import com.flyinquotes.flyinquotes.output.v2.USD;


public class PricesCryptoOutputBuilderv2 {
	
	public Data data;
	public Metadata metadata;
	public String id;
	public String name;
	public String symbol;
	public String website_slug;
	public String rank;
	public String circulating_supply;
	public String total_supply;
	public String max_supply;
	public Quotes quotes;
	public String last_updated;
	public String timestamp;
	public String error;
	public USD USD;
	public String price;
	public String volume_24h;
	public String market_cap;
	public String percent_change_1h;
	public String percent_change_24h;
	public String percent_change_7d;
	
	public PricesCryptoOutputBuilderv2 data(Data data) {
		this.data = data;
		return this;
	}	
	public PricesCryptoOutputBuilderv2 metadata(Metadata metadata) {
		this.metadata = metadata;
		return this;
	}
	public PricesCryptoOutputBuilderv2 id(String id) {
		this.id = id;
		return this;
	}
	public PricesCryptoOutputBuilderv2 name(String name) {
		this.name = name;
		return this;
	}
	public PricesCryptoOutputBuilderv2 symbol(String symbol) {
		this.symbol = symbol;
		return this;
	}
	public PricesCryptoOutputBuilderv2 website_slug(String website_slug) {
		this.website_slug = website_slug;
		return this;
	}
	public PricesCryptoOutputBuilderv2 rank(String rank) {
		this.rank = rank;
		return this;
	}
	public PricesCryptoOutputBuilderv2 circulating_supply(String circulating_supply) {
		this.circulating_supply = circulating_supply;
		return this;
	}
	public PricesCryptoOutputBuilderv2 total_supply(String total_supply) {
		this.total_supply = total_supply;
		return this;
	}
	public PricesCryptoOutputBuilderv2 max_supply(String max_supply) {
		this.max_supply = max_supply;
		return this;
	}
	public PricesCryptoOutputBuilderv2 quotes(Quotes quotes) {
		this.quotes = quotes;
		return this;
	}
	public PricesCryptoOutputBuilderv2 last_updated(String last_updated) {
		this.last_updated = last_updated;
		return this;
	}
	public PricesCryptoOutputBuilderv2 timestamp(String timestamp) {
		this.timestamp = timestamp;
		return this;
	}
	public PricesCryptoOutputBuilderv2 error(String error) {
		this.error = error;
		return this;
	}
	public PricesCryptoOutputBuilderv2 USD(USD USD) {
		this.USD = USD;
		return this;
	}
	public PricesCryptoOutputBuilderv2 price(String price) {
		this.price = price;
		return this;
	}
	public PricesCryptoOutputBuilderv2 volume_24h(String volume_24h) {
		this.volume_24h = volume_24h;
		return this;
	}
	public PricesCryptoOutputBuilderv2 market_cap(String market_cap) {
		this.market_cap = market_cap;
		return this;
	}
	public PricesCryptoOutputBuilderv2 percent_change_1h(String percent_change_1h) {
		this.percent_change_1h = percent_change_1h;
		return this;
	}
	public PricesCryptoOutputBuilderv2 percent_change_24h(String percent_change_24h) {
		this.percent_change_24h = percent_change_24h;
		return this;
	}
	public PricesCryptoOutputBuilderv2 percent_change_7d(String percent_change_7d) {
		this.percent_change_7d = percent_change_7d;
		return this;
	}
	public Coin build() {
		return new Coin(this);
	}
}
