package cn.com.github;

//使用内部类来实现多重继承
interface A {
}

interface B {
}

class X implements A, B {

}

class Y implements A {
	B makeb() {
		// 创建内部类，相当于又开了个口子，让内部类来实现外围类不能做的事，使整个类的机制更加灵活
		// 例如继承一个类的时候又能继承另一个类
		return new B() {

		};
	}
}

public class PowerInner {
	static void taskesA(A a) {

	}

	static void taskesB(B b) {

	}

	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		taskesA(x);
		taskesA(y);
		taskesB(x);
		taskesB(y.makeb());
	}
}
