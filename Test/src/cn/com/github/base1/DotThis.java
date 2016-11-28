package cn.com.github.base1;

public class DotThis {

	void f() {
		System.out.println("DontThis.f()");
	}

	public class Inners {
		public DotThis outer() {
			return DotThis.this;
		}
	}
	
	public Inners inners(){
		return new Inners();
	}
	
	//可以使用私有内部类来隐藏实现细节
	private class privateClass{
		private int i = 11;
		public int value(){
			return i;
		}
	}
	//可以使用保护类来隐藏实现细节
	protected class protectedClass{
		private int i = 10;
		public int value(){
			return i;
		}
	}
   
	public static void main(String[] args) {
		DotThis oDotThis = new DotThis();
		DotThis.Inners dti = oDotThis.inners();
		dti.outer().f();
		//创建内部类的对象必须通过使用外部类的对象来创�?
		DotThis.Inners dts = oDotThis.new Inners();
		dts.outer().f();
		//创建私有类的对象
		privateClass class1 = oDotThis.new privateClass();
		 int s = class1.value();
		 //10
		 System.out.println(s);
		//创建保护类型
		 protectedClass class2 = oDotThis.new protectedClass();
		 s = class2.value();
		 //10
		 System.out.println(s);
	}
}



