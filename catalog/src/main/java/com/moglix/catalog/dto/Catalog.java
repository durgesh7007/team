package com.moglix.catalog.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //mapping orm
@Table(name="catalogTable")
public class Catalog implements Comparable<Catalog>{
	
	
	@Id
	
	@Column(name="catalog_id")
	private String product_ID;
	@Column
	private String product_Name;
	private String cat_ID;
	private String product_Description;
	private String product_Image;
	public String getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(String product_ID) {
		this.product_ID = product_ID;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getCat_ID() {
		return cat_ID;
	}
	public void setCat_ID(String cat_ID) {
		this.cat_ID = cat_ID;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}
	public String getProduct_Image() {
		return product_Image;
	}
	public void setProduct_Image(String product_Image) {
		this.product_Image = product_Image;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cat_ID == null) ? 0 : cat_ID.hashCode());
		result = prime * result + ((product_Description == null) ? 0 : product_Description.hashCode());
		result = prime * result + ((product_ID == null) ? 0 : product_ID.hashCode());
		result = prime * result + ((product_Image == null) ? 0 : product_Image.hashCode());
		result = prime * result + ((product_Name == null) ? 0 : product_Name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Catalog other = (Catalog) obj;
		if (cat_ID == null) {
			if (other.cat_ID != null)
				return false;
		} else if (!cat_ID.equals(other.cat_ID))
			return false;
		if (product_Description == null) {
			if (other.product_Description != null)
				return false;
		} else if (!product_Description.equals(other.product_Description))
			return false;
		if (product_ID == null) {
			if (other.product_ID != null)
				return false;
		} else if (!product_ID.equals(other.product_ID))
			return false;
		if (product_Image == null) {
			if (other.product_Image != null)
				return false;
		} else if (!product_Image.equals(other.product_Image))
			return false;
		if (product_Name == null) {
			if (other.product_Name != null)
				return false;
		} else if (!product_Name.equals(other.product_Name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Catalog arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}
