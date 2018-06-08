package com.action;

import com.opensymphony.xwork2.ActionContext;

/**
 * �?出的action
 * @author Administrator
 *
 */
public class LoginOutAction {
  public String execute(){
	  //清除所有有用户信息?
	  ActionContext.getContext().getSession().clear();
	  return "success";
  }
}
