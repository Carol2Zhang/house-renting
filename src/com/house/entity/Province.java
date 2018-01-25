package com.house.entity;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;

/**
 * Province entity. @author MyEclipse Persistence Tools
 */

public class Province implements java.io.Serializable {

	// Fields

	private Integer id;
	private String provinceName;
	private String provinceLetter;
	private Set houseInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Province() {
	}

	/** full constructor */
	public Province(String provinceName, String provinceLetter, Set houseInfos) {
		this.provinceName = provinceName;
		this.provinceLetter = provinceLetter;
		this.houseInfos = houseInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceLetter() {
		return this.provinceLetter;
	}

	public void setProvinceLetter(String provinceLetter) {
		this.provinceLetter = provinceLetter;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

}