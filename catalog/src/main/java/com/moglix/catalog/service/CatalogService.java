package com.moglix.catalog.service;

import java.util.List;

import com.moglix.catalog.dto.Catalog;


public interface CatalogService {
	
	public Catalog addCatalog(Catalog catalog);
	public Catalog getCatalogById(String id);
	public List<Catalog> getCatalogs();
	public String deleteCatalogById(String id);
	public String deleteAllCatalogs();
	public Catalog updateCatalog(String product_id, Catalog catalog);

}
