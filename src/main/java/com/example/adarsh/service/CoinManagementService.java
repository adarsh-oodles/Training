package com.example.adarsh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.adarsh.domain.CoinManagement;
import com.example.adarsh.domain.User;
import com.example.adarsh.repository.CoinManagementRepository;

@Service

public class CoinManagementService {
	
	@Autowired
	CoinManagementRepository coinManagementRepository;

	public CoinManagement saveCoin(CoinManagement coinManagement) {
		
		
		// TODO Auto-generated method stub
		return null;
	}

}
