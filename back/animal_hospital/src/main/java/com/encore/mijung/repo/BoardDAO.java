package com.encore.mijung.repo;

import java.util.List;

import com.encore.mijung.domain.Board;

public interface BoardDAO {
	public void addBoard(Board board) throws Exception;

	public void updateBoard(Board board) throws Exception;

	public void deleteBoard(int bdID) throws Exception;

	public void replyBoard(Board board) throws Exception;

	public Board findView(int bdID) throws Exception;

	public List<Board> getAllBoard() throws Exception;

	public Board getBoard(int bdID) throws Exception;
}
