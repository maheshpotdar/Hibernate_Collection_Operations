package com.mahesh.Userdetails.collection;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "countryName")
	private String countryName;

	@Column(name = "stateName")
	private String stateName;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String countryName, String stateName) {
		super();
		this.countryName = countryName;
		this.stateName = stateName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Address [countryName=" + countryName + ", stateName=" + stateName + "]";
	}

}
