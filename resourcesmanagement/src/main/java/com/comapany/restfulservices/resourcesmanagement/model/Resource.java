package com.comapany.restfulservices.resourcesmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="resource")
public class Resource {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="resourceId")
	private long resourceId;
	@Column(name="resourceName")
	private String resourceName;
	@Column(name="resourceRole")
	private String resourceRole;


	public long getResouceId() {
		return resourceId;
	}
	public void setResouceId(long resouceId) {
		this.resourceId = resouceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceRole() {
		return resourceRole;
	}
	public void setResourceRole(String resourceRole) {
		this.resourceRole = resourceRole;
	}


}
