package com.office.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.office.DatabaseInfo;

public class MemberDao {
	
	public boolean isMember(String mem_id) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = -1;
		
		
		try {
			
			Class.forName(DatabaseInfo.DRIVER);
			
			conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD);
			
			String sql = "select "
						+ "count(*) cnt "
						+ "from tbl_member "
						+ "where mem_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem_id);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				result = rs.getInt("cnt");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result > 0 ? true : false;
		
	}

	
	public MemberDto selectMemberByMemId(String mem_id, String mem_pw) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		MemberDto dto = null;
		
		try {
			
			Class.forName(DatabaseInfo.DRIVER);
			
			conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD);
			
			String sql = "select * from tbl_member where mem_id = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, mem_id);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String memid = rs.getString("mem_id");
				String mempw = rs.getString("mem_pw");
				
				dto = new MemberDto(memid, mempw);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
			
		return dto;
		
	}


	public int insertMember(MemberDto memberDto) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = -1;
		
		try {
			
			Class.forName(DatabaseInfo.DRIVER);
			
			conn = DriverManager.getConnection(DatabaseInfo.URL, DatabaseInfo.USER, DatabaseInfo.PASSWORD);
			
			String sql = "insert into "
					+ "tbl_member(mem_id, mem_pw, mem_mail, mem_phone) "
					+ "values(?, ?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, memberDto.getMem_id());
			pstmt.setString(2, memberDto.getMem_pw());
			pstmt.setString(3, memberDto.getMem_mail());
			pstmt.setString(4, memberDto.getMem_phone());
			
			result = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return result;
	}
	
	
}
