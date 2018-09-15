package com.kandula.issuetracker.service;

import java.util.List;

import com.kandula.issuetracker.entity.CoreOperationsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kandula.issuetracker.dao.CoreOperationsDao;

@Service
public class CoreOperationsService {
	
	@Autowired
	private CoreOperationsDao coreOperationsDao;
	
	public List<CoreOperationsEntity> getOperations(){
		return coreOperationsDao.findAll();
	}
	
	public CoreOperationsEntity getById(Integer id) {
		return coreOperationsDao.findOne(id);
	}

	public CoreOperationsEntity add(CoreOperationsEntity operation) {
		return coreOperationsDao.save(operation);
	}

	public CoreOperationsEntity update(CoreOperationsEntity operation) {
		return coreOperationsDao.save(operation);
	}

	public void delete(Integer operationId) {
		coreOperationsDao.delete(operationId);
	}
	
	public CoreOperationsEntity getOperation(Integer operationId) {
		return coreOperationsDao.findOne(operationId);
	}
	
}
