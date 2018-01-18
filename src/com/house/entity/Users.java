package com.house.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Users entity. @author MyEclipse Persistence Tools
 */

public class Users implements java.io.Serializable {

	// Fields

	private BigDecimal id;
	private String userName;
	private String userPassword;
	private String userPhone;
	private Set houseInfosForHouseUserOwnerId = new HashSet(0);
	private Set houseInfosForHouseUserRenterId = new HashSet(0);
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Users() {
	}

	/** full constructor */
	public Users(String userName, String userPassword, String userPhone,
			Set houseInfosForHouseUserOwnerId,
			Set houseInfosForHouseUserRenterId, Set orderses) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhone = userPhone;
		this.houseInfosForHouseUserOwnerId = houseInfosForHouseUserOwnerId;
		this.houseInfosForHouseUserRenterId = houseInfosForHouseUserRenterId;
		this.orderses = orderses;
	}

	// Property accessors

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Set getHouseInfosForHouseUserOwnerId() {
		return this.houseInfosForHouseUserOwnerId;
	}

	public void setHouseInfosForHouseUserOwnerId(
			Set houseInfosForHouseUserOwnerId) {
		this.houseInfosForHouseUserOwnerId = houseInfosForHouseUserOwnerId;
	}

	public Set getHouseInfosForHouseUserRenterId() {
		return this.houseInfosForHouseUserRenterId;
	}

	public void setHouseInfosForHouseUserRenterId(
			Set houseInfosForHouseUserRenterId) {
		this.houseInfosForHouseUserRenterId = houseInfosForHouseUserRenterId;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}