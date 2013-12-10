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