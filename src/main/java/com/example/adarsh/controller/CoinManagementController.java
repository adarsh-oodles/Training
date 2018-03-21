package com.example.adarsh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.adarsh.domain.CoinManagement;
import com.example.adarsh.service.CoinManagementService;

@RestController
public class CoinManagementController {
	
	@Autowired
	private CoinManagementService coinManagementService;
	

	@RequestMapping(value = "/saveCoin", method = RequestMethod.POST)
	public CoinManagement saveCoin(@RequestBody CoinManagement coinManagement) {
		return coinManagementService.saveCoin(coinManagement);

	}

}
