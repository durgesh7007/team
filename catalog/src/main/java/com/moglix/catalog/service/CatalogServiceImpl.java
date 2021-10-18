package com.moglix.catalog.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moglix.catalog.dto.Catalog;
import com.moglix.catalog.repository.CatalogRepository;

//@Component
@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	CatalogRepository catalogDOA;
//	CatalogRepository catalogRepository= CatalogRepositoryImpl.getInstance();
//	
//	private  CatalogServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	private static CatalogService catalogService;
//	
//	public static CatalogService getInstance() {
//		if(catalogService==null) {
//			catalogService=new CatalogServiceImpl();
//			return catalogService;
//			}
//		else {
//			return catalogService;
//		}
//	}

	@Override
	public Catalog addCatalog(Catalog catalog) {
		Catalog catalog2= catalogDOA.save(catalog);
		if (catalog2!=null) {
			return catalog2;
		} 
		else {
			return null;
		}
	}

	@Override
	public Catalog getCatalogById(String id) {
		Optional<Catalog> optional = catalogDOA.findById(id);
		if (optional.isPresent()) {
			return optional.get();
			
		}
	return null;
	}

	@Override
	public List<Catalog> getCatalogs() {
		return catalogDOA.findAll();
	}

	@Override
	public String deleteCatalogById(String id) {
		try {
			catalogDOA.deleteById(id);
			return "success";
		} catch (Exception e) {
			
			e.printStackTrace();
			return "fails";
		}
	}

	@Override
	public String deleteAllCatalogs() {
		catalogDOA.deleteAll();
		return "success";
		
	}

	@Override
	public Catalog updateCatalog(String product_id, Catalog catalog) {
		if(getCatalogById(product_id)!=null)
			return addCatalog(catalog);
			else
				return null;
	}



}
