package cn.com.github.java2;


public class Stack_over {
     
	private String name;
	private int age;
	
	public Stack_over() {
		this("haah");
		this.name = "haha";
		this.age = 1;
		System.out.println("run");
	}
	public Stack_over(String name){
		//java ���Զ���ѭ�����ô���
        //this();
		this.name = name;
	}
	
	public static void main(String[] args) {
		new Stack_over();
	}
}
