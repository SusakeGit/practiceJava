package cn.com.github.string;

public class Singleton {
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1 == s2);

		SuperMan man1 = SuperMan.getInstance();
		SuperMan man2 = SuperMan.getInstance();
		System.out.println(man1 == man2);
		man2.setName("英雄");
		System.out.println("man1 name =" + man1.getName());
		System.out.println("man2 name =" + man2.getName());
	}
}


class Single {
	// 饿汉式
	private static final Single s = new Single();

	// 私有化
	private Single() {
	}

	// 对外提供可控方法，让其他程序可以获取到
	public synchronized static Single getInstance() {
		return s;
	}
}

//http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/

// 另一种形式,延迟加载,懒汉式
class SingleCopy {
	private static SingleCopy s = null;

	private SingleCopy() {
	}

	private synchronized static SingleCopy getInstance() {
		if (s == null) {
			s = new SingleCopy();
		}
		return s;
	}
}
 //静态内部类，保证多线程安全
class SingletonCopy{
	private static class SingletonHondler{
		private static final SingletonCopy INSTANCE = new SingletonCopy();
	}
	private SingletonCopy (){}
	public static final SingletonCopy getInstance(){
		return SingletonHondler.INSTANCE;
	}
}

class SuperMan {
	private String name;
	private static SuperMan man = new SuperMan("克拉克");

	private SuperMan(String name) {
		this.name = name;
	}

	public static SuperMan getInstance() {
		return man;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}