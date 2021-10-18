package com.moglix.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moglix.catalog.dto.Catalog;
import com.moglix.catalog.service.CatalogService;

@RestController
@RequestMapping("/api")
public class CatalogController {
	
	@Autowired
	CatalogService catalogService;
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello from durgesh...!";
}
	@PostMapping("/add")
	public Catalog addCatalog(@RequestBody Catalog catalog) {
		return catalogService.addCatalog(catalog);
		//return employee;
	}
	
	@GetMapping("/catalog/{id}")
	public Catalog getEmployeeById(@PathVariable("id") String id) {
		
		return this.catalogService.getCatalogById(id);
		
	}
	
	@DeleteMapping("/catalog/{id}")
	public String deleteCatalogById(@PathVariable("id") String id) {
		return this.catalogService.deleteCatalogById(id);
	}
	@DeleteMapping("/catalogAll")
	public String deleteAll() {
		return this.catalogService.deleteAllCatalogs();
 }
	
	
}