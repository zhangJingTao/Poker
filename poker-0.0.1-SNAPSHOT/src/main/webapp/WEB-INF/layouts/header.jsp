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
                    Web Data Transfer
                  </a>
                  <ul>
                    <li><a href="data/fastJson" target="mainFrame">Fast Json</a></li>
                    <li><a href="data/jackson" target="mainFrame">Jackson</a></li>
                  	<li><a href="data/jsonCompare" target="mainFrame">Performance Compare</a></li>
                  </ul>
                </li>
                
                <li>
                  <a href="javascript:void(0)">
                    Web View
                  </a>
                  <ul>
                    <li><a href="view/freemarker" target="mainFrame">FreeMarker</a></li>
                    <li><a href="view/velocity" target="mainFrame">Velocity</a></li>
                  </ul>
                </li>

                <li>
                  <a href="javascript:void(0)">
                    Cache
                  </a>
                  <ul>
                    <li><a href="cache/memcached" target="mainFrame">Memcached</a></li>
                    <li><a href="javascript:void(0)">Redis</a>
                      <ul>
                        <li><a href="cache/redis" target="mainFrame">Main</a></li>
                        <li><a href="cache/jredis" target="mainFrame">Jredis</a></li>
                        <li><a href="cache/jedis" target="mainFrame">jedis</a></li>
                     </ul>
                    </li>
                  </ul>
                </li>
                <li>
                  <a href="javascript:void(0)">
                    MVC
                  </a>
                  <ul>
                    <li><a href="mvc/django" target="mainFrame">Django</a></li>
                    <li><a href="mvc/SpringMVC" target="mainFrame">Spring MVC</a></li>
                  </ul>
                </li>
                <li>
                  <a href="javascript:void(0)">
                    SNS
                  </a>
                  <ul>
                    <li><a href="mvc/django" target="mainFrame">Oauth</a></li>
                    <li><a href="mvc/SpringMVC" target="mainFrame">... MVC</a></li>
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