package com.maria.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maria.entity.Detail;

@Repository
public interface DetailDao extends JpaRepository<Detail, Integer> {

	public List<Detail> searchDetailByCustomerId(int customerId);
}
