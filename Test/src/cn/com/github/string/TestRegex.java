package cn.com.github.string;

public class TestRegex {
      
	  //匹配字符
	  public static void testChar(){
		  String string = "ragrok";
		  System.out.println(string.matches("\\w+")); //true
	  }
   
	 //匹配数字
	  public static void testNmuber(){
		  String string = "212-333-122";
		  System.out.println(string.matches("\\d+")); //true
		  System.out.println(string.matches("\\(\\d{3}\\)\\s\\d{3}-\\d{4}")); //true
	  }
	  
	  public static void main(String[] args) {
		//testChar();
		testNmuber();
	}
}
