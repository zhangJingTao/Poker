<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>main Page</title>
	<jsp:include page="/static/include/login_include.jsp"></jsp:include>
</head>

<body>
	<div class="container-fluid">
	<div class="row-fluid">
		<div class="span1">
		</div>
		<div class="span11">
			<dl>
				<dt>
					所有的数据都在redis里
				</dt>
			</dl>
		</div>
	</div>
</div>
</body>
</html>
