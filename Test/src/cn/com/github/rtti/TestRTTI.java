package cn.com.github.rtti;

class Shape {
	public void draw() {
		System.out.println(this + "====:Shape Class");
	};
}

class Circle extends Shape {

	public void draw() {
		System.out.println(this + "====:Circle Class");
	}

}

class Triangle extends Shape {

	public void draw() {
		System.out.println(this + "====:Triangle Class");
	}

}
//新增的派生类
class Oblong  extends Shape {

	public void draw() {
		System.out.println(this + "====:Oblong Class");
	}

}

public class TestRTTI {
	public static void main(String[] args) {
          Shape shape = new Circle();
          shape.draw();
          shape = new Triangle();
          shape.draw();
          //引用新增的派生类
          shape = new Oblong();
          shape.draw();
	}
}