package com.moglix.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moglix.catalog.dto.Catalog;

@Repository
public interface CatalogRepository extends JpaRepository<Catalog, String>{
	


}
