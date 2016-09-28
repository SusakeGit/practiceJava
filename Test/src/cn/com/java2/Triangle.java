package cn.com.java2;

import cn.com.base.Print;

public class Triangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
       Print.Print("triangle draw");
	}

	@Override
	public void erase() {
		// TODO Auto-generated method stub
		Print.Print("triangle erase");
	}
	

}
