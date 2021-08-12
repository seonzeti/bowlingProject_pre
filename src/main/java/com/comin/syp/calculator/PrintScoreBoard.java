package com.comin.syp.calculator;

import java.util.HashMap;

import com.comin.syp.vo.GameVO;
import com.comin.syp.vo.PlayerVO;


/*gamestart.jsp 에 필요한 데이터를 반환해주는 공간 
반환되는 데이터는 총점 리스트 / 플레이어 번호, 각 프레임당 보너스 여부를 저장하는 리스트와 마지막 총점 */

/**
* @param frame - int (현재 진행되고 있는 프레임 번호)
* @return ArrayList<Integer> - 총점 리스트
*/

public class PrintScoreBoard {

	public HashMap<String, Object> scoreBoard(PlayerVO pvo, GameVO gvo) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		int[] scoreList;
		
		
		int frame = gvo.getFrame();
		int pseq = gvo.getPseq();
		int turn = gvo.getTurn();
		int PlayerNum = gvo.getPlayerNum();

		if (frame == 11) {
			frame = 10;
			pseq = PlayerNum;
			// 프레임 번호가 11일 경우 오류 발생 → ArrayIndexOutOfBoundsException
			// frame 번호를 마지막 프레임인 10으로 초기화
			// 플레이어 번호(pseq) 또한 마지막 플레이어 번호로 초기화
		}

		Score score = new Score(); // Score 객체 생성
		score.reset(); // Score 관련 변수 초기화

		for (int i = 1; i <= 10; i++) { // roll()를 통해 핀 점수 리스트 초기화
			score.roll(pvo.get_Ball(i, 1));
			score.roll(pvo.get_Ball(i, 2));
			if (i == 10)
				score.roll(pvo.getBall_10_3());
		}
		
		scoreList = score.scoreList;
		// → score() > 프레임 번호를 넘겨줌으로써 해당 프레임까지의 총점 리스트를 반환

		map.put("pseq", pvo.getPseq());
		// → 해당 플레이어 번호를 map에 추가(스코어보드 총점 출력시 해당 gvo의 플레이어 번호와의 비교를 위해)

		map.put("bonusList", score.isBonus(frame, turn));
		// → isBonus() > 프레임 번호화 투구 번호를 넘겨줌으로써 해당 프레임까지의 보너스 리스트를 가져오고 map에 추가

		map.put("scoreList", scoreList);

		for (int i = 0; i < 10; i++) {			
			
			Integer totalScore = null;
			if (gvo.isGameStatus() == false) {				
				totalScore = score.getscore();
				// → 총점을 변수에 초기화

				map.put("totalScore", totalScore);
			}
		}
		return map;
	}

}
