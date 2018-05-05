package com.flyinquotes.flyinquotes.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface IPricesCoinMarketCapRest {
	
	@GetMapping(value="/{id}")
	public ResponseEntity<?> getPrices(@PathVariable String id);
	
	@GetMapping(value="/")
	public ResponseEntity<?> getAllPrices();
}
