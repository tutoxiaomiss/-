package com.pms.entity;

/**
 * 日志实体类 封装 bean层
 */
public class Logs  {
	private int id;
	private String name;
	private String logintime  ;

	public Logs() {
	}

	public Logs(int id, String name, String logintime) {
		this.id = id;
		this.name = name;
		this.logintime = logintime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}

	@Override
	public String toString() {
		return "Logs{" +
				"id=" + id +
				", name='" + name + '\'' +
				", logintime='" + logintime + '\'' +
				'}';
	}
}
