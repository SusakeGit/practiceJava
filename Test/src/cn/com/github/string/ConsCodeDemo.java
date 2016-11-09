package cn.com.github.string;

class TestPerson {
	private int age = 7;

	{
		age = 6;
		System.out.println("TestPerson constructor code run..." + age);
	}

	static {
		System.out.println("TestPerson constructor");
	}

	TestPerson() {
		this.age = 5;
		System.out.println("TestPerson() run..." + age);
	}
}

class Person extends TestPerson {
	private int age = 8;// 显示初始化
	private static int test = 1;// 这不是显示初始化。

	{// 构造代码块。给所有对象进行初始化，只要对象一建立，就会调用这个代码块。构造函数只给对应的对象进行初始化，它具有针对性。
		System.out.println("constructor code run..." + age);
		cry();// 将重载的构造函数的共性部分，放在构造代码块中。
	}

	static {// 静态代码块，只能访问静态成员。随着类的加载而执行，仅一次。
		test = 10;
		System.out.println("static code run..." + test);
	}

	Person() {
		// cry();
		/*
		 * 构造函数中,先执行隐式部分: 1,super();//调用父类构造函数 2,显示初始化。 3,构造代码块初始化。
		 */
		System.out.println("Person() run..." + age);// 构造函数自定义的初始化代码
	}

	Person(int age) {
		// cry();
		this.age = age;
		System.out.println("Person(age) run..." + age);
	}

	public void cry() {
		System.out.println("哇哇哇！");
	}
}

class ConsCodeDemo {
	public static void main(String[] args) {
		Person p1 = new Person();

		Person p2 = new Person(23);
		int x = 3;
		{// 局部代码块。可以控制局部变量的生命周期。
			// int x = 3;
			System.out.println("哈哈！");
		}
		System.out.println("x = " + x);
	}
}

// Console
/*
 * static code run...10 TestPerson constructor code run...6 TestPerson() run...5
 * constructor code run...8 哇哇哇！ Person() run...8 TestPerson constructor code
 * run...6 TestPerson() run...5 constructor code run...8 哇哇哇！ Person(age)
 * run...23 哈哈！ x = 3
 */
