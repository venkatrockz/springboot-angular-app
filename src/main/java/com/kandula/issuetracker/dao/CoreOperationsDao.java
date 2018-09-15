package com.kandula.issuetracker.dao;

import com.kandula.issuetracker.entity.CoreOperationsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreOperationsDao extends JpaRepository<CoreOperationsEntity, Integer> {
	


}