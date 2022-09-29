package com.springproj.biz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springproj.biz.domain.BoardVO;

@Repository("memberDAO")
public class memberDAO { // DAO (Data Access Object)

	// CRUD (Create Read Update Delete) 기능의 메서드 구현
	

	private final String MEMBER_INSERT = "INSERT into board(seq, title, writer, content) values("
			+ "(select nvl(max(seq),0)+1 from board),?,?,?)";
	
	private final String MEMBER_UPDATE = "UPDATE board set title= ?, content = ? WHERE seq = ?";

	private final String MEMBER_DELETE = "DELETE FROM board  WHERE seq = ?";

	private final String MEMBER_GET = "SELECT * FROM board  WHERE seq = ?";

	private final String MEMBER_GETLIST = "SELECT * FROM board  ORDER BY seq DESC";


	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	


	// 글 등록(insert문)
	public void insertBoard(MemeberVO vo) {
		Object[] args = {vo.getTitle(), vo.getWriter(), vo.getContent()};
	
		
		jdbcTemplate.update(MEMBER_INSERT, args);
		
	
		
	}

	// 목록보기(select문)
	public BoardVO getBoard(int seq) {
		Object[] args = {seq};
		
		return jdbcTemplate.queryForObject(MEMBER_GET, args, new BoardRowMapper());
				
	}

	
	
	
	
	
	
	
	public List<BoardVO> getBoardList() {

		
		return jdbcTemplate.query(MEMBER_GETLIST, new BoardRowMapper());
		

	}

	// 글 수정(update문)
	public void updateBoard(BoardVO vo) {
		Object[] args = {vo.getTitle(), vo.getContent(), vo.getSeq()};
		jdbcTemplate.update(MEMBER_UPDATE, args);
		
		
		
	}

	// 글 삭제(delete문)
	public void deleteBoard(int seq) {
		
		jdbcTemplate.update(MEMBER_DELETE, seq);
		
	}
	
	class BoardRowMapper implements RowMapper<BoardVO>{

		@Override
		public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			
			BoardVO board = new BoardVO();
			board.setSeq(rs.getInt("seq"));
			board.setTitle(rs.getString("Title"));
			board.setWriter(rs.getString("Writer"));
			board.setContent(rs.getString("content"));
			board.setRegdate(rs.getDate("regdate"));
			board.setCnt(rs.getInt("cnt"));
			
			return board;
		}

	}



}
