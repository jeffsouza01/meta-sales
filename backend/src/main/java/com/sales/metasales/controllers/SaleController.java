package com.sales.metasales.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.metasales.entities.Sale;
import com.sales.metasales.services.SaleService;
import com.sales.metasales.services.SmsService;

@RestController
@RequestMapping("/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@Autowired
	private SmsService smsService;

	@GetMapping()
	public Page<Sale> findSales(Pageable pageable) {

		return saleService.findSales(pageable);
	}
	
	@GetMapping("/date")
	public Page<Sale> findSalesByDate(
			@RequestParam(value = "minDate", defaultValue="") String minDate,
			@RequestParam(value = "maxDate", defaultValue="") String maxDate,
			Pageable pageable) {

		
		return saleService.findSalesByDate(minDate, maxDate, pageable);
	
	}

	@GetMapping("/notification/{id}")
	public void notifySMS(@PathVariable Long id) {
		smsService.sendSms(id);
		
	}
	
	
	
	@GetMapping("/notification")
	public void notifySMS() {
		smsService.sendSms();
		
	}
	
	

}
