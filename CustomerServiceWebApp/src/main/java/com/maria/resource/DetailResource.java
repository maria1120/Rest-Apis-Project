package com.maria.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maria.entity.DetailList;
import com.maria.service.DetailService;

@RestController
public class DetailResource {
	
	@Autowired
	private DetailService service;
	
	
	@GetMapping(path = "/details/{cId}", produces= MediaType.APPLICATION_JSON_VALUE)
     public DetailList searchDetailByCustomerId(@PathVariable("cId") int customerId) {
		return new DetailList(service.searchDetailByCustomerId(customerId));
	}
}
