package com.comin.syp.calculator;

import com.comin.syp.vo.GameVO;

public class GameInfo {

	// Gameinfo : 게임이 가진 정보를 저장하는 클래스

	// 필요한 게임 정보
	// pseq (플레이어의 순서) , frame (프레임), turn (투구)
	// pinStatus (남아있는 핀의 상태), gameStatus (현재 게임 종료 여부)

	int pseq, frame, turn, pinStatus, gameStatus, playerNum ;
	
	
	
	//핀을 입력받을 때 마다 게임정보를 계산한다.
	private GameVO gameInfoCal(GameVO gvo, int rollNum, Integer ball_10_1) {

		pseq = gvo.getPseq();
		frame = gvo.getFrame();
		turn = gvo.getTurn();
		pinStatus =  gvo.getPinStatus();
		playerNum = gvo.getPlayerNum();		
		gvo.setTotalScore(null);
		
		pinStatus -= rollNum;
		
		//프레임이 10이 아닐 때,
		if(frame < 10) {
			if(turn == 1 && pinStatus != 0) {	// 첫번째 투구에 스트라이크가 아니라면?
				turn = 2;
			} else if((turn == 1 && pinStatus == 0) || turn == 2) {	
			// 첫번째 투구가 스트라이크이거나, 투구를 전부 마쳤을 때 
				turn = 1;
				pseq++;
				pinStatus = 10;
			}
		} else { 	//10프레임
			if(turn == 1) {
				if(ball_10_1 == 10) {	//첫번째 핀이 스트라이크일 경우
					turn = 2;
					pinStatus = 10;
				} else {				//첫번째 핀이 스트라이크가 아닐 경우
					turn = 2;
				}
			} else if(turn == 2) {
				if(pinStatus == 0) {	//마지막 프레임이 스페어 or 두번째 핀이 스트라이크
					turn = 3;
					pinStatus = 10;
				} else if(pinStatus != 0 && ball_10_1 == 10) {	//첫번째 핀 스트라이크 and 두번째 핀 스트라이크 X
					turn = 3;
				} else {
					turn = 1;
					pseq++;
					pinStatus = 10;
					gvo.setTotalScore(0);
					// → 각 플레이어 별 플레이어 정보의 최종 총점 업데이트 시점을 구별하기 위해 0으로 셋팅
				}
			} else if(turn == 3) {
				turn = 1;
				pseq++;
				pinStatus = 10;
				gvo.setTotalScore(0);
				// → 각 플레이어 별 플레이어 정보의 최종 총점 업데이트 시점을 구별하기 위해 0으로 셋팅
			}
		}
		
		// 플레이어 순서가 플레이어 수보다 커지면 순서를 다시 1번으로 돌리고, 프레임을 증가시킴
		if(pseq > playerNum) {
			pseq = 1;
			frame++;
		}
		
		gvo.setPseq(pseq);
		gvo.setFrame(frame);
		gvo.setTurn(turn);		
		gvo.setPinStatus(pinStatus);
		
		
		if(frame > 10) gvo.setGameStatus(false);		
		else gvo.setGameStatus(false);
		
		return gvo;
	
	}
	
	

}
