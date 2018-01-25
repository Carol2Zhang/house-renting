package com.house.dao.impl;

import java.util.List;

import com.house.dao.UserDao;
import com.house.entity.Users;

public class UserDaoImpl extends BaseHibDao implements UserDao {

	@Override
	public void add(Users user) {
		// TODO Auto-generated method stub
		super.add(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		super.delete(Users.class, id);
	}

	@Override
	public void update(Users user) {
		// TODO Auto-generated method stub
		super.update(user);
	}

	@Override
	public Users getById(int id) {
		// TODO Auto-generated method stub
		return (Users) super.get(Users.class, id);
	}

	@Override
	public Users getByName(String name) {
		// TODO Auto-generated method stub
		String hql = "from Users u where u.userName=:name";
		map.put("name", name);
		List<Users> list = super.search(hql, map);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

	@Override
	public List<Users> getAll() {
		// TODO Auto-generated method stub
		return super.search("from Users", map);
	}

	@Override
	public List<Users> getByKey(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
