package com.pms.dao;

import com.pms.entity.Logs;
import com.pms.entity.Pmss;
import com.pms.entity.Wage;
import com.pms.utils.JdbcUtil;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class WageDao {
	/**
	 * 添加工资方法
	 * @param id
	 * @param g2
	 * @param q2
	 * @param q3
	 * @param q4
	 * @param q5
	 * @param dated
	 */
	public void insertWage(int id, String g2, int q2, int q3, int q4, int q5, String dated) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into wages(w_id,w_position,w_basic,w_attendance,w_welfare,w_sum,w_date) values(?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			pstmt.setString(2,g2);
			pstmt.setInt(3,q2);
			pstmt.setInt(4,q3);
			pstmt.setInt(5,q4);
			pstmt.setInt(6,q5);
			pstmt.setString(7,dated);
			int num = pstmt.executeUpdate();

		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.release(rs, pstmt, conn);
		}
	}

	/**
	 * 查询所有工资方法
	 * @return
	 */
	public List<Wage> findAllWages() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Wage> wages = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select w_id,w_position,w_basic,w_attendance,w_welfare,w_sum,w_date from wages";
			pstmt = conn.prepareStatement(sql);
			rs  = pstmt.executeQuery();
			while(rs.next()){
				Wage wage = new Wage();
				wage.setId(rs.getInt("w_id"));
				wage.setPosition(rs.getString("w_position"));
				wage.setBasic(rs.getInt("w_basic"));
				wage.setAttendance(rs.getInt("w_attendance"));
				wage.setWelfare(rs.getInt("w_welfare"));
				wage.setSum(rs.getInt("w_sum"));
				wage.setDate(rs.getString("w_date"));
				wages.add(wage);
			}
			return wages;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 通过id查询工资方法
	 * @param parseInt
	 * @return
	 */
	public Wage findOneWage(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select w_id,w_position,w_basic,w_attendance,w_welfare from wages where w_id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,parseInt);
			rs = pstmt.executeQuery();
			if(rs.next()){
				Wage wage = new Wage();
				wage.setId(rs.getInt("w_id"));
				wage.setPosition(rs.getString("w_position"));
				wage.setBasic(rs.getInt("w_basic"));
				wage.setAttendance(rs.getInt("w_attendance"));
				wage.setWelfare(rs.getInt("w_welfare"));
				return wage;
			}
			return null;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 修改工资方法
	 * @param id
	 * @param g2
	 * @param g3
	 * @param g4
	 * @param g5
	 * @param g6
	 */
	public void updateWage(int id, String g2, int g3, int g4, int g5, int g6) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "update wages set w_position=?,w_basic=?,w_attendance=?,w_welfare=?,w_sum=? where w_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,g2);
			pstmt.setInt(2,g3);
			pstmt.setInt(3,g4);
			pstmt.setInt(4,g5);
			pstmt.setInt(5,g6);
			pstmt.setInt(6,id);
			int num = pstmt.executeUpdate();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 通过员工编号查询工资方法
	 * @param parseInt
	 * @return
	 */
	public List<Wage> selectWages(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Wage> wages = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select w_id,w_position,w_basic,w_attendance,w_welfare from wages where w_id=? ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,parseInt);
			rs = pstmt.executeQuery();
			while (rs.next()){
				Wage wage = new Wage();
				wage.setId(rs.getInt("w_id"));
				wage.setPosition(rs.getString("w_position"));
				wage.setBasic(rs.getInt("w_basic"));
				wage.setAttendance(rs.getInt("w_attendance"));
				wage.setWelfare(rs.getInt("w_welfare"));
				wages.add(wage);
			}
			return wages;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 删除id方法
	 * @param parseInt
	 */
	public void deleteWage(int parseInt) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "delete from wages where w_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,parseInt);
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 查询所有人事评价方法
	 * @return
	 */
	public List<Pmss> findAllPmss() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Pmss> pmsses = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select p_id,p_name,p_j,p_c,p_k,p_did from pmss";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Pmss pmss = new Pmss();
				pmss.setId(rs.getInt("p_id"));
				pmss.setName(rs.getString("p_name"));
				pmss.setJ(rs.getString("p_j"));
				pmss.setC(rs.getString("p_c"));
				pmss.setK(rs.getString("p_k"));
				pmss.setDid (rs.getInt ("p_did"));
				pmsses.add(pmss);
			}
			return pmsses;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 添加人事评价方法
	 * @param a1
	 * @param a2
	 * @param a3
	 * @param a4
	 * @param a5
	 */
	public void isertPmss(int a1, String a2, String a3, String a4, String a5) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into pmss(p_id,p_name,p_j,p_c,p_k) values (?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,a1);
			pstmt.setString(2,a2);
			pstmt.setString(3,a3);
			pstmt.setString(4,a4);
			pstmt.setString(5,a5);
			pstmt.executeUpdate();
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 查询所有日志方法
	 * @return
	 */
	public List<Logs> findAllLogs() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Logs> logs = new ArrayList<>();
		try {
			conn = JdbcUtil.getConnection();
			String sql = "select l_id,l_name,l_logintime from `logs`";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				Logs log = new Logs();
				log.setId (rs.getInt ("l_id"));
				log.setName(rs.getString("l_name"));
				log.setLogintime(rs.getString("l_logintime"));
				logs.add(log);
			}
			return logs;
		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 添加日志方法
	 * @param adminName
	 * @param dated
	 */
	public void insertLogs(String adminName, String dated) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			String sql = "insert into logs(l_name,l_logintime) values (?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,adminName);
			pstmt.setString(2,dated);
			int num = pstmt.executeUpdate();

		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}
	/**
	 * 删除日志方法
	 */
	public void deleteLogs(int id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			String sql = "delete from logs where l_id=?";
			pstmt = conn.prepareStatement (sql);
			pstmt.setInt (1, id);
			int num = pstmt.executeUpdate ();


		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}

	/**
	 * 删除人事评价
	 * @param id
	 */
	public void deletePmss(int id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = JdbcUtil.getConnection();
			String sql = "delete from pmss where p_did=?";
			pstmt = conn.prepareStatement (sql);
			pstmt.setInt (1,id);
			int num = pstmt.executeUpdate ();



		}catch(Exception e) {
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.release(rs,pstmt,conn);
		}
	}
}
