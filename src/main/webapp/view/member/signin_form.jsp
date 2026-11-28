<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp" />
<jsp:include page="../include/member/member.jsp" />
</head>
<body>
	
	<jsp:include page="../include/header.jsp" />
	
	<jsp:include page="../include/nav.jsp" />
	
	<section>
	
		<div class="section_wrap">
		
			<h1>로그인</h1>
			
			<form 
			action="${pageContext.request.contextPath}/signin_confirm.mem" 
			method="post"
			name="signin_form">
				
				<input type="text" name="mem_id" placeholder="아이디를 입력하세요." />
				<br>
				<input type="password" name="mem_pw" placeholder="비밀번호를 입력하세요." />
				<br>
				<input type="button" value="로그인" onclick="signinForm()" />
				<input type="reset" value="초기화" />
				
			</form>
		
		</div>
		
	</section>
	
	<jsp:include page="../include/footer.jsp" />

</body>
</html>