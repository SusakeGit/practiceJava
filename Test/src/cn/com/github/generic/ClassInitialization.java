package cn.com.github.generic;

import java.util.Random;
 
class Initable{
	static final int staticFinal = 47;
	static final int staticFinal2 = ClassInitialization.staticfinal.nextInt(1000);

	static {
		System.out.println("ClassInitialization Initable");
	}
}

class Initable1 {
	static final int staticFinal = 147;

	static {
		System.out.println("ClassInitialization Initable1");
	}
}

class Initable2 {
	static int staticFinal = 175;

	static {
		System.out.println("ClassInitialization Initable2");
	}
}

public class ClassInitialization {
	static final Random staticfinal = new Random(47);
	public static void main(String[] args) throws Exception {
		       //需要的时候才被加载
               Class initable = Initable1.class;
               System.out.println("After create initable ref");
               System.out.println(Initable.staticFinal);
               System.out.println(Initable.staticFinal2);
               System.out.println(Initable1.staticFinal);
                 //class.forname立即初始化
               Class initable2= Class.forName("cn.com.github5.Initable2");
               System.out.println(Initable2.staticFinal);
	}
}