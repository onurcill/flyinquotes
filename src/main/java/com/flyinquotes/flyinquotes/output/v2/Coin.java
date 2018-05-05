package com.flyinquotes.flyinquotes.output.v2;

import java.io.Serializable;

import com.flyinquotes.flyinquotes.output.v2.builderv2.PricesCryptoOutputBuilderv2;

public class Coin implements Serializable{

	private static final long serialVersionUID = 1L;
	private Data data;
	private Metadata metadata;

	public Coin(PricesCryptoOutputBuilderv2 pricesCryptoOutputBuilderv2) {
		data = pricesCryptoOutputBuilderv2.data;
		metadata = pricesCryptoOutputBuilderv2.metadata;
	}

	public Coin() {

	}

	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
}
