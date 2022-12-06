package com.maria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maria.entity.Detail;
import com.maria.persistance.DetailDao;

@Service
public class DetailServiceImpl implements DetailService {

	@Autowired
	private DetailDao dao;
	
	@Override
	public List<Detail> searchDetailByCustomerId(int customerId) {
		return dao.searchDetailByCustomerId(customerId);
	}

}
