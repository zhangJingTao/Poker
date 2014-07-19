<%@page import="org.apache.shiro.SecurityUtils"%>
<%@page import="poker.service.account.ShiroDbRealm.ShiroUser"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>登录页</title>
	<script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
	</script>
</head>

<body>
	<%	ShiroUser user = (ShiroUser) SecurityUtils.getSubject().getPrincipal(); 
		if(user!=null&&user.id!=null){%>
		<script type="text/javascript">
			window.location.href="logout";		
		</script>
	<%} %>
	<form id="loginForm" action="${ctx}/login" method="post" class="form-horizontal">
	<%
	String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
	if(error != null){
	%>
		<script type="text/javascript">
		$._messengerDefaults = {
				extraClasses: 'messenger-fixed messenger-theme-air messenger-on-top'
		}
		var msg;
		msg = $.globalMessenger().post({
		  message: "登陆失败请重试",
		  scrollTo: true
		});	
		</script>
	<%
	}
	%>
	<div class="Logincontainer">
		<div class="login">
			<div class="login-screen">
				<div class="login-icon">
					<img src="${ctx }/static/flatUI/images/icons/png/Watches.png" alt="Welcome to Poker" />
					<h4></h4>
				</div>

				<div class="login-form">
					<div class="form-group">
						<input type="text" class="form-control login-field" value=""
							placeholder="用户名" id="login-name" name="username"/> <label
							class="login-field-icon fui-user" for="login-name"></label>
					</div>

					<div class="form-group">
						<input type="password" class="form-control login-field" value=""
							placeholder="密码" id="login-pass" name="password"/> <label
							class="login-field-icon fui-lock" for="login-pass"></label>
					</div>
					<!-- <div class="form-group">
						<label class="checkbox" for="rememberMe"><input type="checkbox" id="rememberMe" name="rememberMe"/> 记住我</label>
					</div> -->
					<a class="btn btn-primary btn-lg btn-block" href="javascript:void(0)" onclick="submitLogin()">Login</a> <a
						class="login-link" href="#"></a>
				</div>
			</div>
		</div>
	</div>
	</form>
	<!-- /container -->
	<!-- Load JS here for greater good =============================-->
<script type="text/javascript">
function submitLogin(){
	$._messengerDefaults = {
			extraClasses: 'messenger-fixed messenger-theme-air messenger-on-top'
	}
	var message = "正在登陆";
	var flag = true;
	if($("#login-name").val()==''){
		message = "请填写用户名"
		flag = false;
	}
	if($("#login-pass").val()==''){
		message = "请填写密码"
		flag = false;
	}
	var msg;
	msg = $.globalMessenger().post({
	  message: message,
	  scrollTo: true
	});	
	
	if(flag){
		$("#loginForm").submit();
	}
}
</script>
</body>
</html>
