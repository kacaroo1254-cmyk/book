<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<jsp:include page="../include/title.jsp" />
</head>
<body>
	
	<jsp:include page="../include/header.jsp" />
	
	<jsp:include page="../include/nav.jsp" />
	
	<section>
	
		<div class="section_wrap">
		
			<c:choose>
			
				<c:when test="${resultForSigninConfirm == 1}">
					<h2>로그인 성공</h2>
					<p>로그인에 성공했습니다.</p>
				</c:when>
				
				<c:otherwise>
					<h2>로그인 실패</h2>
					<p>아이디 또는 비밀번호가 일치하지 않습니다.</p>
				</c:otherwise>
			</c:choose>
			
			
		
		</div>
		
	</section>
	
	<jsp:include page="../include/footer.jsp" />

</body>
</html>