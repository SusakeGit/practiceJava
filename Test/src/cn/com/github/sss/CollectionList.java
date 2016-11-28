package cn.com.github.sss;

import java.util.ArrayList;

public class CollectionList {

	// 练习ArrayList
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// 添加数据
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("1");
		// 设置添加元素的位�?
		list.add(3, "3");
		list.add("1");
		System.out.println(list.toString());
		list.trimToSize();
		System.out.println(list.toString());
		System.out.println(list.size());
		// remove4号为的元�?
		System.out.println(list.remove(3));
		// 查询该数�?后出现的位置，从零开始算，没有返�?-1�?
		System.out.println(list.lastIndexOf("1"));
		// 更新该位置元素的�?
		list.set(3, "wo");
		System.out.println(list);
		System.out.println(list.get(3));
		while (list.listIterator().hasNext()) {
			System.out.println("输出的数"+list.listIterator().next());
		}
		// 清除该list数组中的�?有元�?
		list.clear();
		System.out.println(list);
		//输出
		/*
		 * [1, 1, 1, 3, 1, 1] 
		 * [1, 1, 1, 3, 1, 1] 
		 * 6
		 * 3
		 * 4 
		 * [1, 1, 1, wo, 1] 
		 * wo 
		 * []
		 */
	}
}
