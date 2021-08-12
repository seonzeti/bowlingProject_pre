package com.comin.syp.calculator;

import java.util.ArrayList;

public class Score {

	// prevRollCheck () : 조건에 따라 전 핀을 알아볼 수 있다.
	// isBonus() : 10프레임 판별을 위한 보너스 메소드 true값이면 10-3까지 (true) , 아니면 종료 (false)
	// getFrame() : 프레임을 설정할 수 있는 메소드 > FrameNum을 reeturn
	// getTurn() : turn을 설정할 수 있다 > turn, tenTurn을 return
	// getScore(): 점수 계산하는 메소드

	int score;
	// 점수

	// 투구 점수
	public int[] scoreList;

	public int[] bonusList;

	// 총 21번의 투구가 있으므로
	public int currentRoll;
	public int frameNum;
	public int turn;
	public int tenTurn;

	public int prevRoll;

	// 변수 초기화
	public void reset() {
		score = 0;
		scoreList = new int[21];
		bonusList = new int[3];
		// 총 21번의 투구가 있으므로
		currentRoll = 0;
		frameNum = 1;
		turn = 1;
		tenTurn = 0;
		prevRoll = 0;

	}

	public void roll(int pins) {
		// 몇개의 핀이 쓰러졌는지 알 수 있음
		scoreList[currentRoll++] = pins;

	}

	// 조건에 따라 전 핀을 알아볼 수 있다.
	// ex) 첫번째 투구때는 전 롤을 저장, 두번째 투구때는 0을 저장해서 전 롤의 크기를 판단 할 수 있도록 한다.
	public void prevRollCheck() {

		if (turn % 2 == 1 && frameNum != 10) {
			// 10프레임이 아닌 1투구일때
			if (scoreList[currentRoll - 1] == 10) {
				// 스트라이크라면
				prevRoll = 0;
			} else {
				// 스트라이크가 아니라면
				prevRoll += scoreList[currentRoll - 1];
			}
		} else if (frameNum == 10) {
			// 10프레임일때
			if ((tenTurn == 1 && scoreList[currentRoll - 1] == 10) || ((prevRoll + scoreList[currentRoll - 1]) == 10)) {
				// 10-1이 스트라이크
				// 10-1, 10-2가 스페어가 됐다면?
				prevRoll = 0;
			} else {
				prevRoll += scoreList[currentRoll - 1];
			}

		} else {
			// 10프레임이 아닌 2투구일 때
			prevRoll = 0;
		}

	}

	public Boolean isBonus(int frame, int turn) {
		// 10프레임 판별을 위한 bonus 메소드

//		만약 10-1이 스트라이크라면 10-2+10-3의 합이 10이 넘어선 안된다
//		만약 10-1이 스트라이크가 아니라면, 10-1+10-2의 합이 10이 넘어선 안된다
//		만약 10-1 , 10-2 모두 스트라이크라면 10-3은 10이 넘어선 안된다. 

		if (frame == 10) {

			if (turn == 1) {

				bonusList[0] = scoreList[currentRoll - 1];
				// 10-1값은 무조건 받는다.

			} else if (turn == 2) {
				bonusList[1] = scoreList[currentRoll - 1];

				// 10-1
				// 스트라이크라면? 10-2 + 10-3을 판단해야하니까 일단 넘기기
				if (bonusList[0] == 10) {
					return true;
				} else {
					// 10-1이 스트라이크가 아닌데, 두개의 합이 10이 안된다면?
					// 스페어, 스트라이크 처리에 실패한거니까 false
					if (bonusList[0] + bonusList[1] < 10) {
						return false;
					} else {
						// 스트라이크가 아니다.
						return true;
					}
				}

			} else if (turn == 3) {
				bonusList[2] = scoreList[currentRoll - 1];
				return false;
			}

		}
		return true;

		// 만약 false를 출력하면

	}

	public void getFrame() { // 프레임 설정
		// g.frameNum이 증가되어야 하는 두가지 경우 : 2투구 or 1투구때 스트라이크
		// 단, 10프레임에서는 더이상 프레임이 증가해서는 안된다.

		if (frameNum < 10) {
			if (turn == 1 && scoreList[currentRoll - 1] == 10) {
				frameNum++;
			} else {
				if (turn == 2) {
					frameNum++;
				}
			}

		}

	}

	public void getTurn() {// turn 설정

		if (frameNum == 10) {
			tenTurn++;

		} else {
			// 10프레임이 아닌경우
			// 10프레임이 아닌데 스트라이크인 경우 무조건 turn을 1로

			if (currentRoll > 0) {
				if (scoreList[currentRoll - 1] == 10) {
					turn = 1;
				} else {
					// 10프레임이 아닌데 스트라이크가 아닌 경우
					if (turn == 1) {
						turn = 2;
					} else if (turn == 2) {
						turn = 1;
					}
				}
			}

		}
	}

	// 점수계산
	public int getscore() {
		// return할 점수
		int score = 0;
		int firstRollinFrame = 0;

		for (int frame = 0; frame < 10; frame++) {
			if (isSpare(firstRollinFrame)) {
				score += 10 + nextBallForSpare(firstRollinFrame);
				firstRollinFrame += 2;
			} else if (isStrike(firstRollinFrame)) {
				score += 10 + nextBallsForStrike(firstRollinFrame);
				firstRollinFrame += 1;
			} else {
				score += nextBallsforOften(firstRollinFrame);
				firstRollinFrame += 2;
			}

		}
		return score;
	}

	// 프레임 스코어
	public void frameScore() {

		int firstRollinFrame = 0;
		int score = getscore();

		if (isSpare(firstRollinFrame)) {
			// 스페어라면?
			System.out.println("/");
		} else if (isStrike(firstRollinFrame)) {
			// 스트라이크라면?
			System.out.println("X");
		} else {
			System.out.println(score);
		}

	}

	private int nextBallsforOften(int firstRollinFrame) {
		return scoreList[firstRollinFrame] + scoreList[firstRollinFrame + 1];
	}

	// 스트라이크일 경우 보너스 점수 반환
	private int nextBallsForStrike(int firstRollinFrame) {
		return scoreList[firstRollinFrame + 1] + scoreList[firstRollinFrame + 2];
	}

	// 스페어일 경우 보너스 점수 반환
	private int nextBallForSpare(int firstRollinFrame) {
		return scoreList[firstRollinFrame + 2];
	}

	// 스트라이크 판별
	private boolean isStrike(int firstRollinFrame) {
		return scoreList[firstRollinFrame] == 10;
	}

	// 스페어 판별
	private boolean isSpare(int firstRollinFrame) {
		return nextBallsforOften(firstRollinFrame) == 10;
	}

}
