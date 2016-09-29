package cn.com.github2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListTest {

	/**
	 * 测试ArrayList的添加元素方法、以及与size有关的方法
	 */
	public static void testArrayListSize(){
		//use default object array's size 10
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add(1, "b");
		
		// use specified size 4
		ArrayList<String> list2  = new ArrayList<String>(4);
		list2.add("c");
		list2.add("d");
		list2.add("e");
		list2.add("f");
		
		//use specified size 5
		ArrayList<String> list3  = new ArrayList<String>(5);
		list3.add("g");
		list3.add("h");
		list3.add("i");
		list3.add("j");
		list3.add("k");
		list.addAll(list2);//从list末尾开始追加
		System.out.println(list.size());// result: 6
		list.addAll(6, list3);//从list索引6开始添加
		System.out.println(list.size());// result: 11
		//see AbstractCollection.toString();
		System.out.println(list);	//result: [a, b, c, d, e, f, g, h, i, j, k]
		
		// 对于ArrayList的大小、我们可以使用三个方法来操作
		list.add(null);
		list.add(null);
		System.out.println(list.size());
		list.trimToSize();//将list的大小设置成与其包含的元素相同、null也算是list中的元素、并且可以重复出现
		System.out.println(list.size());
		list.ensureCapacity(1);//确保list的大小不小于传入的参数值。
		System.out.println(list.size());
		System.out.println(list.size());
		
	}
	
	/**
	 * 测试ArrayList的包含、删除方法
	 */
	public static void testArrayListContainsRemove(){
		
		//初始化包含学号从1到10的十个学生的ArrayList
		ArrayList<Student> list1 = new ArrayList<Student>();
		Student s1 = new Student(1,"chy1");
		Student s2 = new Student(2,"chy2");
		Student s3 = new Student(3,"chy3");
		Student s4 = new Student(4,"chy4");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list1.add(s4);
		for (int i = 5; i < 11; i++) {
			list1.add(new Student(i, "chy" + i));
		}
		System.out.println(list1);
		
		//初始化包含学号从1到4的四个学生的ArrayList
		ArrayList<Student> list2 = new ArrayList<Student>();
		list2.add(s1);
		list2.add(s2);
		list2.add(s3);
		list2.add(s4);
		
		//查看list1中是否包含学号为1的学生（ 这里要注意、ArrayList中存放的都是对象的引用、而非堆内存中的对象）
		System.out.println(list1.contains(s1));
		
		//查看list1中是否包含list2
		System.out.println(list1.containsAll(list2));
		
		//从新构造一个指向学号为1的student、查看list2是否包含、不包含就添加进去、在判断list1是否包含list2
		Student newS1 = new Student(1, "newchy1");
		System.out.println("list2 contains newS1 ? " + list2.contains(newS1));
		
		if(!list2.contains(newS1)){
			list2.add(newS1);
		}
		System.out.println("list2 members ：" + list2.toString());
		System.out.println("list1 contains list2 ? " + list1.containsAll(list2));
		
		//删除list1中索引为0的学生
		System.out.println(list1.remove(0));
		//如果学号为1的学生存在则删除、不存在删除学号为2的学生
		if(!list1.remove(s1)){
			System.out.println(list1.remove(s2));
		}
		//删除list2中的学生
		list1.removeAll(list2);
		System.out.println(list1);
		
		//清空list1
		list1.clear();
		
		//求list1与list2中元素的交集
		list1.retainAll(list2);
		System.out.println(list1);
	}
	
	/**
	 * 测试ArrayList的获取元素方法、
	 */
	public static void testObtainArrayListElements(){
		//将字符串数组转化成ArrayList
		String[] strArray = {"a", "b" ,"c", "d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		/*
		使用时会抛异常、是由于Arrays.asList(strArray)返回的是一个Object[]、不能强转成ArrayList<String>类型
		ArrayList<String> list2 = (ArrayList<String>)Arrays.asList(strArray);
		System.out.println(list2);
		*/
		
		//一般情况下使用下面这种转换方式、他会自动的将数组转换之后的类型设置为runtime时的类型
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(strArray));
		System.out.println(list1);
		
		//获取某个索引处的元素
		System.out.println("str " + list1.get(0) + " size: " + list1.size());
		
		//将最后一个元素设置成"a"、打印被替换的元素
		System.out.println("old element :" + list1.set(list1.size()-1, list1.get(0)) + " list elements: " + list1);
		System.out.println();
		
		//返回第一个、最后一个“a”、“w”、“z”的索引、不存在则返回-1、内部是根据ListIterator来返回索引的
		System.out.println("first index of a : " + list1.indexOf("a") + " last index of a :" + list1.lastIndexOf("a"));
		System.out.println("first index of w : " + list1.indexOf("w") + " last index of w :" + list1.lastIndexOf("w"));
		System.out.println("first index of z : " + list1.indexOf("z") + " last index of z :" + list1.lastIndexOf("z"));
	}
	
	

	/**
	 * 对ListIterator方法的测试
	 */
	public static void testListIterator(){
		String[] strArray = {"a", "b" ,"c", "d","e"};
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArray));
		
		//倒序遍历list
		ListIterator<String> li = list.listIterator(list.size());
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		System.out.println("================================");
		
		//以获取idnex方式  、正序遍历list
		ListIterator<String> li1 = list.listIterator(0);
		while(li1.hasNext()){
			//System.out.println(li1.nextIndex());		会造成死循环、具体可以看源码
			//System.out.println(li1.previousIndex());		同样会造成死循环、具体可以看源码
			String s = li1.next();
			
			if("d".equals(s)){
				li1.set("a");
			}
			
			if("e".equals(s)){
				li1.add("f");
			}
			
			if("b".equals(s)){
				li1.remove();
			}
		}
		System.out.println(list);
		
		//对于在遍历过程中想获取index、要注意死循环、和字节想要获取的方式、具体可以自己动手试试
		ListIterator<String> li2 = list.listIterator();
		while(li2.hasNext()){
			li2.next();
			System.out.println(li2.nextIndex() + "========" + li2.previousIndex());
		}
		
	}
	
	/**
	 * 测试ArrayList转换成Array时注意事项、附Array转换成List
	 */
	public static void testArrayList2Array(){
		//关于Array转换成ArrayList上面已经有过介绍、现在再补充一点特殊情况
		int[] intArray = new int[10];
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i;
		}
		
		//将上面的数组转化成ArrayList
		//ArrayList<int> list = Arrays.asList(intArray); 这种写法编译就会报错、因为集合的定义中、只能存放对象（其实是对象的引用）、所以我们要使用包装类型Integer
		
		//要先将上面的数组转换成Integer类型数组、只能手动转、不能强制或者自动转换、若有的话望贴出来啊
		Integer[] integerArray = new Integer[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			integerArray[i] = intArray[i];
		}
		
		//ArrayList<Integer> list = (ArrayList<Integer>)Arrays.asList(integerArray);
		//System.out.println(list.get(0)); 会报错、原因上面有
		
		//通常使用下面的转换方式
		ArrayList<Integer> normalList = new ArrayList<Integer>(Arrays.asList(integerArray));
		System.out.println(normalList.get(0));
		
		//第一种
		/*
		 * 会报强制转换错误、
		//ArrayList转换成Array
		Integer[] itg = (Integer[])normalList.toArray();
		System.out.println(itg[0]);
		*/
		
		//第二种
		Integer[] ia = new Integer[normalList.size()];
		normalList.toArray(ia);
		System.out.println(ia[0]);
		
		//第三种、应该使用这种形式的定义、传入的参数的本质是供toArray内部调用其类型、对其size简单处理一下、如果size大于list的size、则后面的补null、如果小于、则使用新的数组替换传入的、并作为结果返回
		Integer[] ia2 = normalList.toArray(new Integer[11]);
		System.out.println(ia2[10]);
		
		
		
	}
	
	/**
	 * 测试fail-fast机制
	 */
	public static void testFailFast(){
		String[] s = {"a", "b", "c", "d", "e"};
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(s));
		Iterator<String> it = strList.iterator();
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
			//这里本来是多线程动了ArrayList中的元素造成的、现在仅仅是模拟一种情况、就是在迭代的过程中、另一个线程向ArrayList中添加一个元素造成的fail-fast
			//异常信息：java.util.ConcurrentModificationException
			if("d".equals(str)){
				strList.add(str);
			}
		}
	}
	
	public static void main(String[] args) {
testArrayListSize();
//		testArrayListContainsRemove();
//		testObtainArrayListElements();
//		testArrayList2Array();
//		testFailFast();
	//	testListIterator();
	}
}