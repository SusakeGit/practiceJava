
package cn.com.github.generic;

public class LearnGeneric1 {
    public static void main(String[] args) {
    	//first style of write
		Class<Integer> first = int.class;
		//second style of write
		Class seconde = int.class;
		//添加通配符
		Class<?> intClass = int.class;
		//refine generic
		Class<? extends Number> bounded = int.class;
	}
}
