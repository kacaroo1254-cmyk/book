package com.office.member;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


@WebServlet("*.mem")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberController() {
        super();
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length());
		
		MemberService memberService = null;
		
		String nextPage = null;
		
		switch(command) {
		case "/signin_form.mem":
			
			nextPage = generateView("/signin_form");
			
			break;
			
		case "/signin_confirm.mem":
			
			memberService = new MemberService(new MemberDao());
			String signinedId = memberService.signinConfirm(request, response);
			
			if (signinedId != null) {
				
				System.out.println("[MemberController] signin_success");
				
				HttpSession session = request.getSession();
				session.setAttribute("signinedId", signinedId);
				session.setMaxInactiveInterval(60*30);
				
			} 
			
			System.out.println("[MemberController] signin_fail");
			nextPage = generateView("/signin_result");	
			
			break;
		
		case "/signup_form.mem":
			
			nextPage = generateView("/signup_form");
			
			break;
		
		case "/signup_confirm.mem":
		
			memberService = new MemberService(new MemberDao());
			int signupResult = memberService.signupConfirm(request, response);
			
			if (signupResult > 0) {
				System.out.println("[MemberController] signup_success");
				
			} else {
				System.out.println("[MemberController] signup_fail");
				
			}
			
			request.setAttribute("signupResult", signupResult);
			
			nextPage = generateView("/signup_result");
			
			
			break;
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextPage);
		dispatcher.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doGet(request, response);
	}
	
	
	private String generateView(String viewName) {
		return "/view/member" + viewName + ".jsp";
	}

}