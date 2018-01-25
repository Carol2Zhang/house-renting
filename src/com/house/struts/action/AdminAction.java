package com.house.struts.action;

import com.house.biz.AdminBiz;
import com.house.entity.Admin;
import com.opensymphony.xwork2.ModelDriven;

public class AdminAction extends BaseAction implements ModelDriven<Admin> {
	Admin admin = new Admin();
	AdminBiz adminBiz;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public AdminBiz getAdminBiz() {
		return adminBiz;
	}

	public void setAdminBiz(AdminBiz adminBiz) {
		this.adminBiz = adminBiz;
	}

	public String doLogin() {
		Admin a=adminBiz.login(admin.getAdminName(), admin.getAdminPassword());
		if(a!=null){
			session.setAttribute("loginedAdmin", a);
			return "index";
		}
			return "login";
	}
	public String logout(){
		session.invalidate();
		return "login";
	}

	
	@Override
	public Admin getModel() {
		// TODO Auto-generated method stub
		return admin;
	}

}
