package com.house.biz.impl;

import java.util.List;

import com.house.biz.UserBiz;
import com.house.dao.UserDao;
import com.house.entity.Users;

public class UserBizImpl implements UserBiz {
	UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public Users login(String uName, String uPwd) {
		// TODO Auto-generated method stub
		Users u=userDao.getByName(uName);
		if(u!=null){
			if(uPwd.equals(u.getUserPassword())){
				return u;
			}
		}
		return null;

	}

	@Override
	public void register(Users user) {
		// TODO Auto-generated method stub
		if (userDao.getByName(user.getUserName()) == null) {
			userDao.add(user);
		}

	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		userDao.update(user);
	}

	@Override
	public Users getById(int uId) {
		// TODO Auto-generated method stub
		return userDao.getById(uId);
	}

	@Override
	public boolean checkUsersName(String uName) {
		// TODO Auto-generated method stub
		if (userDao.getByName(uName) == null) {
			return true;
		}
		return false;

	}

	@Override
	public List<Users> getByKey(String key) {
		// TODO Auto-generated method stub
		return userDao.getByKey(key);
	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

}
