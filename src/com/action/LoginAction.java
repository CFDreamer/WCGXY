package com.action;


import com.dao.LoginDao;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction {
	/**
	 * 属�?�驱动获取用户输入的用户名和密码
	 */
	private String username;// 用户�?
	private String password;//

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private LoginDao login;
	// 登陆错误信息
	private String loginErrorMessage;

	public LoginAction() {
		login = new LoginDao();
	}

	public String execute() {
		if(login.testLogin(this.getUsername(),this.getPassword()))
		{
			ActionContext.getContext().getSession().put("username", this.getUsername());
			return "success";
		}
		else
		{
			this.loginErrorMessage="用户名或者密码错误！";
			ActionContext.getContext().put("loginErrorMessage", loginErrorMessage);
			return "fail";
		}

	}
}
