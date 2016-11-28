package cn.com.github.rtti;

class Initable {
	static {
		System.out.println("Loading Initable");
	}
}

class Initable1 {
	static {
		System.out.println("Loading Initable1");
	}
}

class Initable2 {
	static {
		System.out.println("Loading Initable2");
	}
}

public class ClassInit {
	public static void main(String[] args) {
		//使用.class来引用对像
         System.out.println(Initable.class);
         try {
        	 //使用Class.forName
			System.out.println(Class.forName("cn.com.github.rtti.Initable2"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
