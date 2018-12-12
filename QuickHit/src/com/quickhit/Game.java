package com.quickhit;

import java.util.Random;
import java.util.Scanner;

public class Game {
	private Player player;
	
	public Game(Player player) {
		super();
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player = player;
	}
	
	private String printStr() {
		int levelNo = player.getLevelNo();
		Level level = LevelParam.levels[levelNo-1];
		int strLength = level.getStrLength();
		StringBuffer buffer = new StringBuffer();
		for(int i = 0;i<strLength;i++) {
			int rand = new Random().nextInt(strLength);
			switch (rand) {
			case 0:
				buffer.append(">");
				break;
			case 1:
				buffer.append("<");
				break;
			case 2:
				buffer.append("*");
				break;
			case 3:
				buffer.append("&");
				break;
			case 4:
				buffer.append("%");
				break;
			case 5:
				buffer.append("#");
				break;
			}
		}
		return buffer.toString();
	}
	
	private void printResult(String str,String printstr) {
		int levelNo = player.getLevelNo()-1;
		Level level = LevelParam.levels[levelNo];
		long currentTime = System.currentTimeMillis();
		if((currentTime-player.getStartTime())/1000
				>LevelParam.levels[player.getLevelNo()-1].getTimeLimit()) {
			System.out.println("你输入太慢了，已经超时，退出！");
			System.exit(1);
		}
		if(str.equals(printstr)) {
			player.setCurScore(player.getCurScore()+
					LevelParam.levels[player.getLevelNo()-1].getPerScore());
			player.setClapsedTime((int)((currentTime-player.getStartTime())/1000));
			System.out.println("输入正确，您的级别"+player.getLevelNo()+
					"，您的积分"+player.getCurScore()+"，已用时间"+player.getClapsedTime());
		}else {
			System.out.println("输入错误，退出！");
			System.exit(1);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player player = new Player();
		Game game = new Game(player);
		for(int i=0;i<6;i++) {
			for(int j=0;j<LevelParam.levels[player.getLevelNo()-1].getStrTime();j++) {
				String printstr = game.printStr();
				System.out.println(printstr);
				String str = scanner.nextLine();
				game.printResult(str,printstr);
			}
			player.setLevelNo(player.getLevelNo()+1);
			player.setCurScore(0);
			player.setStartTime(System.currentTimeMillis());
			player.setClapsedTime(0);
		}
		System.out.println("恭喜通关！！");
	}
	
}
