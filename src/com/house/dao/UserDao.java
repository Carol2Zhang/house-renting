package com.house.dao;

import java.util.List;

import com.house.entity.Users;

public interface UserDao {
	public void add(Users user);

	public void delete(int id);

	public void update(Users user);

	public Users getById(int id);

	public Users getByName(String name);

	public List<Users> getAll();

	public List<Users> getByKey(String key);
}
