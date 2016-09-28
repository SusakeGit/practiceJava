package cn.com.java2;

import cn.com.base.Print;

public class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		Print.Print("circle draw");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
         Print.Print("erase draw");         
	}
       
	 
}
