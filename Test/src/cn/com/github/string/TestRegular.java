package cn.com.github.string;

import java.util.Arrays;


public class TestRegular {
    
	public static String knights = "Then,when you have found the shrubbery, you must cutdown the sssss";
	
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	
	public static void main(String[] args) {
		split("");
		split("\\W+");
		split("n\\W+");
		System.out.println("Rudolph".matches("[rR][aeiou][a-z]ol.*"));
		String s = knights;
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|must|sssss", "banabana"));
	}
}
