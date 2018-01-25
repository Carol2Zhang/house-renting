package com.house.entity;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;

/**
 * Strusture entity. @author MyEclipse Persistence Tools
 */

public class Strusture implements java.io.Serializable {

	// Fields

	private Integer id;
	private String structureName;
	private Set houseInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Strusture() {
	}

	/** full constructor */
	public Strusture(String structureName, Set houseInfos) {
		this.structureName = structureName;
		this.houseInfos = houseInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStructureName() {
		return this.structureName;
	}

	public void setStructureName(String structureName) {
		this.structureName = structureName;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

}