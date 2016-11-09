package cn.com.github.generic;

class Candy {
	static {
		System.out.println("Loan Candy");
	}
}

class Gum {
	static {
		System.out.println("Loan Gum");
	}
}

class Ragrok {
	static {
		System.out.println("Loan Ragrok");
	}
}

public class SwapShop {
	public static void main(String[] args) {
		new Candy();
	    try {
	    	//全路径名，报名+类名
			Class.forName("cn.com.github5.Gum");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		new Ragrok();
	}
}
