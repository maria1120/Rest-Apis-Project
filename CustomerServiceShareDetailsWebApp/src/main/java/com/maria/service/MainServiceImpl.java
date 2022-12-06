package com.maria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maria.entity.CustomerServiceShareDetails;
import com.maria.entity.Details;
import com.maria.entity.DetailsList;
import com.maria.entity.Share;

@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public double getTotal(int quantity, double price) {
		double total = quantity*price;
		return total;
	}
	
	@Override
	public List<CustomerServiceShareDetails> getDetailsByCustomerId(int customerId) {
		List<CustomerServiceShareDetails> customerShareDetailsList = new ArrayList<>();
		
		DetailsList detailsList = restTemplate.getForObject("http://localhost:8084/details/"+customerId,DetailsList.class);
		
		for(Details details:detailsList.getDetailList()) {
			Share share = restTemplate.getForObject("http://localhost:8082/shares/"+ details.getShareId(),Share.class);
			 
			CustomerServiceShareDetails cssd= new CustomerServiceShareDetails(customerId,share.getShareName(),
					details.getShareType(),share.getMarketPrice(),details.getQuantity(), getTotal(details.getQuantity(),share.getMarketPrice()));
				customerShareDetailsList.add(cssd);	
		}
		
		
		return customerShareDetailsList;
	}

	

}
