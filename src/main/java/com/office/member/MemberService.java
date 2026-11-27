package com.office.member;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberService {
	
	final private MemberDao memberDao;
	
	
	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}


	public String signinConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		String mem_id = request.getParameter("mem_id");
		String mem_pw = request.getParameter("mem_pw");
		
		MemberDto selectedMemberDto = memberDao.selectMemberByMemId(mem_id, mem_pw);
		
		return 0;
	}
	
	
	
	
	
}
