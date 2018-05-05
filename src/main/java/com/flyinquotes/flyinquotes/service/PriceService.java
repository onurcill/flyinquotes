package com.flyinquotes.flyinquotes.service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.flyinquotes.flyinquotes.client.PricesRestClient;
import com.flyinquotes.flyinquotes.output.v1.EnableDisableAlertOutput;
import com.flyinquotes.flyinquotes.output.v1.PricesCryptoOutput;
import com.flyinquotes.flyinquotes.output.v2.Coin;
import com.flyinquotes.flyinquotes.repository.PriceRepository;

@Service
public class PriceService {
	@Autowired
	private PricesRestClient pricesRestClient;
	
	@Autowired
	private PriceRepository pricesRepository;
	
	public ResponseEntity<PricesCryptoOutput[]> getInformation(String id) {
		return pricesRestClient.getCryptoInformation(id);
	}
	
	public ResponseEntity<Coin[]> getAllCryptoInformation() {
		return pricesRestClient.getAllCryptoInformation();
		
	}
	public String enableDisableAlert(String id, double alertPrice, boolean enableDisable) {
		pricesRepository.enableDisableAlert(enableDisable);
		if(enableDisable)
			initMonitoringOfPrice(alertPrice, id);
		return new EnableDisableAlertOutput(enableDisable, new Date()).toString();
	}

	public String initMonitoringOfPrice(double alertPrice, String id) {
		System.out.println("===> Monitoring price <===");
		List<PricesCryptoOutput> info = Arrays.asList(pricesRestClient.getCryptoInformation(id).getBody());
		info.forEach(item->{
			if(Double.parseDouble(item.getPrice_usd()) > alertPrice) {
				alertUser(Double.parseDouble(item.getPrice_usd()), id);
			}
		});
		return info.toString();
	}

	private void alertUser(double alertPrice, String id) {
		System.out.println("New price of "+id+" is "+alertPrice);
		//SendMail.sendMail(alertPrice);
	}
}
