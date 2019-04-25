package com.mahesh.Userdetails.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userdetails")
public class Userdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "uid")
	private int userid;

	@Column(name = "unm", length = 25)
	private String username;

	@ElementCollection
	private Set<Address> setOfAddress = new HashSet<Address>();

	@ElementCollection
	private Map<Integer, String> mapsofAddress = new HashMap<Integer, String>();

	public Userdetails(int userid, String username, Set<Address> setOfAddress, Map<Integer, String> mapsofAddress) {
		super();
		this.userid = userid;
		this.username = username;
		this.setOfAddress = setOfAddress;
		this.mapsofAddress = mapsofAddress;
	}

	public Map<Integer, String> getMapsofAddress() {
		return mapsofAddress;
	}

	public void setMapsofAddress(Map<Integer, String> mapsofAddress) {
		this.mapsofAddress = mapsofAddress;
	}

	public Userdetails() {
		// TODO Auto-generated constructor stub
	}

	public Userdetails(int userid, String username, Set<Address> setOfAddress) {
		super();
		this.userid = userid;
		this.username = username;
		this.setOfAddress = setOfAddress;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Set<Address> getSetOfAddress() {
		return setOfAddress;
	}

	public void setSetOfAddress(Set<Address> setOfAddress) {
		this.setOfAddress = setOfAddress;
	}

	@Override
	public String toString() {
		return "Userdetails [userid=" + userid + ", username=" + username + ", setOfAddress=" + setOfAddress
				+ ", mapsofAddress=" + mapsofAddress + "]";
	}

}
