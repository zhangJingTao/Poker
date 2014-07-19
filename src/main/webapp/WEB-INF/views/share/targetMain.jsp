<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="redis" uri="/user/redis" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>&nbsp;Main Page</title>
	<jsp:include page="/static/include/login_include.jsp"></jsp:include>
    <link rel="stylesheet" href="/<redis:getValue key="webapp" />/static/main/css/style.css" media="screen" type="text/css" />
</head>
<body>
<canvas id="text" width="500" height="100"></canvas>
<canvas id="stage" width="500" height="100"></canvas>
<form id="form">
    <input type="text" id="inputText" value="Poker" />
    <input type="submit" value="TRY IT" />
</form>
  <script src="/<redis:getValue key="webapp" />/static/main/js/EasePack.min.js"></script>
  <script src="/<redis:getValue key="webapp" />/static/main/js/TweenLite.min.js"></script>
  <script src="/<redis:getValue key="webapp" />/static/main/js/easeljs-0.7.1.min.js"></script>
  <script src="/<redis:getValue key="webapp" />/static/main/js/requestAnimationFrame.js"></script>
  <script src="/<redis:getValue key="webapp" />/static/main/js/index.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//$("#form").submit();
	});
</script>
</body>
</html>
