package com.house.entity;

import java.lang.Integer;
import java.util.HashSet;
import java.util.Set;

/**
 * HouseInfo entity. @author MyEclipse Persistence Tools
 */

public class HouseInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private Users usersByHouseUserOwnerId;
	private Estate estate;
	private City city;
	private Strusture strusture;
	private Province province;
	private Users usersByHouseUserRenterId;
	private String houseAddress;
	private String housePrice;
	private String housePicture;
	private Integer houseStatus;
	private Integer houseRent;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public HouseInfo() {
	}

	/** full constructor */
	public HouseInfo(Users usersByHouseUserOwnerId, Estate estate, City city,
			Strusture strusture, Province province,
			Users usersByHouseUserRenterId, String houseAddress,
			String housePrice, String housePicture, Integer houseStatus,
			Integer houseRent, Set orderses) {
		this.usersByHouseUserOwnerId = usersByHouseUserOwnerId;
		this.estate = estate;
		this.city = city;
		this.strusture = strusture;
		this.province = province;
		this.usersByHouseUserRenterId = usersByHouseUserRenterId;
		this.houseAddress = houseAddress;
		this.housePrice = housePrice;
		this.housePicture = housePicture;
		this.houseStatus = houseStatus;
		this.houseRent = houseRent;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsersByHouseUserOwnerId() {
		return this.usersByHouseUserOwnerId;
	}

	public void setUsersByHouseUserOwnerId(Users usersByHouseUserOwnerId) {
		this.usersByHouseUserOwnerId = usersByHouseUserOwnerId;
	}

	public Estate getEstate() {
		return this.estate;
	}

	public void setEstate(Estate estate) {
		this.estate = estate;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Strusture getStrusture() {
		return this.strusture;
	}

	public void setStrusture(Strusture strusture) {
		this.strusture = strusture;
	}

	public Province getProvince() {
		return this.province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public Users getUsersByHouseUserRenterId() {
		return this.usersByHouseUserRenterId;
	}

	public void setUsersByHouseUserRenterId(Users usersByHouseUserRenterId) {
		this.usersByHouseUserRenterId = usersByHouseUserRenterId;
	}

	public String getHouseAddress() {
		return this.houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getHousePrice() {
		return this.housePrice;
	}

	public void setHousePrice(String housePrice) {
		this.housePrice = housePrice;
	}

	public String getHousePicture() {
		return this.housePicture;
	}

	public void setHousePicture(String housePicture) {
		this.housePicture = housePicture;
	}

	public Integer getHouseStatus() {
		return this.houseStatus;
	}

	public void setHouseStatus(Integer houseStatus) {
		this.houseStatus = houseStatus;
	}

	public Integer getHouseRent() {
		return this.houseRent;
	}

	public void setHouseRent(Integer houseRent) {
		this.houseRent = houseRent;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}