package cn.com.github.rtti;

import java.lang.reflect.Field;

class TestReflect{
	public static String usage = "usage:someMethods qualified in class qualified usage: class someMethods in";
}

public class ShowMethod {


	public static void main(String[] args) {
		
		try {
			Class<?> class1 = Class.forName("cn.com.github.rtti.TestReflect");
			Field field = class1.getField("usage");
			System.out.println(field.hashCode());
		} catch (Exception e) {
			System.out.println("No Such Class" + e.getMessage());
		}
	}
}
