package com.quickhit;

public class Level {
	private int levelNo;//������
	private int strLength;//һ������ַ�������
	private int strTime;//����ַ����Ĵ���
	private int timeLimit;//ʱ������
	private int perScore;//��ȷһ�εĵ÷�
	
	public Level(int levelNo, int strLength, int strTime, int timeLimit, int perScore) {
		super();
		this.levelNo = levelNo;
		this.strLength = strLength;
		this.strTime = strTime;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getStrLength() {
		return strLength;
	}
	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}
	public int getStrTime() {
		return strTime;
	}
	public void setStrTime(int strTime) {
		this.strTime = strTime;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	

}
