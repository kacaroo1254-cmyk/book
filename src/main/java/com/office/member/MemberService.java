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
		
		if 	(selectedMemberDto != null && mem_pw.equals(selectedMemberDto.getMem_pw())) {
			System.out.println("[MemberService] signin_success"); 
			return mem_id;
			
		}
		System.out.println("[MemberService] signin_fail");
		return null;
		
		
	}


	public int signupConfirm(HttpServletRequest request, HttpServletResponse response) {
		
		String mem_id = request.getParameter("mem_id");
		String mem_pw = request.getParameter("mem_pw");
		String mem_mail = request.getParameter("mem_mail");
		String mem_phone = request.getParameter("mem_phone");
		
		boolean isMember = memberDao.isMember(mem_id);
		
		int result = 0;
		
		if (!isMember) {
			
			result = memberDao.insertMember(new MemberDto(mem_id, mem_pw, mem_mail, mem_phone));
			
			if (result > 0) {
				System.out.println("[MemberService] signup_success");
				
			} else {
				System.out.println("[MemberService] signup_fail");
				
			}
		
		}
		
		return result;
		
	}
	
	
	
	
	
}