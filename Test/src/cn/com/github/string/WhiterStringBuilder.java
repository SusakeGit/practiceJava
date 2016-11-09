package cn.com.github.string;

public class WhiterStringBuilder {
     
	  //使用string
	public String implicit(String[] fields){
		 String result = "";
		 for(int i =0; i < fields.length;i++){
			 result += fields[i];
		 }
		return result;
	}
	
	 //使用StringBuilder
	public String explicts(String[] fields){
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < fields.length; i++) {
			result.append(fields[i]);
		}
		return result.toString();
	}
	
	 //使用StringBuffer
		public String erplicts(String[] fields){
			StringBuffer result = new StringBuffer();
			for (int i = 0; i < fields.length; i++) {
				result.append(fields[i]);
			}
			return result.toString();
		}
	
}
//格式化String字符串
class SimpleFormat{
	
	public static void main(String[] args) {
		int x = 5;
		double y = 5.33254323;
		//old way 
		System.out.println("["+x+y+"]");
		//The new way
		System.out.format("[%d%f]\n", x,y);
		//or
		System.out.printf("[%d%f]\n", x,y);
		//匹配正则表达式
		System.out.println("-1234".matches("-?\\d+"));
		//使用正则表达式来切割字符串
	    
	}
}
