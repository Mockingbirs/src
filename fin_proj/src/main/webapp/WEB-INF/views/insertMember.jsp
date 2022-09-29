<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	<center>
		<h1>회원가입</h1>
		<a href="logout.do">Log-out</a>
		<hr>
		<form action="insertMember.do" method="post"
			>
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">아이디</td>
					<td align="left"><input type="text" name="m_id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">비밀번호</td>
					<td align="left"><input type="password" name="m_password" size="10" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">이름</td>
					<td align="left"><textarea name="m_name" cols="40" rows="10"></textarea></td>
				</tr>
				
					<tr>
					<td bgcolor="orange" width="70">이메일</td>
					<td align="left"><input type="text" name="m_email" /></td>
				</tr>
									<tr>
					<td bgcolor="orange" width="70">전화번호</td>
					<td align="left"><input type="text" name="m_tel" /></td>
				</tr>
									<tr>
					<td bgcolor="orange" width="70">주소</td>
					<td align="left"><input type="text" name="m_address" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value=" 회원가입 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="getMemberList.do">회원 목록 가기</a>
	</center>
</body>
</html>