package com.encore.mijung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.mijung.domain.Board;
import com.encore.mijung.domain.Search;
import com.encore.mijung.repo.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public void addBoard(Board board) throws Exception {
		boardDAO.addBoard(board);
	}

	@Override
	public boolean updateBoard(Board board) throws Exception {
		return boardDAO.updateBoard(board);
	}

	@Override
	public boolean deleteBoard(int bdID) throws Exception {
		return boardDAO.deleteBoard(bdID);
	}

	@Override
	public void replyBoard(Board board) throws Exception {
		boardDAO.replyBoard(board); 
	}

	@Override
	public Board findView(int bdID) throws Exception {
		return boardDAO.findView(bdID);
	}

	@Override
	public List<Board> getAllBoard(int page) throws Exception {
		return boardDAO.getAllBoard(page);
	}

	@Override
	public Board getBoard(int bdID) throws Exception {
		return boardDAO.getBoard(bdID);
	}

	@Override
	public List<Board> searchBoardByTitle(Search search) throws Exception {
		return boardDAO.searchBoardByTitle(search);
	}

	@Override
	public List<Board> searchBoardByContent(Search search) throws Exception {
		return boardDAO.searchBoardByContent(search);
	}

	@Override
	public int countBoard() throws Exception {
		return boardDAO.countBoard();
	}

	@Override
	public int countBoardByTitle(String title) throws Exception {
		return boardDAO.countBoardByTitle(title);
	}

	@Override
	public int countBoardByContent(String content) throws Exception {
		return boardDAO.countBoardByContent(content);
	}

}
