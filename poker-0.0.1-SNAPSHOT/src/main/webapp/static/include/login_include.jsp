<%
	String path = request.getContextPath();
	String contentPath = request.getScheme() + "://"
	        + request.getServerName() + ":" + request.getServerPort()
	        + path;
	request.setAttribute("contentPath", contentPath);
%>

<script src="${contentPath }/static/flatUI/js/jquery-1.8.3.min.js"></script>
<script src="${contentPath }/static/flatUI/js/bootstrap.min.js"></script>
<script src="${contentPath }/static/flatUI/tip/js/messenger.min.js"></script>

<link href="${contentPath }/static/flatUI/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${contentPath }/static/flatUI/css/flat-ui.css" rel="stylesheet">
<link href="${contentPath }/static/flatUI/css/demo.css" rel="stylesheet">
<link href="${contentPath }/static/flatUI/tip/css/messenger.css" rel="stylesheet">
<link href="${contentPath }/static/flatUI/tip/css/messenger-theme-future.css" rel="stylesheet">

<!-- 响应式导航 -->
<link rel="stylesheet" href="${contentPath }/static/navigation/responsive-nav.css">
<script src="${contentPath }/static/navigation/responsive-nav.js"></script>


<link type="image/x-icon" href="${contentPath}/static/images/favicon.ico" rel="shortcut icon">
<link href="${contentPath}/static/jquery-validation/1.10.0/validate.css" type="text/css" rel="stylesheet" />
<link href="${contentPath}/static/styles/default.css" type="text/css" rel="stylesheet" />
<script src="${contentPath}/static/jquery-validation/1.10.0/jquery.validate.min.js" type="text/javascript"></script>
<script src="${contentPath}/static/jquery-validation/1.10.0/messages_bs_zh.js" type="text/javascript"></script>