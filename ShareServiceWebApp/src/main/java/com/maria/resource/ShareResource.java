package com.maria.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.maria.entity.Share;
import com.maria.service.ShareService;

@RestController
public class ShareResource {
	
	@Autowired
	private ShareService shareService;
	

	
	@GetMapping(path= "shares/{sId}", produces = MediaType.APPLICATION_JSON_VALUE)
	
	public Share searchShareById(@PathVariable("sId") int id) {
		
		return shareService.searchShareById(id);
	}
}
