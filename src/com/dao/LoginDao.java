package com.dao;

import org.hibernate.Session;

import com.entity.UserInfoEnity;



public class LoginDao extends BaseDao {
  private Session session;
  /**
   * 验证登陆
   * @param username
   * @return
   */
  public boolean testLogin(String username,String password){
	  super.init();
	  this.session=super.getSession();
	  UserInfoEnity user=(UserInfoEnity)session.get(UserInfoEnity.class, username);
	  if(null!=user&&password.equals(user.getPassword()))
		  return true;
	  
	  return false;
  }
}
