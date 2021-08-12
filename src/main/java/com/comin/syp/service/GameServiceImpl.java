package com.comin.syp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.comin.syp.vo.GameVO;

public class GameServiceImpl implements GameService {
	// mybatis의 SqlSession 객체를 스프링에서 주입시킴

	@Autowired
	GameDAO dao;

	@Override
	public List<GameVO> gameList() {
		return dao.gameList();
	}

	@Override
	public int gameInsert(GameVO vo) {

		return dao.gameInsert(vo);
	}

	@Override
	public GameVO gameInfo(int gseq) {
		return dao.gameInfo(gseq);
	}

	@Override
	public void gameUpdate(GameVO vo) {
		dao.gameUpdate(vo);

	}

	@Override
	public int gameReset(int gseq) {
		return dao.gameReset(gseq);
	}

	public GameVO game_info(int gseq) {
		// TODO Auto-generated method stub
		return null;
	}

}
