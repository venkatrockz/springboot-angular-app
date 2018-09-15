package com.kandula.issuetracker.controller;

import java.util.List;

import com.kandula.issuetracker.entity.CoreOperationsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kandula.issuetracker.service.CoreOperationsService;

@RestController
@RequestMapping("/core-operations")
public class CoreOperationsController {
	
	@Autowired
	private CoreOperationsService coreOperationsService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public List<CoreOperationsEntity> getOperations() {
		return coreOperationsService.getOperations();
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
    public CoreOperationsEntity create(@RequestBody CoreOperationsEntity operation) {
        return coreOperationsService.add(operation);
    }
	
	@RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public CoreOperationsEntity update(@RequestBody CoreOperationsEntity operation) {
        return coreOperationsService.update(operation);
    }

	@RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable(value = "id") Integer operation) {
	    coreOperationsService.delete(operation);
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
    public CoreOperationsEntity getStory(@PathVariable(value = "id") Integer operation) {
        return coreOperationsService.getOperation(operation);
    }
	

}
