<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
pageContext.setAttribute("result","hello");
%>
<body>
	<h3>[MVC Model 1] <%=request.getAttribute("result") %>입니다. </h3>
	${requestScope.result}<br >

	${names[0]}<br >
	${names[1]}<br >

	${notice.id}<br >
	${notice.title}<br >
	
	${result}<br >
	
	${param.n}<br>
	${header.host}<br>
	${header["host"]}<br>
	${header.accept}<br>
	
	${pageContext.request.method}<br >

	${param.n}<br >
	${param.n > 3}<br >	
	${param.n ge 3}<br >
	
	${empty param.n?'값이 비어 있습니다.':param.n}<br >
	${param.n/2}<br >	

</body>
</html>