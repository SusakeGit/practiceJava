package cn.com.github.string;

import cn.com.java2.static_final;

class Car{
	int num;
	String color;
	void run(){
		System.out.println(num+"|"+color);
	}
}

public class CarDemo {
     public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.run();
		show(c2);
		show(c1);
		show(new Car());
		
	}
     
     public static void show(Car c){
    	 System.out.println(c);
    	 c.num = 4;
    	 c.color = "black";
    	 c.run();
     }
}
