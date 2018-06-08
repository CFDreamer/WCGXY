package com.dao;

import org.hibernate.Session;

import com.entity.UserInfoEnity;



public class RegisterDao extends BaseDao {
	private Session session;

	public RegisterDao() {
		System.out.println("RegisterDao");
	}

	// 注册用户信息
	public void Register(UserInfoEnity user) {
		super.init();
		// 保存用户对象
		this.session = super.getSession();// 初始化Session对象
		session.save(user);
		//提交事务
		session.beginTransaction().commit();
		super.destory();
	}

	// 判断用户是否被注�?
	public boolean isExist(String username) {
		super.init();
		this.session = super.getSession();// 初始化Session对象
		UserInfoEnity user = null;
		// 查询该记录是否存�?
		user = (UserInfoEnity) session.get(UserInfoEnity.class, username);
		System.out.println("isExist");
		session.beginTransaction().commit();
		super.destory();
		if (user == null) {
			return false;
		}
		return true;
	}
}
