package com.action;

import com.dao.RegisterDao;
import com.entity.UserInfoEnity;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements ModelDriven<UserInfoEnity> {
  private String registerErrorMessage="";
  private UserInfoEnity user=null;
  private RegisterDao register=null;
  public RegisterAction(){
	  //移除username用户信息对象
	  ActionContext.getContext().getSession().remove("username");
	  register=new RegisterDao();
	  System.out.println("构�?�方�?");
  }
	
  public String execute(){
	  System.out.println(user.getUsername());
	  System.out.println(user.getPassword());
	  //判断用户是否被注�?
	  if(register.isExist(user.getUsername()))
	  {
		  this.registerErrorMessage="该用户名已经存在";
		  //将错误信息存放在reuqest对象�?
		  ActionContext request=ActionContext.getContext();
		  request.put("registerErrorMessage", registerErrorMessage);
		  //保存注册信息
		  request.getSession().put("user", user);
			  return "exist";
	  }
	  else
	  {
		  //注册用户
		  register.Register(user);
	          return "success";
	  }
  }

public UserInfoEnity getModel() {
	System.out.println("ModelDriven");
	// TODO Auto-generated method stub
	user=new UserInfoEnity();
	return user;
}
}
