package com.encore.mijung.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mijung.domain.Board;

@Repository
public class BoardDAOImpl implements BoardDAO{
	
	private final String NS = "BoardMapper.";
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public void addBoard(Board board) throws Exception {
		sqlSession.insert(NS + "addBoard", board);
	}

	@Override
	public void updateBoard(Board board) throws Exception {
		sqlSession.update(NS + "updateBoard", board);
	}

	@Override
	public void deleteBoard(int bdID) throws Exception {
		sqlSession.delete(NS + "deleteBoard", bdID);
	}

	@Override
	public void replyBoard(Board board) throws Exception {
		sqlSession.update(NS + "replyBoard", board);
	}

	@Override
	public Board findView(int bdID) throws Exception {
		return sqlSession.selectOne(NS + "findView", bdID);
	}

	@Override
	public List<Board> getAllBoard() throws Exception {
		return sqlSession.selectList(NS + "getAllBoard");
	}

	@Override
	public Board getBoard(int bdID) throws Exception {
		return sqlSession.selectOne(NS + "getBoard", bdID);
	}

}
