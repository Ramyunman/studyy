package kr.co.dao;

import kr.co.vo.BoardVO;
import java.util.List;

public interface BoardDAO {
	
	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception;

}
