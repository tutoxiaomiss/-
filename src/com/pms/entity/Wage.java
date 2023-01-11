package com.pms.entity;

import java.sql.Date;

/**
 * 工资封装实体类 bean层
 */
public class Wage {
	private int id;
	private String position;
	private int  basic;
	private int attendance;
	private int welfare;
	private int sum;
	private String date;

	public Wage() {
	}

	public Wage(int id, String position, int basic, int attendance, int welfare, int sum, String date) {
		this.id = id;
		this.position = position;
		this.basic = basic;
		this.attendance = attendance;
		this.welfare = welfare;
		this.sum = sum;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getWelfare() {
		return welfare;
	}

	public void setWelfare(int welfare) {
		this.welfare = welfare;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
