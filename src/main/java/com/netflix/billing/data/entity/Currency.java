package com.netflix.billing.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CURRENCY")
public class Currency {
	@Id
	@Column(name="CURRENCY_ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="COUNTRY_ID")
	private long countryId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getCountryId() {
		return countryId;
	}
	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}
	
}
