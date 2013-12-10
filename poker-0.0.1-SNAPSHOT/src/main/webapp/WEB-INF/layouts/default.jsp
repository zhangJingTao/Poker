<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
<head>
<title>Poker<sitemesh:title/></title>
<meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
<meta http-equiv="Cache-Control" content="no-store" />
<meta http-equiv="Pragma" content="no-cache" />
<meta http-equiv="Expires" content="0" />
<jsp:include page="/static/include/login_include.jsp"></jsp:include>
<link type="image/x-icon" href="${ctx}/static/images/favicon.ico" rel="shortcut icon">
<link href="${ctx}/static/jquery-validation/1.10.0/validate.css" type="text/css" rel="stylesheet" />
<link href="${ctx}/static/styles/default.css" type="text/css" rel="stylesheet" />
<script src="${ctx}/static/jquery-validation/1.10.0/jquery.validate.min.js" type="text/javascript"></script>
<script src="${ctx}/static/jquery-validation/1.10.0/messages_bs_zh.js" type="text/javascript"></script>

<sitemesh:head/>
</head>
<shiro:user>
	    	<shiro:hasRole name="admin">
<script type="text/javascript">
	$(document).ready(function(){
		 var navigation = responsiveNav("#nav", { // Selector: The ID of the wrapper
			  animate: true, // Boolean: 是否启动CSS过渡效果（transitions）， true 或 false
			  transition: 400, // Integer: 过渡效果的执行速度，以毫秒（millisecond）为单位
			  label: "Menu", // String: Label for the navigation toggle
			  insert: "after", // String: Insert the toggle before or after the navigation
			  customToggle: "", // Selector: Specify the ID of a custom toggle
			  openPos: "relative", // String: Position of the opened nav, relative or static
			  jsClass: "js", // String: 'JS enabled' class which is added to <html> el
			  debug: false, // Boolean: Log debug messages to console, true 或 false
			  init: function(){}, // Function: Init callback
			  open: function(){}, // Function: Open callback
			  close: function(){} // Function: Close callback
			});
	})
</script>
 </shiro:hasRole>
		</shiro:user>
<body>
	<div class="container" style="width: 100%">
		<%@ include file="/WEB-INF/layouts/header.jsp"%>
		<div id="content">
			<sitemesh:body/>
		</div>
		<%@ include file="/WEB-INF/layouts/footer.jsp"%>
	</div>
</body>
</html>