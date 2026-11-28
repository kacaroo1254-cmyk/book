<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript">

	const signinForm = () => {
		
		console.log("signinForm() 호출됨");
		
		let form = document.signin_form;
		
		if (form.mem_id.value == "") {
			alert("아이디를 입력하세요.");
			form.mem_id.focus();
			
		} else if (form.mem_pw.value == "") {
			alert("비밀번호를 입력하세요.");
			form.mem_pw.focus();
			
		} else {
			form.submit();
			
		}

	}
	
	
	const signupForm = () => {
		
		console.log("signupForm() 호출됨");
		
		let form = document.signup_form;
		
		if (form.mem_id.value == "") {
			alert("아이디를 입력하세요.");
			form.mem_id.focus();
			
		} else if (form.mem_pw.value == "") {
			alert("비밀번호를 입력하세요.");
			form.mem_pw.focus();
			
		} else if (form.mem_pw_again.value == "") {
			alert("확인용 비밀번호를 입력하세요.");
			form.mem_pw_again.focus();
			
		} else if (form.mem_mail.value == "") {
			alert("이메일을 입력하세요.");
			form.mem_mail.focus();
			
		} else if (form.mem_phone.value == "") {
			alert("전화번호를 입력하세요.");
			form.mem_phone.focus();
			
		} else {
			form.submit();
			
		}

	}

</script>






