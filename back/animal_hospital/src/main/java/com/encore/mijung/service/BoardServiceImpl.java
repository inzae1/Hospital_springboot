package com.encore.mijung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.encore.mijung.domain.Board;
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
	public List<Board> getAllBoard() throws Exception {
		return boardDAO.getAllBoard();
	}

	@Override
	public Board getBoard(int bdID) throws Exception {
		return boardDAO.getBoard(bdID);
	}

	@Override
	public List<Board> searchBoardByTitle(String title) throws Exception {
		return boardDAO.searchBoardByTitle(title);
	}

	@Override
	public List<Board> searchBoardByContent(String content) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.searchBoardByContent(content);
	}

}
