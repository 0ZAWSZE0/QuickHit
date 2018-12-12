package com.quickhit;

public class Player {
	private int levelNo;//玩家当前级别
	private int curScore;//玩家当前级别积分
	private long startTime;//当前级别开始时间
	private int clapsedTime;//当前级别已用时间
	
	
	
	public Player() {
		super();
		this.levelNo = 1;
		this.curScore = 0;
		this.startTime = System.currentTimeMillis();
		this.clapsedTime = 0;
	}
	
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getCurScore() {
		return curScore;
	}
	public void setCurScore(int curScore) {
		this.curScore = curScore;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public int getClapsedTime() {
		return clapsedTime;
	}
	public void setClapsedTime(int clapsedTime) {
		this.clapsedTime = clapsedTime;
	}
	

}
