package cn.com.github.rtti;

class Candy {
	static {
		System.out.println("Loanding Candy");
	}
}

class Gum {
	static {
		System.out.println("Loanding Gum");
	}
}

class Cookie {
	static {
		System.out.println("Loanding Cookie");
	}
}

public class SweetShop {
      public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After createing Candy");
		try {
			Class.forName("cn.com.github.rtti.Gum");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Can't found Gum");
		}
		System.out.println("After class.forName(Gum)");
		new Cookie();
		System.out.println("After createing cookie");
	}   
}
