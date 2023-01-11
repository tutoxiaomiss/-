package com.pms.dao;

import com.pms.entity.Staff;
import com.pms.entity.User;
import com.pms.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
//Dao层进行mysql数据库连接增删改查操作
public class UserDao {
	/**
	 * 用户登录方法
	 * @param adminName
	 * @param adminPwd
	 * @return
	 */
	public User login(String adminName, String adminPwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select u_username,u_password,u_state,u_admin from user where u_username=? and u_password=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, adminName);
			pstmt.setString(2, adminPwd);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				User user = new User();
				user.setAdminName(rs.getString("u_username"));
				user.setAdminPwd(rs.getString("u_password"));
				user.setState(rs.getString("u_state"));
				user.setU_admin (rs.getInt ("u_admin"));
				return user;
			}
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 添加用户方法
	 * @param adminName
	 * @param adminPwd
	 * @return
	 */
	public boolean insertUser(String adminName, String adminPwd) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into user(u_username,u_password,u_state) values (?,?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, adminName);
			pstmt.setString(2, adminPwd);
			pstmt.setString(3, "启用");
			int num = pstmt.executeUpdate();
			if (num > 0) {
				return true;

			}
			return false;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 查询所有用户
	 * @return
	 */
	public List<User> findAllAdmin() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<User> users = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select u_id,u_username,u_password,u_state from user";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("u_id"));
				user.setAdminName(rs.getString("u_username"));
				user.setAdminPwd(rs.getString("u_password"));
				user.setState(rs.getString("u_state"));
				users.add(user);

			}
			return users;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 禁用用户方法
	 * @param parseInt
	 */
	public void Disable(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "update user set u_state='禁用' where u_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, parseInt);
			int num = pstmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 启用用户方法
	 * @param parseInt
	 */
	public void Enable(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "update user set u_state='启用' where u_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, parseInt);
			int num = pstmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 添加员工方法


	 */
	public void insertStaff(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9, String a10) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into staff(e_name,e_sex,e_num,e_position,e_po,e_email,e_phone,e_address,e_mode,e_education)  values(?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, a1);
			pstmt.setString(2, a2);
			pstmt.setString(3, a3);
			pstmt.setString(4, a4);
			pstmt.setString(5, a5);
			pstmt.setString(6, a6);
			pstmt.setString(7, a7);
			pstmt.setString(8, a8);
			pstmt.setString(9, a9);
			pstmt.setString(10, a10);
			int num = pstmt.executeUpdate();


		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 查询所有员工方法
	 * @return
	 */
	public List<Staff> findAllStaff() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Staff> staffs = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select e_id,e_name,e_sex,e_num,e_position,e_po,e_email,e_phone,e_address,e_mode,e_education from staff";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Staff staff = new Staff();
				staff.setA1(rs.getInt("e_id"));
				staff.setA2(rs.getString("e_name"));
				staff.setA3(rs.getString("e_sex"));
				staff.setA4(rs.getString("e_num"));
				staff.setA5(rs.getString("e_position"));
				staff.setA6(rs.getString("e_po"));
				staff.setA7(rs.getString("e_email"));
				staff.setA8(rs.getString("e_phone"));
				staff.setA9(rs.getString("e_address"));
				staff.setA10(rs.getString("e_mode"));
				staff.setA11(rs.getString("e_education"));
				staffs.add(staff);


			}
			return staffs;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 通过id查询员工方法
	 * @param parseInt
	 * @return
	 */
	public Staff findOneStaff(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			String sql = "select e_id,e_name,e_sex,e_num,e_position,e_po,e_email,e_phone,e_address,e_mode,e_education from staff where e_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, parseInt);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				Staff staff = new Staff();
				staff.setA1(rs.getInt("e_id"));
				staff.setA2(rs.getString("e_name"));
				staff.setA3(rs.getString("e_sex"));
				staff.setA4(rs.getString("e_num"));
				staff.setA5(rs.getString("e_position"));
				staff.setA6(rs.getString("e_po"));
				staff.setA7(rs.getString("e_email"));
				staff.setA8(rs.getString("e_phone"));
				staff.setA9(rs.getString("e_address"));
				staff.setA10(rs.getString("e_mode"));
				staff.setA11(rs.getString("e_education"));

				return staff;


			}
			return null;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 修改员工方法
	 * @param parseInt

	 */
	public void update(int parseInt, String a2, String a3, String a4, String a5, String a6, String a7, String a8, String a9, String a10, String a11) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "update staff set e_name=?,e_sex=?,e_num=?,e_position=?,e_po=?,e_email=?,e_phone=?,e_address=?,e_mode=?,e_education=? where e_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,a2);
			pstmt.setString(2,a3);
			pstmt.setString(3,a4);
			pstmt.setString(4,a5);
			pstmt.setString(5,a6);
			pstmt.setString(6,a7);
			pstmt.setString(7,a8);
			pstmt.setString(8,a9);
			pstmt.setString(9,a10);
			pstmt.setString(10,a11);
			pstmt.setInt(11,parseInt);
			int num = pstmt.executeUpdate();

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 删除员工方法
	 * @param parseInt
	 */
	public void deleteStaff(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "delete from staff where e_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, parseInt);
			int num = pstmt.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 通过姓名查询员工方法
	 * @param title1
	 * @return
	 */
	public List<Staff> selectStaff(String title1) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Staff> staffs = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select e_id,e_name,e_sex,e_num,e_position,e_po,e_email,e_phone,e_address,e_mode,e_education from staff where e_name=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,title1);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Staff staff = new Staff();
				staff.setA1(rs.getInt("e_id"));
				staff.setA2(rs.getString("e_name"));
				staff.setA3(rs.getString("e_sex"));
				staff.setA4(rs.getString("e_num"));
				staff.setA5(rs.getString("e_position"));
				staff.setA6(rs.getString("e_po"));
				staff.setA7(rs.getString("e_email"));
				staff.setA8(rs.getString("e_phone"));
				staff.setA9(rs.getString("e_address"));
				staff.setA10(rs.getString("e_mode"));
				staff.setA11(rs.getString("e_education"));
				staffs.add(staff);

			}
			  return staffs;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}


}
