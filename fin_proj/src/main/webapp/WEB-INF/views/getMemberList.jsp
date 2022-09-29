<%@page import="com.spring.proj.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 목록</title>
</head>
<body>

	<center>
		<h1>글 목록</h1>
		<h3>
			${userName}님! 게시판에 오신걸 환영합니다.<a href="logout.me">로그아웃</a>
		</h3>
		<!-- 검색 시작 -->
		<form action="getMemberList.do" method="post">
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
				<th bgcolor="orange" width="100">회원번호</th>
				<th bgcolor="orange" width="200">아이디</th>
				<th bgcolor="orange" width="150">비밀번호</th>
				<th bgcolor="orange" width="100">이름</th>
				<th bgcolor="orange" width="100">이메일</th>
				<th bgcolor="orange" width="100">전화번호</th>
				<th bgcolor="orange" width="100">주소</th>
				<th bgcolor="orange" width="150">등록일</th>
				
			</tr>

			<c:forEach items="${memberList}" var="member">
				<tr>
					<td align="center">${member.m_no}</td>
					<td><a href="getMember.do?m_no=${member.m_no}">${member.m_id}</a></td>
					<td align="center">${member.m_password}</td>
					<td align="center">${member.m_name}</td>
					<td align="center">${member.m_email}</td>
					<td align="center">${member.m_tel}</td>
					<td align="center">${member.m_address}</td>
					<td align="center">${member.m_regdate}</td>
					
				</tr>
			</c:forEach>
		</table>

		<br> <a href="insertMember.do">글쓰기</a>

	</center>







</body>
</html>