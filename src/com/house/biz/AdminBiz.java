package com.house.biz;

import com.house.entity.Admin;

public interface AdminBiz {
	public Admin login(String aName, String aPwd);

	public void addAdmin(Admin admin);

	public void delete(int id);

}
