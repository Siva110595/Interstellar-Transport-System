package com.comapany.restfulservices.resourcesmanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.comapany.restfulservices.resourcesmanagement.model.Resource;
import com.comapany.restfulservices.resourcesmanagement.service.ResourceManagementService;
@RestController
public class ResourceManagementController {

	@Autowired
	ResourceManagementService resourceManagementService;

	@RequestMapping(value="save",method=RequestMethod.POST)
	public Resource save(Resource resource) {
		return resourceManagementService.save(resource);
	}

	@RequestMapping(value="listresources",method=RequestMethod.GET)
	public List<Resource> listAllResources() {
		return resourceManagementService.findAll();
	}
	@RequestMapping(value="deleteresource",method=RequestMethod.DELETE)
	public Resource delete(@RequestParam("resourceId")long resourceId) {
		return resourceManagementService.deleteById(resourceId);
	}

	@RequestMapping(value="startwithname/{name}")
	public List<Resource> findByName(@PathVariable("name")String name) {
		return resourceManagementService.findResourceByResourceNameStartingWith(name);
	}

	@RequestMapping(value="findbyrole/{role}")
	public List<Resource> findByRole(@PathVariable("role")String role) {
		return resourceManagementService.findResourceByResourceRole(role);
	}
	
	@RequestMapping(value="update/{resourceId}",method=RequestMethod.PATCH)
	public Resource update(@PathVariable("resourceId")long resourceId,Resource resource) {
		Resource existingResource= resourceManagementService.findById(resourceId);
		existingResource.setResourceName(resource.getResourceName());
		existingResource.setResourceRole(resource.getResourceRole());
		return resourceManagementService.save(existingResource);
	}
}
