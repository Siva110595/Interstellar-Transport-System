package com.comapany.restfulservices.resourcesmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comapany.restfulservices.resourcesmanagement.dao.ResourceManagementDao;
import com.comapany.restfulservices.resourcesmanagement.model.Resource;
@Service
public class ResourceManagementServiceImpl implements ResourceManagementService{

	@Autowired
	ResourceManagementDao resourceManagementDao;

	@Override
	public Resource save(Resource resource) {
		return resourceManagementDao.save(resource);
	}

	@Override
	public List<Resource> findAll() {
		return resourceManagementDao.findAll();
	}

	@Override
	public Resource deleteById(long resourceId) {
		return resourceManagementDao.deleteById(resourceId);
	}

	@Override
	public List<Resource> findResourceByResourceNameStartingWith(String name) {
		return resourceManagementDao.findResourceByResourceNameStartingWith(name);
	}
	
	@Override
	public List<Resource> findResourceByResourceRole(String role) {
		return resourceManagementDao.findResourceByResourceRole(role);
	}

	@Override
	public Resource findById(long resourceId) {
		return resourceManagementDao.findById(resourceId);
	}

	
}
