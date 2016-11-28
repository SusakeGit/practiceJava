package cn.com.github.rtti;

interface Interface {
	void doSomethin();
	void somethingElse(String arg);
}

class RealObject implements Interface {

	@Override
	public void doSomethin() {
		// TODO Auto-generated method stub
		System.out.println("Do Something");
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("somethingElse:" + arg);
	}

}

class SimpleProxyDemo implements Interface {

	private Interface proied;

	@Override
	public void doSomethin() {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxyDemo doSomething"); 
		proied.doSomethin();
	}

	@Override
	public void somethingElse(String arg) {
		// TODO Auto-generated method stub
		System.out.println("SimpleProxyDemo doSomethin:" + arg);          
		proied.somethingElse(arg);
	}

	public SimpleProxyDemo(Interface proied) {
		this.proied = proied;
	}

}

public class SimpleProxyTest {
	public static void consumer(Interface interface1) {
		interface1.doSomethin();
		interface1.somethingElse("ragrok"); 
	}

	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxyDemo(new RealObject())); 
	}
}