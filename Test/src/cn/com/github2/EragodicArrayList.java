package cn.com.github2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class EragodicArrayList {

	/**
	 * 测试不同遍历方式的效率
	 */
	public static void testObtainAllElements(){
		//初始化一个较大的ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<2000000; i++){
			list.add(i);
		}
		//零：使用Iterator
		long start = startTime();
		for(Iterator<Integer> iter = list.iterator(); iter.hasNext(); ) {
			iter.next();
		}
		endTime(start);		//result: 63ms
		
		//一：使用Iterator
		long start0 = startTime();
		for(Iterator<Integer> iter = list.listIterator(); iter.hasNext(); ) {
			iter.next();
		}
		endTime(start0);		//result: 78ms
		
		//二：使用随机访问、通过索引
		long start1 = startTime();
		for (int i = 0; i < list.size(); i++){
			list.get(i);
		}
		endTime(start1);	//result: 16ms
		
		//三：使用增强for循环
		long start2 = startTime();
		for(@SuppressWarnings("unused") int i : list);
		endTime(start2);	//result:62ms
		
		//四：使用ListIterator
		long start3 = startTime();
		ListIterator<Integer> li = list.listIterator(0);
		while(li.hasNext()){
			li.next();
		}
		endTime(start3);	//result: 63ms
		
	}
	private static void endTime(long start) {
		long end = startTime();
		System.out.println(end - start + " ms");
	}

	private static long startTime() {
		long start = System.currentTimeMillis();
		return start;
	}
	
	public static void main(String[] args) {
		testObtainAllElements();
	}
}
