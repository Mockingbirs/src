<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 상세</title>
</head>
<body>
	<center>
		<h1>글 상세</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="updateMember.do" method="post">
			<input name="m_no" type="hidden" value="${member.m_no}" />
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">아이디</td>
					<td align="left">
						<input name="m_id" type="text" value="${member.m_id}" />
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">전화번호</td>
					<td align="left">${member.m_tel}</td>
				</tr>
				<tr>
					<td bgcolor="orange">내용</td>
					<td align="left">
						<textarea name="m_password" cols="40" rows="10">${member.m_password}</textarea>
					</td>
				</tr>
				<tr>
					<td bgcolor="orange">등록일</td>
					<td align="left">${member.m_regdate}</td>
				</tr>
				<tr>
					<td bgcolor="orange">주소</td>
					<td align="left">${member.m_address}</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글 수정" />
					</td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="insertMember.do">글등록</a>&nbsp;&nbsp;&nbsp; 
		<a href="deleteMember.do?m_no=${ member.m_no}">글삭제</a>&nbsp;&nbsp;&nbsp;
		<a href="getMemberList.do">글목록</a>
	</center>
</body>
</html>
