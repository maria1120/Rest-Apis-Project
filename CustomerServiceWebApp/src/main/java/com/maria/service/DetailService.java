package com.maria.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maria.entity.Detail;

@Service
public interface DetailService {

	
	List<Detail> searchDetailByCustomerId(int customerId);
	
}
