package com.maria.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maria.entity.Share;
import com.maria.persistence.ShareDao;

@Service
public class ShareServiceImpl implements ShareService {

	@Autowired
	private ShareDao dao;
	@Override
	public Share searchShareById(int id) {

		return dao.findById(id).orElse(null);
	}

}
