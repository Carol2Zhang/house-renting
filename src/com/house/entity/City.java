package com.house.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * City entity. @author MyEclipse Persistence Tools
 */

public class City implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cityName;
	private String cityLetter;
	private Set houseInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public City() {
	}

	/** full constructor */
	public City(String cityName, String cityLetter, Set houseInfos) {
		this.cityName = cityName;
		this.cityLetter = cityLetter;
		this.houseInfos = houseInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityLetter() {
		return this.cityLetter;
	}

	public void setCityLetter(String cityLetter) {
		this.cityLetter = cityLetter;
	}

	public Set getHouseInfos() {
		return this.houseInfos;
	}

	public void setHouseInfos(Set houseInfos) {
		this.houseInfos = houseInfos;
	}

}