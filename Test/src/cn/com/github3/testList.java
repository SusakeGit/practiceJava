package cn.com.github3;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class testList {

	// 测试list集合的效率
	private static List<String> arrayList = new ArrayList<String>();
	private static Vector<String> vector = new Vector<String>();
	private static Stack<String> stack = new Stack<String>();
	private static LinkedList<String> linkedList = new LinkedList<String>();

	private static long startTime() {
		return System.currentTimeMillis();
	}

	private static long endTime() {
		return System.currentTimeMillis();
	}

	// 测试插入方法
	private static void testInsert() {
		testInsert(arrayList);
		testInsert(vector);
		testInsert(stack);
		testInsert(linkedList);
	}

	// 测试随机访问
	private static void testRandomAcess() {
		testRandomAcess(arrayList);
		testRandomAcess(vector);
		testRandomAcess(stack);
		testRandomAcess(linkedList);
	}

	// 测试迭代效率
	private static void testIterator() {
		testIterator(arrayList);
		testIterator(vector);
		testIterator(stack);
		testIterator(linkedList);
	}

	// 测试删除效率
	private static void testDelete() {
		testDelete(arrayList);
		testDelete(vector);
		testDelete(stack);
		testDelete(linkedList);
	}

	private static void testDelete(List<String> list) {
		long start = startTime();
		for (int i = 0; i < list.size(); i++) {
			list.remove(i);
		}
		long end = endTime();
		System.out.println("删除时间:"+(end - start)+"ms");
	}

	private static void testIterator(List<String> list) {
		long start = startTime();
		Iterator<String> iterator = list.iterator();
		if (iterator.hasNext()) {
			iterator.next();
		}
		long end = endTime();
		System.out.println("迭代时间:"+(end - start)+"ms");
	}

	private static void testRandomAcess(List<String> list) {
		long start = startTime();
		for (int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		long end = endTime();
		System.out.println("随机访问时间:"+(end - start)+"ms");
	}

	private static void testInsert(List<String> list) {
		long start = startTime();
		for (int i = 0; i < 100000; i++) {
			list.add(i,"ssdfssdfsf");
		}
		long end = endTime();
		System.out.println("添加时间:"+(end - start)+"ms");
	}

	public static void main(String[] args) {
		testInsert();
		testIterator();
		testRandomAcess();
		testDelete();
	}
	//顺序依次是arrayList，vector，stack，linkedList;
	
	//处理100条数据所用时间
//	添加时间:0ms
//	添加时间:0ms
//	添加时间:1ms
//	添加时间:0ms
//	迭代时间:6ms
//	迭代时间:1ms
//	迭代时间:0ms
//	迭代时间:1ms
//	随机访问时间:5ms
//	随机访问时间:1ms
//	随机访问时间:0ms
//	随机访问时间:0ms
//	删除时间:0ms
//	删除时间:1ms
//	删除时间:0ms
//	删除时间:2ms
	//1000條數據
//	添加时间:7ms
//	添加时间:7ms
//	添加时间:1ms
//	添加时间:9ms
//	迭代时间:2ms
//	迭代时间:1ms
//	迭代时间:0ms
//	迭代时间:1ms
//	随机访问时间:11ms
//	随机访问时间:4ms
//	随机访问时间:1ms
//	随机访问时间:46ms
//	删除时间:6ms
//	删除时间:3ms
//	删除时间:1ms
//	删除时间:25ms
	
	//10000条数据
//	添加时间:45ms
//	添加时间:29ms
//	添加时间:3ms
//	添加时间:20ms
//	迭代时间:2ms
//	迭代时间:1ms
//	迭代时间:0ms
//	迭代时间:1ms
//	随机访问时间:14ms
//	随机访问时间:18ms
//	随机访问时间:4ms
//	随机访问时间:604ms
//	删除时间:59ms
//	删除时间:52ms
//	删除时间:85ms
//	删除时间:194ms
	//100000条数据
//	添加时间:71ms
//	添加时间:141ms
//	添加时间:47ms
//	添加时间:65ms
//	迭代时间:1ms
//	迭代时间:1ms
//	迭代时间:0ms
//	迭代时间:0ms
//	随机访问时间:57ms
//	随机访问时间:26ms
//	随机访问时间:34ms
//	随机访问时间:36964ms
//	删除时间:5713ms
//	删除时间:5084ms
//	删除时间:5150ms
//	删除时间:17237ms
}