package com.maria.service;

import java.util.List;

import com.maria.entity.CustomerServiceShareDetails;

public interface MainService {

	List<CustomerServiceShareDetails> getDetailsByCustomerId(int customerId);
	double getTotal( int quantity, double price);
}
