package com.spring.biz.board;

public class CommentDAO {
	//매칭 댓글 INSERT,UPDATE,DELETE,SELECTALL
	private final String SQL_INSERT="INSERT INTO COMMENT (MNUM, CCONTENT, CWDATE) VALUES(?, ?, SYSDATE())";
	//INSERT 한거 보여주는 SELECTALL
	private final String SQL_I_SELECTALL="SELECT CCONTENT, CWDATE, MNAME FROM COMMENT C LEFT JOIN `member` M ON C.MNUM = M.MNUM WHERE CNUM=?";
	private final String SQL_UPDATE="UPDATE COMMENT SET CCONTENT=?, CCDATE=SYSDATE()  WHERE CNUM=?";
	private final String SQL_DELETE="DELETE FROM COMMENT WHERE CNUM=?";
	//전체 댓글 출력
	private final String SQL_SELECTALL="SELECT CCONTENT, CWDATE, MNAME FROM COMMENT C LEFT JOIN `member` M ON C.MNUM = M.MNUM ORDER BY CWDATE ASC";
}