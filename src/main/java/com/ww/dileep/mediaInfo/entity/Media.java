package com.ww.dileep.mediaInfo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*
 * @Data
 * 
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */
public class Media {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mediaId;
	private String mediaUrl;
	private String altText;
	private int productId;
	
	public int getMediaId() {
		return mediaId;
	}
	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}
	public String getMediaUrl() {
		return mediaUrl;
	}
	public void setMediaUrl(String mediaUrl) {
		this.mediaUrl = mediaUrl;
	}
	public String getAltText() {
		return altText;
	}
	public void setAltText(String altText) {
		this.altText = altText;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	

}
