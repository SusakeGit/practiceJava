package cn.com.java;

public class BasicThread {

	 //使用Thread类,调用start方法
	public static void main(String[] args) {
		Thread thread = new Thread(new LiftOff());
		thread.start();
		System.out.println("wait for LiftOff");
	}
	
}
