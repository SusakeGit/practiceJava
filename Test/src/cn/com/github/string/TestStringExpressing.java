package cn.com.github.string;

public class TestStringExpressing {

	public static void testStartsWith() {
		String string = "mike,wang,lol,gege,meizi";
		System.out.println(string.startsWith("mik")); // true
		System.out.println(string.startsWith("mikasd")); // false
	}

	public static void testEndsWith() {
		String string = "mike,wang,lol,gege,meizi";
		System.out.println(string.endsWith("meizi")); // true
		System.out.println(string.endsWith("mei")); // false
	}

	public static void testMatches() {
		String string = "mikewanglolgegemeizi";
		System.out.println(string.matches("\\w+")); // true
		System.out.println(string.matches("\\W+")); // false
	}

	public static void testSplit() {
		String string = "mike,wang,lol,gege,meizi";
		// 去掉,
		String[] strings = string.split(",");
		for (String string2 : strings) {
			System.out.println(string2); // mike wang lol gege meizi
		}
		String string1 = "mike,wang,lol,gege,meizi";
		// 去掉以m开头的字符串
		String[] strings1 = string1.split("m\\w+");
		for (String string2 : strings1) {
			System.out.println(string2); // ,wang,lol,gege
		}
	}

	public static void testReplace() {
		String string = "mike,wang,lol,gege,meizi";
		System.out.println(string.replace("mike", "xiaowang")); // xiaowang,wang,lol,gege,meizi
		System.out.println(string.replace("mikse", "xiaowang"));// mike,wang,lol,gege,meizi
	}
      
	public static void testReplaceAll(){
		String string = "mike,wang,lol,gege,meizi";
		//将符合正则表达式的部分用某个字符串来代替,特别适合处理大量数据时，所以我们接下来要重点介绍正则表达式
		System.out.println(string.replaceAll("\\w+", "xiaowang")); 
		//xiaowang,xiaowang,xiaowang,xiaowang,xiaowang
	}
	
	public static void testSubstring() {
		String string = "mike,wang,lol,gege,meizi";
		System.out.println(string.substring(0, string.length() - 4));// 截取0到length-4形成一个新的字符串
		//mike,wang,lol,gege,m
	}

	public static void main(String[] args) {
		// testEndsWith();
		// testMatches();
		// testStartsWith();
		// testSplit();
		// testReplace();
		testSubstring();
//		testReplaceAll();
	}
}
