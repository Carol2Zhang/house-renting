package com.house.dao.impl;

import java.util.List;

import com.house.dao.AdminDao;
import com.house.entity.Admin;

public class AdminDaoImpl extends BaseHibDao implements AdminDao {

	@Override
	public void add(Admin admin) {
		// TODO Auto-generated method stub
		super.add(admin);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		super.delete(Admin.class, id);
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub
		super.update(admin);
	}

	@Override
	public Admin getByName(String aName) {
		// TODO Auto-generated method stub
		String hql = "from Admin a where a.adminName=:aName";
		map.put("aName", aName);
		List<Admin> list = super.search(hql, map);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;

	}

}
