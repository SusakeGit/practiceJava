package cn.com.github.string;

class ThreeExceptin extends Exception {

}

public class FinallyWorks {
	static int count = 0;

	public static void main(String[] args) {
		while (true) {
			try {
				if (count++ == 0)
					throw new ThreeExceptin();
				System.out.println("No Exceptin");

			} catch (ThreeExceptin e) {
				// TODO: handle exception
				System.out.println("ThreeException");
			} finally {
				//finally里的内容每次都会执行一次
				System.out.println("In finnally Cause");
				if (count == 2)
					break;

			}
		}
	}
}
