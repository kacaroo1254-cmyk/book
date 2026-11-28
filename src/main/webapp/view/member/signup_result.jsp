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
			
				<c:when test="${signupResult > 0}">
					<h2>회원가입 성공</h2>
					<p>회원가입에 성공했습니다.</p>
				</c:when>
				
				<c:otherwise>
					<h2>회원가입 실패</h2>
					<p>회원가입에 실패 하였습니다.</p>
				</c:otherwise>
			</c:choose>
			
			
		
		</div>
		
	</section>
	
	<jsp:include page="../include/footer.jsp" />

</body>
</html>