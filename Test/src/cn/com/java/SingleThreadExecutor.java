package cn.com.java;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {
		//优化
		ExecutorService exec = 
				Executors.newSingleThreadExecutor();
		for(int i = 0; i < 5; i++)
			exec.execute(new LiftOff());
		    exec.shutdown();
	}
}
