package cn.com.java;

public class MoreBasicThreads {

	//增加更多的Thread方法
	public static void main(String args[]){
		for(int i = 0; i < 5; i++){
			new Thread(new LiftOff()).start();
			System.out.println("waiting for LiftOff");
		}
	}
}
