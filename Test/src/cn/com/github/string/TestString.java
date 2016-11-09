package cn.com.github.string;

public class TestString {
	public static void main(String[] args) {
          String mango = "mango";
          String init = "init";
          String init1 = new String("init");
          String s = "abc"+"def"+47+mango;
          System.out.println(s);
          
          String concant1 = "I"+"am"+"min-snail";
          String concant2 = "I";
          concant2 += "am";
          concant2 += "min-snail";
          System.out.println(concant1 == concant2);
	}
}
