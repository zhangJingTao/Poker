<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>&nbsp;Main Page</title>
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
				<dt>
					这只是一个随兴的演示框架，正如导航栏里所列，将会有这些功能以及更多。看起来很美好的样子，苦于思考却没时间去实现，只能一点一点的填坑。
				</dt>
				<dt>
					距离上次提交GitHub又有一个多月了。
				</dt>
				<dt>
					暂时不想罗列太多技术....以至于臃肿,并且还会耗费大量时间，全凭喜好
				</dt>
				<dt>
					唯一庆幸的是，这个项目从开始到现在没有偏离我最初的想法，so...我会继续写下去的。
				</dt>
			</dl>
		</div>
	</div>
</div>
</body>
</html>
