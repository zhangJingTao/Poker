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
			<shiro:user>
			<iframe id="mainFrame" name="mainFrame" src="main/target" style="overflow:visible;"
						scrolling="yes" frameborder="no" width="100%" height="650"></iframe>
			</shiro:user>
			<sitemesh:body/>
		</div>
		<shiro:user>
		<%@ include file="/WEB-INF/layouts/footer.jsp"%>
		</shiro:user>
	</div>
</body>
</html>