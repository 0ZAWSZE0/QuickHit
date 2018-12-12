package com.quickhit;

public class Player {
	private int levelNo;//��ҵ�ǰ����
	private int curScore;//��ҵ�ǰ�������
	private long startTime;//��ǰ����ʼʱ��
	private int clapsedTime;//��ǰ��������ʱ��
	
	
	
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
