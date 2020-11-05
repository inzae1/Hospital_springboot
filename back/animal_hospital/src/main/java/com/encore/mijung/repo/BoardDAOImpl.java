package com.encore.mijung.repo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.encore.mijung.domain.Board;
import com.encore.mijung.domain.Search;

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
	public boolean updateBoard(Board board) throws Exception {
		int result = sqlSession.update(NS + "updateBoard", board);
		if(result>0) return true;
		return false;
	}

	@Override
	public boolean deleteBoard(int bdID) throws Exception {
		int result = sqlSession.delete(NS + "deleteBoard", bdID);
		if(result>0) return true;
		return false;
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
	public List<Board> getAllBoard(int page) throws Exception {
		return sqlSession.selectList(NS + "getAllBoard", page);
	}

	@Override
	public Board getBoard(int bdID) throws Exception {
		return sqlSession.selectOne(NS + "getBoard", bdID);
	}

	@Override
	public List<Board> searchBoardByTitle(Search search) throws Exception {
		return sqlSession.selectList(NS + "searchBoardByTitle", search);
	}

	@Override
	public List<Board> searchBoardByContent(Search search) throws Exception {
		return sqlSession.selectList(NS + "searchBoardByContent", search);
	}

	@Override
	public int countBoard() throws Exception {
		return sqlSession.selectOne(NS + "countBoard");
	}

	@Override
	public int countBoardByTitle(String title) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NS + "countBoardByTitle", title);
	}

	@Override
	public int countBoardByContent(String content) throws Exception {
		return sqlSession.selectOne(NS + "countBoardByContent", content);
	}

}
