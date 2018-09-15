package com.kandula.issuetracker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="COREOPERATIONS")
public class CoreOperationsEntity extends BaseEntity
{

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getCoreContainer() {
	return coreContainer;
    }

    public void setCoreContainer(String coreContainer) {
	this.coreContainer = coreContainer;
    }

    public String getMainframeOperation() {
	return mainframeOperation;
    }

    public void setMainframeOperation(String mainframeOperation) {
	this.mainframeOperation = mainframeOperation;
    }

    public String getUrl() {
	return url;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    @Column(name="NAME")
	private String name;

	@Column(name="CONTAINER")
	private String coreContainer;

	@Column(name="MAINFRAME")
	private String mainframeOperation;
	
	@Column(name="URL")
	private String url;
	

	
}
