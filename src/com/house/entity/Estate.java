package com.house.entity;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;

/**
 * Estate entity. @author MyEclipse Persistence Tools
 */

public class Estate implements java.io.Serializable {

	// Fields

	private Integer id;
	private String estateName;
	private Set houseInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Estate() {
	}

	/** full constructor */
	public Estate(String estateName, Set houseInfos) {
		this.estateName = estateName;
		this.houseInfos = houseInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstateName() {
		return this.estateName;
	}

	public void setEstateName(String estateName) {
		this.estateName = estateName;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

}