package cn.com.java1;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String>{
    
	private int id;
	
	public String call() throws Exception {	
		return "retult of TaskWithResult"+id;
	}
	 
	public TaskWithResult(int id){
		this.id = id;
	}
  
	
}
