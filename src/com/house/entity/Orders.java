package com.house.entity;

import java.math.BigDecimal;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private String ordersNumber;
	private HouseInfo houseInfo;
	private Users users;
	private BigDecimal ordersStatus;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(String ordersNumber) {
		this.ordersNumber = ordersNumber;
	}

	/** full constructor */
	public Orders(String ordersNumber, HouseInfo houseInfo, Users users,
			BigDecimal ordersStatus) {
		this.ordersNumber = ordersNumber;
		this.houseInfo = houseInfo;
		this.users = users;
		this.ordersStatus = ordersStatus;
	}

	// Property accessors

	public String getOrdersNumber() {
		return this.ordersNumber;
	}

	public void setOrdersNumber(String ordersNumber) {
		this.ordersNumber = ordersNumber;
	}

	public HouseInfo getHouseInfo() {
		return this.houseInfo;
	}

	public void setHouseInfo(HouseInfo houseInfo) {
		this.houseInfo = houseInfo;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public BigDecimal getOrdersStatus() {
		return this.ordersStatus;
	}

	public void setOrdersStatus(BigDecimal ordersStatus) {
		this.ordersStatus = ordersStatus;
	}

}