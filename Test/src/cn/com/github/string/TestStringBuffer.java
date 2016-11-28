package cn.com.github.string;

public class TestStringBuffer {
	public static void testAppend() {
        StringBuffer buffer = new StringBuffer("Init-");
        buffer.append("Buffer-");
        buffer.append("Entity");
        System.out.println(buffer.toString());
        //Init-Buffer-Entity
	}
	
	public static void testDelete() {
        StringBuffer buffer = new StringBuffer("Init-");
        buffer.append("Buffer-");
        buffer.append("Entity");
        buffer.delete(2, buffer.length() - 7);
        System.out.println(buffer.toString());
        //In-Entity
	}
	
	
	public static void testInsert() {
        StringBuffer buffer = new StringBuffer("Init-");
        buffer.append("Buffer-");
        buffer.append("Entity-");
        buffer.insert(3,buffer.length()-1).append("Insert value");
        System.out.println(buffer.toString());
        //Ini18t-Buffer-Entity-Insert value
	}
	
	
	public static void testReplace() {
        StringBuffer buffer = new StringBuffer("Init-");
        buffer.append("Buffer-");
        buffer.append("Entity");
        buffer.replace(2, buffer.length() -5, "replace value");
        System.out.println(buffer.toString());
        //Inreplace valuentity
	}
	
	public static void main(String[] args) {
//		testAppend();
//		testDelete();
//		testInsert();
		testReplace();
	}
}
