package com.comin.syp.service;

import java.util.List;

import com.comin.syp.vo.GameVO;

public interface GameService {
	
	// Service : 트랜잭션 단위의 DAO, 여러 DAO를 호출해야하는 경우는 Service에 구현하는 것이 좋다.
	
	List<GameVO> gameList();
	// 게임 목록 정보조회
	int gameInsert(GameVO vo);
	// 게임 정보 등록
	GameVO gameInfo(int gseq);
	// 게임 정보 조회 
	void gameUpdate(GameVO vo);
	// 게임 정보 수정 
	int gameReset(int gseq);
	// 게임 정보 초기화 
	
	

}
