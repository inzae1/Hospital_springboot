package com.encore.mijung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.encore.mijung.domain.Board;
import com.encore.mijung.service.BoardService;

@RestController
@RequestMapping("mijung")
@CrossOrigin(origins= {"*"}, maxAge=6000)
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@PostMapping("addBoard")
	public ResponseEntity addBoard(@RequestBody Board board) throws Exception{
		service.addBoard(board);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("updateBoard")
	public ResponseEntity updateBoard(@RequestBody Board board) throws Exception{
		boolean result = service.updateBoard(board);
		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@DeleteMapping("deleteBoard/{bdID}")
	public ResponseEntity deleteBoard(@PathVariable int bdID) throws Exception{
		boolean result = service.deleteBoard(bdID);
		if(!result) return new ResponseEntity(HttpStatus.NO_CONTENT);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@PutMapping("replyBoard")
	public ResponseEntity replyBoard(@RequestBody Board board) throws Exception{
		service.replyBoard(board);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	@GetMapping("findView/{bdID}")
	public ResponseEntity findView(@PathVariable int bdID) throws Exception{
		Board board = service.findView(bdID);
		return new ResponseEntity(board.getBdView(),HttpStatus.OK);
	}

	@GetMapping("getAllBoard")
	public ResponseEntity<List<Board>> getAllBoard() throws Exception{
		List<Board> boards = service.getAllBoard();
		if(boards.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		else return new ResponseEntity(boards, HttpStatus.OK);
	}
	
	@GetMapping("getBoard/{bdID}")
	public ResponseEntity getBoard(@PathVariable int bdID) throws Exception{
		Board board = service.getBoard(bdID);
		if(board==null) return new ResponseEntity(HttpStatus.NO_CONTENT);
		else return new ResponseEntity(board,HttpStatus.OK);
	}
	
	@GetMapping("searchBoardByTitle/{title}")
	public ResponseEntity searchBoardByTitle(@PathVariable String title)throws Exception{
		List<Board> boards = service.searchBoardByTitle(title);
		if(boards.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		else return new ResponseEntity(boards, HttpStatus.OK);
	}
	
	@GetMapping("searchBoardByContent/{content}")
	public ResponseEntity searchBoardByContent(@PathVariable String content)throws Exception{
		List<Board> boards = service.searchBoardByContent(content);
		if(boards.isEmpty()) return new ResponseEntity(HttpStatus.NO_CONTENT);
		else return new ResponseEntity(boards, HttpStatus.OK);
	}

}