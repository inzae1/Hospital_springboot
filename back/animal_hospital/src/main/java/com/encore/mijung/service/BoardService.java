package com.encore.mijung.service;

import java.util.List;

import com.encore.mijung.domain.Board;
import com.encore.mijung.domain.Search;

public interface BoardService {
	public void addBoard(Board board) throws Exception;

	public boolean updateBoard(Board board) throws Exception;

	public boolean deleteBoard(int bdID) throws Exception;

	public void replyBoard(Board board) throws Exception;

	public Board findView(int bdID) throws Exception;

	public List<Board> getAllBoard(int page) throws Exception;

	public Board getBoard(int bdID) throws Exception;
	
	public List<Board> searchBoardByTitle (Search search) throws Exception;
	
	public List<Board> searchBoardByContent(Search search) throws Exception;
	
	public int countBoard() throws Exception;
	
	public int countBoardByTitle(String title) throws Exception;
	
	public int countBoardByContent(String content) throws Exception;
}
