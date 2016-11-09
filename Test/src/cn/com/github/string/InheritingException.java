package cn.com.github.string;

public class InheritingException {
	public void f() throws SimpleException {
		System.out.println("Thread SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		InheritingException sed = new InheritingException();
		try {
			sed.f();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Caught it!");
		}
	}
}