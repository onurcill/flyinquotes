package com.flyinquotes.flyinquotes.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.flyinquotes.flyinquotes.output.v1.PricesCryptoOutput;
import com.flyinquotes.flyinquotes.output.v2.Coin;

@Component
public class PricesRestClient {

	@Autowired
    private RestTemplate restTemplate;

	public ResponseEntity<PricesCryptoOutput[]> getCryptoInformation(String id) {
		System.out.println("API CoinMarketCap");
		return restTemplate.getForEntity("https://api.coinmarketcap.com/v1/ticker/"+id, PricesCryptoOutput[].class);
	}
	
	public ResponseEntity<Coin[]> getAllCryptoInformation() {
		return restTemplate.getForEntity("https://api.coinmarketcap.com/v2/ticker/", Coin[].class);	
	}
}
