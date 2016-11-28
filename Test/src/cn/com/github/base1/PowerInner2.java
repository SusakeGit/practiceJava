package cn.com.github.base1;

class D {
}

abstract class E {
}

class Z extends D {
	// 使用内部类在另一个角度实现了同时继承两个类的特�?�，相当于开了个小号
	// 内部类的威力展现�?
	E makeE() {
		return new E() {

		};
	}
}

public class PowerInner2 {
	static void taskesD(D d) {

	}

	static void taskesE(E e) {

	}
	
	public static void main(String[] args) {
		Z z = new Z();
		taskesD(z);
		//相当于让z的一部分实现了e的特性，补全了单继承的缺�?
		taskesE(z.makeE());
	}
}
