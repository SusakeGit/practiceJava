package cn.com.github.generic;

import java.util.ArrayList;

public class TestGeneric {

	 public static void main(String[] args) {
             ArrayList<String> strings = new ArrayList<String>();
             strings.add("ÇïÏã");
             System.out.println(strings);
             ArrayList<Integer> integer = new ArrayList<Integer>();	
             integer.add(1);
             System.out.println(integer);
             System.out.println(strings.getClass().getName() == integer.getClass().getName());
	}
}
  