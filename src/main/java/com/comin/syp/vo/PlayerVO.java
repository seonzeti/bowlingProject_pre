package com.comin.syp.vo;

import java.util.Date;

public class PlayerVO {

	private int rank; // 랭킹 순위
	private String firstPlayer; // 대표 플레이어 이름
	private int playerNum; // 게임 인원 수
	private Date startDate; // 게임 시작 날짜

	private String playerStatus; // 플레이어의 게임 진행 여부

	private Integer pseq; // 플레이어 번호
	private Integer gseq; // 게임 고유 번호
	private String name; // 플레이어의 이름

	private int frameScore; //
	private int totalScore;

	private int[] scoreList = new int[21]; // 점수를 넣을 배열

	
	private Integer ball_1_1;
	private Integer ball_1_2;
	private Integer ball_2_1;
	private Integer ball_2_2;
	private Integer ball_3_1;
	private Integer ball_3_2;
	private Integer ball_4_1;
	private Integer ball_4_2;
	private Integer ball_5_1;
	private Integer ball_5_2;
	private Integer ball_6_1;
	private Integer ball_6_2;
	private Integer ball_7_1;
	private Integer ball_7_2;
	private Integer ball_8_1;
	private Integer ball_8_2;
	private Integer ball_9_1;
	private Integer ball_9_2;
	private Integer ball_10_1;
	private Integer ball_10_2;
	private Integer ball_10_3;
	
	
	public Integer get_Ball(int frame, int turn) {
		if(frame == 1) {
			if(turn == 1) return ball_1_1;
			else return ball_1_2;
		} else if(frame == 2) {
			if(turn == 1) return ball_2_1;
			else return ball_2_2;
		} else if(frame == 3) {
			if(turn == 1) return ball_3_1;
			else return this.ball_3_2;
		} else if(frame == 4) {
			if(turn == 1) return ball_4_1;
			else return ball_4_2;
		} else if(frame == 5) {
			if(turn == 1) return ball_5_1;
			else return ball_5_2;
		} else if(frame == 6) {
			if(turn == 1) return ball_6_1;
			else return this.ball_6_2;
		} else if(frame == 7) {
			if(turn == 1) return ball_7_1;
			else return ball_7_2;
		} else if(frame == 8) {
			if(turn == 1) return ball_8_1;
			else return this.ball_8_2;
		} else if(frame == 9) {
			if(turn == 1) return ball_9_1;
			else return this.ball_9_2;
		} else {
			if(turn == 1) return ball_10_1;
			else if(turn == 2) return ball_10_2;
			else return this.ball_10_3;
		}
	}
	
	public void set_Ball(int frame, int turn, Integer roll) {
		if(frame == 1) {
			if(turn == 1) this.ball_1_1 = roll;
			else this.ball_1_2 = roll;
		} else if(frame == 2) {
			if(turn == 1) this.ball_2_1 = roll;
			else this.ball_2_2 = roll;
		} else if(frame == 3) {
			if(turn == 1) this.ball_3_1 = roll;
			else this.ball_3_2 = roll;
		} else if(frame == 4) {
			if(turn == 1) this.ball_4_1 = roll;
			else this.ball_4_2 = roll;
		} else if(frame == 5) {
			if(turn == 1) this.ball_5_1 = roll;
			else this.ball_5_2 = roll;
		} else if(frame == 6) {
			if(turn == 1) this.ball_6_1 = roll;
			else this.ball_6_2 = roll;
		} else if(frame == 7) {
			if(turn == 1) this.ball_7_1 = roll;
			else this.ball_7_2 = roll;
		} else if(frame == 8) {
			if(turn == 1) this.ball_8_1 = roll;
			else this.ball_8_2 = roll;
		} else if(frame == 9) {
			if(turn == 1) this.ball_9_1 = roll;
			else this.ball_9_2 = roll;
		} else {
			if(turn == 1) this.ball_10_1 = roll;
			else if(turn == 2) this.ball_10_2 = roll;
			else this.ball_10_3 = roll;
		}
	}

	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
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
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getPlayerStatus() {
		return playerStatus;
	}
	public void setPlayerStatus(String playerStatus) {
		this.playerStatus = playerStatus;
	}
	public Integer getPseq() {
		return pseq;
	}
	public void setPseq(Integer pseq) {
		this.pseq = pseq;
	}
	public Integer getGseq() {
		return gseq;
	}
	public void setGseq(Integer gseq) {
		this.gseq = gseq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFrameScore() {
		return frameScore;
	}
	public void setFrameScore(int frameScore) {
		this.frameScore = frameScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	public int[] getScoreList() {
		return scoreList;
	}
	public void setScoreList(int[] scoreList) {
		this.scoreList = scoreList;
	}
	public Integer getBall_1_1() {
		return ball_1_1;
	}
	public void setBall_1_1(Integer ball_1_1) {
		this.ball_1_1 = ball_1_1;
	}
	public Integer getBall_1_2() {
		return ball_1_2;
	}
	public void setBall_1_2(Integer ball_1_2) {
		this.ball_1_2 = ball_1_2;
	}
	public Integer getBall_2_1() {
		return ball_2_1;
	}
	public void setBall_2_1(Integer ball_2_1) {
		this.ball_2_1 = ball_2_1;
	}
	public Integer getBall_2_2() {
		return ball_2_2;
	}
	public void setBall_2_2(Integer ball_2_2) {
		this.ball_2_2 = ball_2_2;
	}
	public Integer getBall_3_1() {
		return ball_3_1;
	}
	public void setBall_3_1(Integer ball_3_1) {
		this.ball_3_1 = ball_3_1;
	}
	public Integer getBall_3_2() {
		return ball_3_2;
	}
	public void setBall_3_2(Integer ball_3_2) {
		this.ball_3_2 = ball_3_2;
	}
	public Integer getBall_4_1() {
		return ball_4_1;
	}
	public void setBall_4_1(Integer ball_4_1) {
		this.ball_4_1 = ball_4_1;
	}
	public Integer getBall_4_2() {
		return ball_4_2;
	}
	public void setBall_4_2(Integer ball_4_2) {
		this.ball_4_2 = ball_4_2;
	}
	public Integer getBall_5_1() {
		return ball_5_1;
	}
	public void setBall_5_1(Integer ball_5_1) {
		this.ball_5_1 = ball_5_1;
	}
	public Integer getBall_5_2() {
		return ball_5_2;
	}
	public void setBall_5_2(Integer ball_5_2) {
		this.ball_5_2 = ball_5_2;
	}
	public Integer getBall_6_1() {
		return ball_6_1;
	}
	public void setBall_6_1(Integer ball_6_1) {
		this.ball_6_1 = ball_6_1;
	}
	public Integer getBall_6_2() {
		return ball_6_2;
	}
	public void setBall_6_2(Integer ball_6_2) {
		this.ball_6_2 = ball_6_2;
	}
	public Integer getBall_7_1() {
		return ball_7_1;
	}
	public void setBall_7_1(Integer ball_7_1) {
		this.ball_7_1 = ball_7_1;
	}
	public Integer getBall_7_2() {
		return ball_7_2;
	}
	public void setBall_7_2(Integer ball_7_2) {
		this.ball_7_2 = ball_7_2;
	}
	public Integer getBall_8_1() {
		return ball_8_1;
	}
	public void setBall_8_1(Integer ball_8_1) {
		this.ball_8_1 = ball_8_1;
	}
	public Integer getBall_8_2() {
		return ball_8_2;
	}
	public void setBall_8_2(Integer ball_8_2) {
		this.ball_8_2 = ball_8_2;
	}
	public Integer getBall_9_1() {
		return ball_9_1;
	}
	public void setBall_9_1(Integer ball_9_1) {
		this.ball_9_1 = ball_9_1;
	}
	public Integer getBall_9_2() {
		return ball_9_2;
	}
	public void setBall_9_2(Integer ball_9_2) {
		this.ball_9_2 = ball_9_2;
	}
	public Integer getBall_10_1() {
		return ball_10_1;
	}
	public void setBall_10_1(Integer ball_10_1) {
		this.ball_10_1 = ball_10_1;
	}
	public Integer getBall_10_2() {
		return ball_10_2;
	}
	public void setBall_10_2(Integer ball_10_2) {
		this.ball_10_2 = ball_10_2;
	}
	public Integer getBall_10_3() {
		return ball_10_3;
	}
	public void setBall_10_3(Integer ball_10_3) {
		this.ball_10_3 = ball_10_3;
	}
	
	
	
	
}
