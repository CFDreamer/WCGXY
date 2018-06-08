package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BaseDao {
	private Configuration config = null;
	private SessionFactory sessionfactory = null;
	private Session session;
	private Transaction transaction;

	/*
	 * public BaseDao(Configuration config, SessionFactory sessionfactory,
	 * Session session, Transaction transaction) { super(); this.config =
	 * config; this.sessionfactory = sessionfactory; this.session = session;
	 * this.transaction = transaction; }
	 */

	public Configuration getConfig() {
		return config;
	}

	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}

	public Session getSession() {
		return session;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	/**
	 * 初始化方法，初始化注册对象，会话对象�?
	 */
	public void init() {
		// 初始化注册对�?
		this.config = new Configuration().configure();
		// 初始化会化工厂对�?
		this.sessionfactory = config.buildSessionFactory();
		// 初始化会话对�?
		this.session = sessionfactory.openSession();
	}

	public BaseDao() {
		System.out.println("BaseDao");

	}

	/**
	 * 提交事务，释放资�?
	 */

	public void destory() {

		this.session.close();

		this.sessionfactory.close();
	}

}
