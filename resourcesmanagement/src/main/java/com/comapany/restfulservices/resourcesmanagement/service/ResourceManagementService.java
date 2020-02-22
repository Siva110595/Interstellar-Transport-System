package com.comapany.restfulservices.resourcesmanagement.service;

import java.util.List;
import java.util.Optional;

import com.comapany.restfulservices.resourcesmanagement.model.Resource;

public interface ResourceManagementService {

	Resource save(Resource resource);

	List<Resource> findAll();

	Resource deleteById(long resourceId);

	List<Resource> findResourceByResourceRole(String role);

	List<Resource> findResourceByResourceNameStartingWith(String name);


Resource findById(long resourceId);


}
