package com.comin.syp.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.comin.syp.vo.GameVO;



@Repository
public class GameDAO implements GameService {
	@Autowired private SqlSession sql;
	// DAO (Data Access Object) DB를 사용해 데이터를 조회하거나 조작하는 기능
	// 사용자는 자신이 필요한 Interface를 DAO에게 던지고, DAO는 이 인터페이스를 구현한 객체를 사용자에게 편리하게 사용할 수 있도록
	// 반환해준다.

	
	@Override
	public List<GameVO> gameList() {
		return sql.selectList("gameInfo.mapper.list");
	}

	@Override
	public int gameInsert(GameVO vo) {
		sql.insert("gameInfo.mapper.insert", vo);
		return vo.getGseq();
	}

	@Override
	public GameVO gameInfo(int gseq) {
		return sql.selectOne("gameInfo.mapper.info", gseq);
	}

	@Override
	public void gameUpdate(GameVO vo) {
		sql.update("gameInfo.mapper.update", vo);
	}

	@Override
	public int gameReset(int gseq) {
		sql.update("gameInfo.mapper.reset", gseq);
		return sql.update("player.mapper.reset", gseq);
	}


}
