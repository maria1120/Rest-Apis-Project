package com.maria.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerServiceShareDetails {

	private int customerId;
	private String shareName;
	private String shareType;
	private double marketPrice;
	private int quantity;
	private double total;
	
	

}
