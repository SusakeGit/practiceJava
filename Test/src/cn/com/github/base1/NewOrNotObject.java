package cn.com.github.base1;

class NewObject {
	public StringBuffer newString() {
		StringBuffer buffer = new StringBuffer();
		buffer = PassValue.passvalue();
		return buffer;
	}
}

class NotNewObject {
	public StringBuffer newString() {
		StringBuffer buffer = null;
		//buffer 指向passvalue 中的buffer对象
		buffer = PassValue.passvalue();
		//不要上一句，直接�?
		//buffer.append("hello world");
		//eclipse会报警告，因为这是一个引用传�? ，eclipse并没有为buffer�?辟内存，也就是说没有对象�?
		return buffer;
	}
}

class PassValue {
	public static StringBuffer passvalue() {
		StringBuffer buffer = new StringBuffer();
		//buffer 指向passvalue 中的buffer对象
		buffer.append("hello world");
		return buffer;
	}
}

class QuoteObject{
	public StringBuffer newString() {
		StringBuffer buffer = null;
		//buffer 指向passvalue 中的buffer对象
		buffer = PassValue.passvalue();
		StringBuffer buffer2 = null;
		//buffer2 指向passvalue 中的buffer对象，复制了�?份引�?
		buffer2 = buffer;
		buffer2.append("hi,guys");
		return buffer2;
	}
}
public class NewOrNotObject {
	public static void main(String[] args) {
		NewObject newObject = new NewObject();
		System.out.println(newObject.newString());
		//hello world
		NotNewObject notNewObject = new NotNewObject();
		System.out.println(notNewObject.newString());
		//hello world
		QuoteObject object = new QuoteObject();
		System.out.println(object.newString());
		//hello worldhi guys
		//结论：buffer起一个引用传递的作用
	}
}


