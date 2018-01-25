package com.house.biz;

import java.util.List;

import com.house.entity.Users;

public interface UserBiz {
	public Users login(String uName, String uPwd);

	public void register(Users user);

	public void update(Users user);

	public Users getById(int uId);

	public boolean checkUsersName(String uName);

	public List<Users> getByKey(String key);
	
	public List<Users> getAll();

}
