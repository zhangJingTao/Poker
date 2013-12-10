<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<div id="header">
	    <shiro:user>
	    	<shiro:hasRole name="admin">
	    	
	    	<div class="navbar navbar-inverse">
				<!-- navbar content -->
				<ul class="nav navbar-nav navbar-left">
                <li  class="active">
                  <a href="javascript:void(0)">
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
                      </ul> <!-- /Sub menu -->
                    </li>
                    <li><a href="#fakelink">Element Three</a></li>
                  </ul> <!-- /Sub menu -->
                </li>
                <li>
                  <a href="javascript:void(0)">
                    About Poker
                  </a>
                </li>
              </ul>
			</div>
		    </shiro:hasRole>
		</shiro:user>
</div>