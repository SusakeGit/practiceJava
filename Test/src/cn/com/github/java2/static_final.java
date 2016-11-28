package cn.com.github.java2;

import java.util.ArrayList;
import java.util.List;

import cn.com.github.base.Print;

public class static_final {
    
	 //使用static final 修饰的对象的引用可以改变
	  static final List<String> s = new ArrayList<String>();
	  public static void main(String[] args) {
		  s.add("a");
		  s.remove("a");
		 Print.Print(s); 
	}
}
