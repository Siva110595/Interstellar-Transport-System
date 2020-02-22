package com.comapany.restfulservices.resourcesmanagement.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.comapany.restfulservices.resourcesmanagement.model.Resource;

@Repository
@Transactional
public interface ResourceManagementDao extends CrudRepository<Resource,Long>{

	Resource save(Resource resource);

	List<Resource> findAll();

	Resource deleteById(long resourceId);

	List<Resource> findResourceByResourceNameStartingWith(String name);

	List<Resource> findResourceByResourceRole(String role);
	Resource findById(long resourceId);

}
