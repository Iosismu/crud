package kr.co.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import kr.co.vo.ReplyVO;

public class ReplyImple implements ReplyDAO{
	@Inject SqlSession sql;
	
	//댓글 조회
	public List<ReplyVO> readReply(int bno) throws Exception {
		return sql.selectList("replyMapper.readReply", bno);
	}
	
}
