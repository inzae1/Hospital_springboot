package com.encore.mijung.service;

import java.util.List;

import com.encore.mijung.domain.Board;

public interface BoardService {
	public void addBoard(Board board) throws Exception;

	public boolean updateBoard(Board board) throws Exception;

	public boolean deleteBoard(int bdID) throws Exception;

	public void replyBoard(Board board) throws Exception;

	public Board findView(int bdID) throws Exception;

	public List<Board> getAllBoard() throws Exception;

	public Board getBoard(int bdID) throws Exception;
	
	public List<Board> searchBoardByTitle (String title) throws Exception;
	
	public List<Board> searchBoardByContent(String content) throws Exception;
}
