<%@page import="com.springproj.biz.domain.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="message.board.list.mainTitle"/></title>
</head>
<body>

	<center>
		<h1><spring:message code="message.board.list.mainTitle"/></h1>
		<h3>
			${userName}<spring:message code="message.board.list.welcomeMsg"/><a href="logout.me">로그아웃</a>
		</h3>
		<!-- 검색 시작 -->
		<form action="getBoardList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
						<select name="searchCondition">
							<c:forEach items="${conditionMap}" var="option">
								<option value="${option.value}">${option.key}</option>
							</c:forEach>
						</select>
					<input type="text" name="searchKeyword">
					<input type="submit" value = "검색">
					</td>
				</tr>
			</table>

		</form>
		<!-- 검색 종료 -->

		<!-- 목록 출력 -->
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th bgcolor="orange" width="100"><spring:message code="message.board.list.table.head.seq"/></th>
				<th bgcolor="orange" width="200"><spring:message code="message.board.list.table.head.title"/></th>
				<th bgcolor="orange" width="150"><spring:message code="message.board.list.table.head.writer"/></th>
				<th bgcolor="orange" width="150"><spring:message code="message.board.list.table.head.regDate"/></th>
				<th bgcolor="orange" width="100"><spring:message code="message.board.list.table.head.cnt"/></th>
			</tr>

			<c:forEach items="${boardList}" var="board">
				<tr>
					<td align="center">${board.seq}</td>
					<td><a href="getBoard.do?seq=${board.seq}">${board.title}</a></td>
					<td align="center">${board.writer}</td>
					<td align="center">${board.regdate}</td>
					<td align="center">${board.cnt}</td>
				</tr>
			</c:forEach>
		</table>

		<br> <a href="insertBoard.do"><spring:message code="message.board.list.link.insertBoard"/></a>

	</center>







</body>
</html>