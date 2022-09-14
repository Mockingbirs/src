package com.springproj.biz.board.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproj.biz.board.BoardVO;
import com.springproj.biz.common.JDBCUtil;
import com.springproj.biz.common.LogAdvice;

@Repository("boardDAO")
public class BoardDAO { // DAO (Data Access Object)

	// CRUD (Create Read Update Delete) 기능의 메서드 구현
	private final String BOARD_INSERT = "INSERT into board(seq, title, writer, content) values("
			+ "(select nvl(max(seq),0)+1 from board),?,?,?)";

	private final String BOARD_UPDATE = "UPDATE board set title= ?, content = ? WHERE seq = ?";

	private final String BOARD_DELETE = "DELETE FROM board  WHERE seq = ?";

	private final String BOARD_GET = "SELECT * FROM board  WHERE seq = ?";

	private final String BOARD_GETLIST = "SELECT * FROM board  ORDER BY seq ASC";

	Connection conn;

	@Autowired
	private LogAdvice log;

	// 글 등록(insert문)
	public void insertBoard(BoardVO vo) {

		log.printLog(" = insertBoard =");

		conn = JDBCUtil.getConnection();

		// Connection conn;

		PreparedStatement pstmt = null;

		// 1. 연결
		/*
		 * try {
		 * 
		 * Class.forName("oracle.jdbc.driver.OracleDriver"); conn =
		 * DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott",
		 * "tiger"); } catch (ClassNotFoundException | SQLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); return; }
		 */

		// 2. jdbc를 이용해서 sql 처리.
		try {
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("===> 데이터 저장 성공");
			} else {
				System.out.println("===> 데이터 저장 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			JDBCUtil.close(pstmt, conn);

			/*
			 * if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } }
			 * 
			 * if(conn != null) { try { conn.close(); } catch (SQLException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); } }
			 */

		}

	}

	// 목록보기(select문)
	public BoardVO getBoard(int seq) {

		log.printLog(" = getBoard =");

		conn = JDBCUtil.getConnection();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 2. jdbc를 이용해서 sql 처리.
		try {
			pstmt = conn.prepareStatement(BOARD_GET);
			pstmt.setInt(1, seq);

			int result = pstmt.executeUpdate();

			rs = pstmt.executeQuery();
			
			if (rs.next()) {
			
			BoardVO board = new BoardVO();
			
			board.setSeq(rs.getInt("seq"));
			board.setTitle(rs.getString("title"));
			board.setWriter(rs.getString("writer"));
			board.setContent(rs.getString("content"));
			board.setRegdate(rs.getDate("regdate"));
			board.setCnt(rs.getInt("cnt"));
			
			
			return board;
			}
			
			/*
			 * if (rs.next()) { System.out.println("seq = " + rs.getInt(1) + ", title = " +
			 * rs.getString(2) + ", writer = " + rs.getString(3) + ", content = " +
			 * rs.getString(4) + ", regdate = " + rs.getDate(5) + ", cnt = " +
			 * rs.getInt(6));
			 * 
			 * }
			 */
			
			/*
			 * if (result == 1) { System.out.println("===> 데이터 정보 불러오기 성공");
			 * 
			 * } else { System.out.println("===> 데이터 정보 불러오기 실패"); }
			 */

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return null;

		} finally {

			JDBCUtil.close(pstmt, conn);
		}
		return null;
	}

	
	
	
	
	
	
	
	public void getBoardList() {

		log.printLog(" = getBoardList =");

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = JDBCUtil.getConnection();

		// 2. jdbc를 이용해서 sql 처리.
		try {
			pstmt = conn.prepareStatement(BOARD_GETLIST);

			int result = pstmt.executeUpdate();
			rs = pstmt.executeQuery();

			while (rs.next()) {

				System.out.println("seq = " + rs.getInt(1) + ", title = " + rs.getString(2) + ", writer = "
						+ rs.getString(3) + ", content = " + rs.getString(4) + ", regdate = " + rs.getDate(5)
						+ ", cnt = " + rs.getInt(6));

			}

			if (result >= 1) {
				System.out.println("===> 데이터 정보 불러오기 성공");
			} else {
				System.out.println("===> 데이터 정보 불러오기 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			JDBCUtil.close(pstmt, conn, rs);
		}

	}

	// 글 수정(update문)
	public void updateBoard(BoardVO vo) {

		log.printLog(" = updateBoard =");

		conn = JDBCUtil.getConnection();

		PreparedStatement pstmt = null;

		// 2. jdbc를 이용해서 sql 처리.
		try {
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getSeq());
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("===> 데이터 수정 성공");
			} else {
				System.out.println("===> 데이터 수정 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			JDBCUtil.close(pstmt, conn);
		}

	}

	// 글 삭제(delete문)
	public void deleteBoard(int seq) {

		conn = JDBCUtil.getConnection();

		PreparedStatement pstmt = null;

		// 2. jdbc를 이용해서 sql 처리.
		try {
			pstmt = conn.prepareStatement(BOARD_DELETE);

			pstmt.setInt(1, seq);

			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("===> 데이터 삭제 성공");
			} else {
				System.out.println("===> 데이터 삭제 실패");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			JDBCUtil.close(pstmt, conn);
		}

	}

}
