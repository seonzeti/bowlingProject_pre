package com.comin.syp.vo;

import java.util.Date;

public class GameVO {
	// 게임과 관련된 정보들
	
	

	private int gseq; // 게임 고유 번호
	private String firstPlayer; // 대표 플레이어 이름
	
	private int playerNum; // 게임의 인원 수
	private boolean gameStatus; // 게임의 현재 상태 (true : 진행 / false : 종료)	
	
	private Date game_date; 	//게임 날짜 
	
	private int pinStatus; //핀상태
	
	private int frame = 1; // 현재 프레임
	private int turn = 1; // 현재 투구
	private int pseq = 1; // 현재 플레이어 번호
	
	private Integer roll; // 현재 친 핀 갯수

	private Integer totalScore;
	// 0 : 핀 입력 완료 시 총점 DB 업데이트
	// 1 : 처음 핀을 삭제했을 때 ?
	// null : 게임 진행 중 기본 값
	// 최종 총점 : (게임종료)

	private String playerName; // 현재 게임을 진행중인 플레이어 이름

	public int getGseq() {
		return gseq;
	}

	public void setGseq(int gseq) {
		this.gseq = gseq;
	}

	public String getFirstPlayer() {
		return firstPlayer;
	}

	public void setFirstPlayer(String firstPlayer) {
		this.firstPlayer = firstPlayer;
	}

	public int getPlayerNum() {
		return playerNum;
	}

	public void setPlayerNum(int playerNum) {
		this.playerNum = playerNum;
	}

	public boolean isGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(boolean gameStatus) {
		this.gameStatus = gameStatus;
	}

	public Date getGame_date() {
		return game_date;
	}

	public void setGame_date(Date game_date) {
		this.game_date = game_date;
	}

	public int getPinStatus() {
		return pinStatus;
	}

	public void setPinStatus(int pinStatus) {
		this.pinStatus = pinStatus;
	}

	public int getFrame() {
		return frame;
	}

	public void setFrame(int frame) {
		this.frame = frame;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getPseq() {
		return pseq;
	}

	public void setPseq(int pseq) {
		this.pseq = pseq;
	}

	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	
	
	
}
