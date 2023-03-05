package com.spring.biz.board;

import java.util.List;

public interface BoardService {
	public boolean insertBoard(BoardVO bvo);

	public boolean updateBoard(BoardVO bvo);

	public boolean deleteBoard(BoardVO bvo);
	
	public List<BoardVO> selectAllMain(BoardVO bvo);
	
	public List<BoardVO> selectAllManage(BoardVO bvo);
	
	public List<BoardVO> selectAllMatch(BoardVO bvo);

	public BoardVO selectOne(BoardVO bvo);

}