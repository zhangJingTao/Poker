<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="header">
	    <shiro:user>
	    	<shiro:hasRole name="admin">
	    	
	    	<div class="navbar navbar-inverse">
				<ul class="nav navbar-nav navbar-left">
                <li  class="active">
                  <a href="main/target" target="mainFrame">
                    Main
                    <span class="navbar-unread">1</span>
                  </a>
                </li>
                <li>
                  <a href="javascript:void(0)">
                    Project
                    <span class="navbar-unread">1</span>
                  </a>
                  <ul>
                    <li><a href="javascript:void(0)">Element One</a></li>
                    <li>
                      <a href="javascript:void(0)">Sub menu</a>
                      <ul>
                        <li><a href="#fakelink">Element One</a></li>
                        <li><a href="#fakelink">Element Two</a></li>
                        <li><a href="#fakelink">Element Three</a></li>
                      </ul>
                    </li>
                    <li><a href="#fakelink">Element Three</a></li>
                  </ul>
                </li>
              </ul>
              
              
              
              
              <ul class="nav navbar-nav navbar-right">
              	<li>
                  <a href="javascript:void(0)">
                    admin
                    <span class="navbar-unread">1</span>
                  </a>
                  <ul>
                    <li><a href="http://www.baidu.com" target="content">修改个人信息</a></li>
                    <li><a href="" target="content">退出</a></li>
                  </ul>
                </li>
              </ul>
			</div>
		    </shiro:hasRole>
		</shiro:user>
</div>