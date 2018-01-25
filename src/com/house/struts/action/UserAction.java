package com.house.struts.action;

import com.house.biz.UserBiz;
import com.house.entity.Users;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction extends BaseAction implements ModelDriven<Users> {
	Users user = new Users();
	UserBiz usersBiz;

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public UserBiz getUsersBiz() {
		return usersBiz;
	}

	public void setUsersBiz(UserBiz usersBiz) {
		this.usersBiz = usersBiz;
	}

	public String toLogin() {
		return "toLogin";
	}

	public String doLogin() {
		Users u = usersBiz.login(user.getUserName(), user.getUserPassword());
		if (u != null) {
			session.setAttribute("loginedUser", u);
			return "index";
		}
		return "toLogin";
	};

	public String logout() {
		session.invalidate();
		return "index";
	}

	public String toRegister() {
		return "toRegister";
	}

	public String doRegister() {
		usersBiz.register(user);
		return "toLogin";
	}

	@Override
	public Users getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
