package com.house.struts.action;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,
		ServletResponseAware, ServletContextAware {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected ServletContext context;
	protected HttpSession session;

	@Override
	public void setServletContext(ServletContext context) {
		// TODO Auto-generated method stub
		this.context = context;

	}

	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
		this.session = request.getSession();
	}

	protected void upload(File src, String fileName, String savePath) {
		File saveDir = new File(savePath);
		if (!saveDir.exists()) {
			saveDir.mkdirs();
		}

		try {
			FileUtils.copyFile(src, new File(saveDir, fileName));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected String genFileName(String fileName) {
		StringBuilder sb = new StringBuilder();
		Calendar c = Calendar.getInstance();
		sb.append(c.get(Calendar.YEAR));
		sb.append(c.get(Calendar.MONTH) + 1);
		sb.append(c.get(Calendar.DATE));
		sb.append(c.get(Calendar.HOUR));
		sb.append(c.get(Calendar.MINUTE));
		sb.append(c.get(Calendar.SECOND));
		sb.append(c.get(Calendar.MILLISECOND));

		sb.append(genRndNum());
		sb.append(fileName.substring(fileName.lastIndexOf(".")));
		return sb.toString();
	}

	protected String genRndNum() {
		StringBuilder sb = new StringBuilder();
		Random rnd = new Random();
		for (int i = 0; i < 5; i++) {
			sb.append(rnd.nextInt(10));
		}
		return sb.toString();
	}

}
