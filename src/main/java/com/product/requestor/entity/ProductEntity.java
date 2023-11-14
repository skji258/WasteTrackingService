package com.product.requestor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {
	@Id
    private int rfid;
    private String productType;
    private String recyclable;
    private int percentage;

	public int getRfid() {
		return rfid;
	}
	public void setRfid(int rfid) {
		this.rfid = rfid;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getRecyclable() {
		return recyclable;
	}
	public void setRecyclable(String recyclable) {
		this.recyclable = recyclable;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

}
