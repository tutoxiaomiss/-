package com.pms.entity;

/**
 * 人事评价实体类 封装 bean层
 */
public class Pmss {
	private int id;
	private String name;
	private String j;
	private String c;
	private String k;
	private int did;

	public Pmss() {
	}

	public Pmss(int id, String name, String j, String c, String k, int did) {
		this.id = id;
		this.name = name;
		this.j = j;
		this.c = c;
		this.k = k;
		this.did = did;
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

	public String getJ() {
		return j;
	}

	public void setJ(String j) {
		this.j = j;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	@Override
	public String toString() {
		return "Pmss{" +
				"id=" + id +
				", name='" + name + '\'' +
				", j='" + j + '\'' +
				", c='" + c + '\'' +
				", k='" + k + '\'' +
				", did=" + did +
				'}';
	}
}
