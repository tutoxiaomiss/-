package com.pms.entity;

/**
 * 用户封装实体类 bean层
 */
public class User {
	private int id;
	private String adminName;
	private String adminPwd;
	private String state;
	private int u_admin;

	public User() {
	}

	public User(int id, String adminName, String adminPwd, String state, int u_admin) {
		this.id = id;
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.state = state;
		this.u_admin = u_admin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getU_admin() {
		return u_admin;
	}

	public void setU_admin(int u_admin) {
		this.u_admin = u_admin;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", adminName='" + adminName + '\'' +
				", adminPwd='" + adminPwd + '\'' +
				", state='" + state + '\'' +
				", u_admin=" + u_admin +
				'}';
	}
}
