package com.moglix.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.moglix.catalog.dto.Catalog;
import com.moglix.catalog.service.CatalogService;

@SpringBootApplication
public class CatalogApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(CatalogApplication.class, args);
		//CatalogService catalogService = applicationContext.getBean(CatalogService.class);
		
		//String result = catalogService
		//		.addCatalog(new Catalog("ab003","abhi","chi", "mukesh","durgesh"));
		//System.out.println(result);
		
		//Catalog result1 = catalogService.getCatalogById("ab003");
		//System.out.println(result1);
		
		
		//String result2 = catalogService.deleteCatalogById("ab001");
		//System.out.println(result2);
		
		//String result3 = catalogService.deleteAllCatalogs();
		//System.out.println(result3);
		
		
	}

}
