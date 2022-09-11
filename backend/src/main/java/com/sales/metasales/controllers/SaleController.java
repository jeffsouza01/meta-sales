package com.sales.metasales.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.metasales.entities.Sale;
import com.sales.metasales.services.SaleService;

@RestController
@RequestMapping("/sales")
public class SaleController {
	
	@Autowired
	private SaleService saleService;
	
	
	@GetMapping()
	public List<Sale> findSales() {
		
		return saleService.findSales();
		
	}

}
