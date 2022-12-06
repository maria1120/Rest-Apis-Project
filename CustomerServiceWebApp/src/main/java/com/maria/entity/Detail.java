package com.maria.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Detail {
	
	@Id
	private int detailId;
	private int customerId;
	private int shareId;
	private String shareType;
	private int quantity;

}
